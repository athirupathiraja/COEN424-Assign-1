package example.myapp.inventory.client;

import com.google.protobuf.Empty;
import example.myapp.inventory.grpc.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class InventoryClient {

    public static void main(String[] args) {
        // Replace 50051 with the appropriate port for the gRPC server
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        try {
            // Create a blocking stub
            InventoryServiceGrpc.InventoryServiceBlockingStub blockingStub = InventoryServiceGrpc.newBlockingStub(channel);

            AddInventoryRecordRequest addRequest = AddInventoryRecordRequest.newBuilder()
                    .setID("IN0026")
                    .setRecord(InventoryRecord.newBuilder()
                            .setName("Item 26")
                            .setDescription("Desc 26")
                            .setUnitPrice("$30.00")
                            .setQuantityInStock(50)
                            .setInventoryValue(1500)
                            .setReorderLevel(20)
                            .setReorderTimeInDays(10)
                            .setQuantityInReorder(30)
                            .setDiscontinued("No")
                            .build())
                    .build();

            Empty addResponse = blockingStub.addInventoryRecord(addRequest);
            System.out.println("Add Inventory Record Response: " + addResponse);

            // Example: Searching for a record by ID
            SearchByIDRequest searchByIDRequest = SearchByIDRequest.newBuilder()
                    .setID("IN0026")
                    .build();

            SearchResponse searchByIDResponse = blockingStub.searchByID(searchByIDRequest);
            System.out.println("Search By ID Response: " + searchByIDResponse);

            // Add more client calls

        } finally {
            channel.shutdown();
        }
    }
}
