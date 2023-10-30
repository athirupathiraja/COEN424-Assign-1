package example.myapp.inventory.client;

import com.google.protobuf.Empty;
import example.myapp.inventory.InventoryDB;
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

            InventoryDB.InventoryManager inventoryManager = new InventoryDB.InventoryManager();

            // Add the existing inventory data to the gRPC server
            addInventoryRecord(blockingStub, inventoryManager, "IN0001", "Item 1", "Desc 1", "$51.00", 25, 1275, 29, 13, 50, "");
            addInventoryRecord(blockingStub, inventoryManager, "IN0002", "Item 2", "Desc 2", "$93.00", 132, 12276, 231, 4, 50, "");
            addInventoryRecord(blockingStub, inventoryManager, "IN0003", "Item 3", "Desc 3", "$57.00", 151, 8607, 114, 11, 150, "");
            addInventoryRecord(blockingStub, inventoryManager, "IN0004", "Item 4", "Desc 4", "$19.00", 186, 3534, 158, 6, 50, "");
            addInventoryRecord(blockingStub, inventoryManager, "IN0005", "Item 5", "Desc 5", "$75.00", 62, 4650, 39, 12, 50, "");
            addInventoryRecord(blockingStub, inventoryManager, "IN0006", "Item 6", "Desc 6", "$11.00", 5, 55, 9, 13, 150, "");
            addInventoryRecord(blockingStub, inventoryManager, "IN0007", "Item 7", "Desc 7", "$56.00", 58, 3248, 109, 7, 100, "Yes");
            addInventoryRecord(blockingStub, inventoryManager, "IN0008", "Item 8", "Desc 8", "$38.00", 101, 3838, 162, 3, 100, "");
            addInventoryRecord(blockingStub, inventoryManager, "IN0009", "Item 9", "Desc 9", "$59.00", 122, 7198, 82, 3, 150, "");
            addInventoryRecord(blockingStub, inventoryManager, "IN0010", "Item 10", "Desc 10", "$50.00", 175, 8750, 283, 8, 150, "");
            addInventoryRecord(blockingStub, inventoryManager, "IN0011", "Item 11", "Desc 11", "$59.00", 176, 10384, 229, 1, 100, "");
            addInventoryRecord(blockingStub, inventoryManager, "IN0012", "Item 12", "Desc 12", "$18.00", 22, 396, 36, 12, 50, "");
            addInventoryRecord(blockingStub, inventoryManager, "IN0013", "Item 13", "Desc 13", "$26.00", 72, 1872, 102, 9, 100, "");
            addInventoryRecord(blockingStub, inventoryManager, "IN0014", "Item 14", "Desc 14", "$42.00", 62, 2604, 83, 2, 100, "");
            addInventoryRecord(blockingStub, inventoryManager, "IN0015", "Item 15", "Desc 15", "$32.00", 46, 1472, 23, 15, 50, "");
            addInventoryRecord(blockingStub, inventoryManager, "IN0016", "Item 16", "Desc 16", "$90.00", 96, 8640, 180, 3, 50, "");
            addInventoryRecord(blockingStub, inventoryManager, "IN0017", "Item 17", "Desc 17", "$97.00", 57, 5529, 98, 12, 50, "Yes");
            addInventoryRecord(blockingStub, inventoryManager, "IN0018", "Item 18", "Desc 18", "$12.00", 6, 72, 7, 13, 50, "");
            addInventoryRecord(blockingStub, inventoryManager, "IN0019", "Item 19", "Desc 19", "$82.00", 143, 11726, 164, 12, 150, "");
            addInventoryRecord(blockingStub, inventoryManager, "IN0020", "Item 20", "Desc 20", "$16.00", 124, 1984, 113, 14, 50, "");
            addInventoryRecord(blockingStub, inventoryManager, "IN0021", "Item 21", "Desc 21", "$19.00", 112, 2128, 75, 11, 50, "");
            addInventoryRecord(blockingStub, inventoryManager, "IN0022", "Item 22", "Desc 22", "$24.00", 182, 4368, 132, 15, 150, "");
            addInventoryRecord(blockingStub, inventoryManager, "IN0023", "Item 23", "Desc 23", "$29.00", 106, 3074, 142, 1, 150, "Yes");
            addInventoryRecord(blockingStub, inventoryManager, "IN0024", "Item 24", "Desc 24", "$75.00", 173, 12975, 127, 9, 100, "");
            addInventoryRecord(blockingStub, inventoryManager, "IN0025", "Item 25", "Desc 25", "$14.00", 28, 392, 21, 8, 50, "");
            addInventoryRecord(blockingStub, inventoryManager, "IN0026", "Item 26", "Desc 26", "$30.00", 50, 1500, 20, 10, 30, "No");
            addInventoryRecord(blockingStub, inventoryManager, "IN0027", "Item 27", "Desc 27", "$40.00", 60, 1800, 25, 12, 40, "No");



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

            UpdateInventoryAttributeRequest updateRequest = UpdateInventoryAttributeRequest.newBuilder()
                    .setKeyName("IN0026")
                    .setAttributeName("quantityInStock")
                    .setNewValue("60")
                    .build();

            Empty updateResponse = blockingStub.updateInventoryAttribute(updateRequest);
            System.out.println("Update Inventory Attribute Response: " + updateResponse);

