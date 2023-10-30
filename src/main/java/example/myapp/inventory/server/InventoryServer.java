package example.myapp.inventory.server;

import com.google.protobuf.Empty;
import example.myapp.inventory.InventoryDB;

import example.myapp.inventory.grpc.*;
import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class InventoryServer {

    private final int port;
    private final Server server;

    public InventoryServer(int port) {
        this.port = port;
        this.server = ServerBuilder.forPort(port)
                .addService((BindableService) new InventoryServiceImpl())
                .build();
    }

    public void start() throws Exception {
        server.start();
        System.out.println("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutting down gRPC server since JVM is shutting down.");
            InventoryServer.this.stop();
        }));
        server.awaitTermination();
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    public static class InventoryServiceImpl extends InventoryServiceGrpc.InventoryServiceImplBase {

        private final InventoryDB.InventoryManager inventoryManager = new InventoryDB.InventoryManager();

        @Override
        public void addInventoryRecord(AddInventoryRecordRequest request, StreamObserver<Empty> responseObserver) {
            String ID = request.getID();
            InventoryRecord record = request.getRecord();

            inventoryManager.addInventoryRecord(ID, new InventoryDB.InventoryRecord(
                    record.getName(),
                    record.getDescription(),
                    record.getUnitPrice(),
                    record.getQuantityInStock(),
                    record.getInventoryValue(),
                    record.getReorderLevel(),
                    record.getReorderTimeInDays(),
                    record.getQuantityInReorder(),
                    record.getDiscontinued()
            ));

            responseObserver.onNext(Empty.getDefaultInstance());
            responseObserver.onCompleted();
        }

        @Override
        public void updateInventoryAttribute(UpdateInventoryAttributeRequest request, StreamObserver<Empty> responseObserver) {
            String keyName = request.getKeyName();
            String attributeName = request.getAttributeName();
            String newValue = request.getNewValue();
            boolean success = inventoryManager.update(keyName, attributeName, newValue);
            if (success) {
                responseObserver.onNext(Empty.getDefaultInstance());
            } else {
                responseObserver.onError(new Exception("Failed to update record."));
            }
            responseObserver.onCompleted();
        }

        @Override
        public void searchByID(SearchByIDRequest request, StreamObserver<SearchResponse> responseObserver) {
            String ID = request.getID();
            InventoryDB.InventoryRecord record = inventoryManager.searchByID(ID);

            if (record != null) {
                SearchResponse response = SearchResponse.newBuilder()
                        .setRecord(InventoryRecord.newBuilder()
                                .setName(record.name)
                                .setDescription(record.getDescription())
                                .setUnitPrice(record.getUnitPrice())
                                .setQuantityInStock(record.getQuantityInStock())
                                .setInventoryValue(record.getInventoryValue())
                                .setReorderLevel(record.getReorderLevel())
                                .setReorderTimeInDays(record.getReorderTimeInDays())
                                .setQuantityInReorder(record.getQuantityInReorder())
                                .setDiscontinued(record.getDiscontinued())
                                .build())
                        .build();
                responseObserver.onNext(response);
            } else {
                responseObserver.onNext(SearchResponse.newBuilder().build()); // Empty response if record not found
            }

            responseObserver.onCompleted();
        }

        @Override
        public void searchByKeyValue(SearchByKeyValueRequest request, StreamObserver<SearchResponse> responseObserver) {
            String keyName = request.getKeyName();
            String keyValue = request.getKeyValue();
            InventoryDB.InventoryRecord record = inventoryManager.search(keyName, keyValue);

            if (record != null) {
                SearchResponse response = SearchResponse.newBuilder()
                        .setRecord(InventoryRecord.newBuilder()
                                .setName(record.name)
                                .setDescription(record.getDescription())
                                .setUnitPrice(record.getUnitPrice())
                                .setQuantityInStock(record.getQuantityInStock())
                                .setInventoryValue(record.getInventoryValue())
                                .setReorderLevel(record.getReorderLevel())
                                .setReorderTimeInDays(record.getReorderTimeInDays())
                                .setQuantityInReorder(record.getQuantityInReorder())
                                .setDiscontinued(record.getDiscontinued())
                                .build())
                        .build();
                responseObserver.onNext(response);
            } else {
                responseObserver.onNext(SearchResponse.newBuilder().build()); // Empty response if record not found
            }

            responseObserver.onCompleted();
        }

        @Override
        public void getDistribution(GetDistributionRequest request, StreamObserver<GetDistributionResponse> responseObserver) {
            String keyName = request.getKeyName();
            double percentileValue = request.getPercentileValue();
            Object distributionValue = inventoryManager.getDistribution(keyName, percentileValue);

            if (distributionValue != null) {
                double result = (double) distributionValue;
                GetDistributionResponse response = GetDistributionResponse.newBuilder()
                        .setDistributionValue(result)
                        .build();
                responseObserver.onNext(response);
            } else {
                responseObserver.onError(new Exception("Failed to calculate distribution."));
            }

            responseObserver.onCompleted();
        }

        @Override
        public void search(SearchRangeRequest request, StreamObserver<SearchRangeResponse> responseObserver) {
            String keyName = request.getKeyName();
            String keyStartValue = request.getKeyStartValue();
            String keyEndValue = request.getKeyEndValue();

            InventoryDB.InventoryRecord[] records = inventoryManager.search(keyName, keyStartValue, keyEndValue);

            SearchRangeResponse.Builder responseBuilder = SearchRangeResponse.newBuilder();
            for (InventoryDB.InventoryRecord record : records) {
                responseBuilder.addRecords(InventoryRecord.newBuilder()
                        .setName(record.name)
                        .setDescription(record.getDescription())
                        .setUnitPrice(record.getUnitPrice())
                        .setQuantityInStock(record.getQuantityInStock())
                        .setInventoryValue(record.getInventoryValue())
                        .setReorderLevel(record.getReorderLevel())
                        .setReorderTimeInDays(record.getReorderTimeInDays())
                        .setQuantityInReorder(record.getQuantityInReorder())
                        .setDiscontinued(record.getDiscontinued())
                        .build());
            }

            responseObserver.onNext(responseBuilder.build());
            responseObserver.onCompleted();
        }

    }

    public static void main(String[] args) throws Exception {
        // Replace 50051 with the appropriate port for the gRPC server
        InventoryServer server = new InventoryServer(50051);
        server.start();
    }
}