// Example: Searching for a record by key and value
            SearchByKeyValueRequest searchByKeyValueRequest = SearchByKeyValueRequest.newBuilder()
                    .setKeyName("name")
                    .setKeyValue("Item 26")
                    .build();

            SearchResponse searchByKeyValueResponse = blockingStub.searchByKeyValue(searchByKeyValueRequest);
            System.out.println("Search By Key and Value Response: " + searchByKeyValueResponse);

// Example: Getting distribution for a record
            GetDistributionRequest getDistributionRequest = GetDistributionRequest.newBuilder()
                    .setKeyName("IN0026")
                    .setPercentileValue(0.9)
                    .build();

            GetDistributionResponse getDistributionResponse = blockingStub.getDistribution(getDistributionRequest);
            System.out.println("Get Distribution Response: " + getDistributionResponse);

            SearchRangeRequest searchRangeRequest = SearchRangeRequest.newBuilder()
                    .setKeyName("inventoryValue")
                    .setKeyStartValue("1000")
                    .setKeyEndValue("5000")
                    .build();

            SearchRangeResponse searchRangeResponse = blockingStub.search(searchRangeRequest);
            System.out.println("Search Range Response: " + searchRangeResponse);


        } finally {
            channel.shutdown();
        }
    }
    private static void addInventoryRecord(InventoryServiceGrpc.InventoryServiceBlockingStub blockingStub,
                                           InventoryDB.InventoryManager inventoryManager,
                                           String id, String name, String description,
                                           String unitPrice, int quantityInStock,
                                           int inventoryValue, int reorderLevel,
                                           int reorderTimeInDays, int quantityInReorder,
                                           String discontinued) {

        // Add the record to the local inventoryManager
        inventoryManager.addInventoryRecord(id, new InventoryDB.InventoryRecord(name, description, unitPrice,
                quantityInStock, inventoryValue, reorderLevel, reorderTimeInDays, quantityInReorder, discontinued));

        // Add the record to the gRPC server
        AddInventoryRecordRequest addRequest = AddInventoryRecordRequest.newBuilder()
                .setID(id)
                .setRecord(InventoryRecord.newBuilder()
                        .setName(name)
                        .setDescription(description)
                        .setUnitPrice(unitPrice)
                        .setQuantityInStock(quantityInStock)
                        .setInventoryValue(inventoryValue)
                        .setReorderLevel(reorderLevel)
                        .setReorderTimeInDays(reorderTimeInDays)
                        .setQuantityInReorder(quantityInReorder)
                        .setDiscontinued(discontinued)
                        .build())
                .build();

        Empty addResponse = blockingStub.addInventoryRecord(addRequest);
        System.out.println("Add Inventory Record Response: " + addResponse);
    }
}
