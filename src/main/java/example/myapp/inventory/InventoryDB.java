package example.myapp.inventory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InventoryDB {

    // Define the InventoryRecord class
    public static class InventoryRecord {
        public String name;
        String description;
        String unitPrice;
        int quantityInStock;
        int inventoryValue;
        int reorderLevel;
        int reorderTimeInDays;
        int quantityInReorder;
        String discontinued;

        // Constructor
        public InventoryRecord(String name, String description, String unitPrice,
                               int quantityInStock, int inventoryValue,
                               int reorderLevel, int reorderTimeInDays,
                               int quantityInReorder, String discontinued) {
            this.name = name;
            this.description = description;
            this.unitPrice = unitPrice;
            this.quantityInStock = quantityInStock;
            this.inventoryValue = inventoryValue;
            this.reorderLevel = reorderLevel;
            this.reorderTimeInDays = reorderTimeInDays;
            this.quantityInReorder = quantityInReorder;
            this.discontinued = discontinued;
        }

        public String getNameRecord() {
            return name;
        }

        public void setNameRecord(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getUnitPrice() {
            return unitPrice;
        }

        public void setUnitPrice(String unitPrice) {
            this.unitPrice = unitPrice;
        }

        public int getQuantityInStock() {
            return quantityInStock;
        }

        public void setQuantityInStock(int quantityInStock) {
            this.quantityInStock = quantityInStock;
        }

        public int getInventoryValue() {
            return inventoryValue;
        }

        public void setInventoryValue(int inventoryValue) {
            this.inventoryValue = inventoryValue;
        }

        public int getReorderLevel() {
            return reorderLevel;
        }

        public void setReorderLevel(int reorderLevel) {
            this.reorderLevel = reorderLevel;
        }

        public int getReorderTimeInDays() {
            return reorderTimeInDays;
        }

        public void setReorderTimeInDays(int reorderTimeInDays) {
            this.reorderTimeInDays = reorderTimeInDays;
        }

        public int getQuantityInReorder() {
            return quantityInReorder;
        }

        public void setQuantityInReorder(int quantityInReorder) {
            this.quantityInReorder = quantityInReorder;
        }

        public String getDiscontinued() {
            return discontinued;
        }

        public void setDiscontinued(String discontinued) {
            this.discontinued = discontinued;
        }
    }


    public static class InventoryManager {
        public HashMap<String, InventoryRecord> inventoryHashMap = new HashMap<>();

        // method to populate the inventoryHashMap
        public void addInventoryRecord(String ID, InventoryRecord record) {
            inventoryHashMap.put(ID, record);
        }


        public InventoryRecord searchByID(String ID) {
            InventoryRecord result = inventoryHashMap.get(ID);
            if (result != null) {
                return result;
            } else {
                return null;
            }

        }

        public <E> InventoryRecord search(String keyName, E keyValue) {
            for (InventoryRecord record : inventoryHashMap.values()) {
                E attributeValue = matchRecordAttribute(record, keyName);
                if (attributeValue != null && attributeValue.equals(keyValue)) {
                    return record;
                }
            }
            return null; // Record not found
        }

//        public <E extends Comparable<E>> InventoryRecord[] search(String Key_Name, E Key_Value_start, E Key_Value_end) {
//            List<InventoryRecord> matchingRecords = new ArrayList<>();
//
//            for (InventoryRecord record : inventoryHashMap.values()) {
//                E attributeValue = matchRecordAttribute(record, Key_Name);
//                if (attributeValue != null && isInRange(attributeValue, Key_Value_start, Key_Value_end)) {
//                    matchingRecords.add(record);
//                }
//            }
//
//            return matchingRecords.toArray(new InventoryRecord[0]);
//        }
//
//        private <E> boolean isInRange(E value, E start, E end) {
//            if (value instanceof Comparable) {
//                Comparable<E> comparableValue = (Comparable<E>) value;
//
//                if ((start == null || comparableValue.compareTo(start) >= 0) &&
//                        (end == null || comparableValue.compareTo(end) <= 0)) {
//                    return true;
//                }
//            }
//
//            // Handle non-comparable types or null values
//            return false;
//        }

        public <E extends Comparable<E>> InventoryRecord[] search(String Key_Name, E Key_Value_start, E Key_Value_end) {
            List<InventoryRecord> matchingRecords = new ArrayList<>();

            for (InventoryRecord record : inventoryHashMap.values()) {
                E attributeValue = matchRecordAttribute(record, Key_Name);
                if (attributeValue != null && isInRange(attributeValue, Key_Value_start, Key_Value_end)) {
                    matchingRecords.add(record);
                }
            }

            return matchingRecords.toArray(new InventoryRecord[0]);
        }

        private <E> boolean isInRange(E value, E start, E end) {
            if (value instanceof Comparable) {
                Comparable<E> comparableValue = (Comparable<E>) value;

                // Convert start and end values to the same type as value, if they are not null
                if (start != null) {
                    start = (E) convertToComparableType(value, start);
                }
                if (end != null) {
                    end = (E) convertToComparableType(value, end);
                }

                if ((start == null || comparableValue.compareTo(start) >= 0) &&
                        (end == null || comparableValue.compareTo(end) <= 0)) {
                    return true;
                }
            }

            // Handle non-comparable types or null values
            return false;
        }

        @SuppressWarnings("unchecked")
        private <E> E convertToComparableType(E value, E original) {
            if (value instanceof Integer) {
                return (E) Integer.valueOf(original.toString());
            } else if (value instanceof Double) {
                return (E) Double.valueOf(original.toString());
            }
            // Add more type conversions if needed

            return original; // Default case
        }



        public Object getDistribution(String keyName, double percentileValue){
            InventoryRecord result = inventoryHashMap.get(keyName);
            if (result != null) {
                return percentileValue * result.inventoryValue;
            }
            return null;

        }

        public boolean update(String keyName, String attributeName, String newValue) {
            InventoryRecord record = inventoryHashMap.get(keyName);
            if (record != null) {
                switch (attributeName) {
                    case "name":
                        record.setNameRecord(newValue);
                        break;
                    case "description":
                        record.setDescription(newValue);
                        break;
                    case "unitPrice":
                        record.setUnitPrice(newValue);
                        break;
                    case "quantityInStock":
                        record.setQuantityInStock(Integer.parseInt(newValue));
                        break;
                    case "inventoryValue":
                        record.setInventoryValue(Integer.parseInt(newValue));
                        break;
                    case "reorderLevel":
                        record.setReorderLevel(Integer.parseInt(newValue));
                        break;
                    case "reorderTimeInDays":
                        record.setReorderTimeInDays(Integer.parseInt(newValue));
                        break;
                    case "quantityInReorder":
                        record.setQuantityInReorder(Integer.parseInt(newValue));
                        break;
                    case "discontinued":
                        record.setDiscontinued(newValue);
                        break;
                    default:
                        return false; // Unknown attribute
                }
                return true; // Update successful
            } else {
                return false; // Key not found
            }
        }

        private <E> E matchRecordAttribute(InventoryRecord record, String keyValue) {
            switch (keyValue) {
                case "name":
                    return (E) record.name;
                case "description":
                    return (E) record.description;
                case "unitPrice":
                    return (E) record.unitPrice;
                case "quantityInStock":
                    return (E) Integer.valueOf(record.quantityInStock);
                case "inventoryValue":
                    return (E) Integer.valueOf(record.inventoryValue);
                case "reorderLevel":
                    return (E) Integer.valueOf(record.reorderLevel);
                case "reorderTimeInDays":
                    return (E) Integer.valueOf(record.reorderTimeInDays);
                case "quantityInReorder":
                    return (E) Integer.valueOf(record.quantityInReorder);
                case "discontinued":
                    return (E) record.discontinued;
                default:
                    return null; // Unknown key
            }
        }
    }

    public static void main(String[] args) {
        // Create an instance of InventoryManager
        InventoryManager inventoryManager = new InventoryManager();

        // Add the existing inventory data
        inventoryManager.addInventoryRecord("IN0001", new InventoryRecord("Item 1", "Desc 1", "$51.00", 25, 1275, 29, 13, 50, ""));
        inventoryManager.addInventoryRecord("IN0002", new InventoryRecord("Item 2", "Desc 2", "$93.00", 132, 12276, 231, 4, 50, ""));
        inventoryManager.addInventoryRecord("IN0003", new InventoryRecord("Item 3", "Desc 3", "$57.00", 151, 8607, 114, 11, 150, ""));
        inventoryManager.addInventoryRecord("IN0004", new InventoryRecord("Item 4", "Desc 4", "$19.00", 186, 3534, 158, 6, 50, ""));
        inventoryManager.addInventoryRecord("IN0005", new InventoryRecord("Item 5", "Desc 5", "$75.00", 62, 4650, 39, 12, 50, ""));
        inventoryManager.addInventoryRecord("IN0006", new InventoryRecord("Item 6", "Desc 6", "$11.00", 5, 55, 9, 13, 150, ""));
        inventoryManager.addInventoryRecord("IN0007", new InventoryRecord("Item 7", "Desc 7", "$56.00", 58, 3248, 109, 7, 100, "Yes"));
        inventoryManager.addInventoryRecord("IN0008", new InventoryRecord("Item 8", "Desc 8", "$38.00", 101, 3838, 162, 3, 100, ""));
        inventoryManager.addInventoryRecord("IN0009", new InventoryRecord("Item 9", "Desc 9", "$59.00", 122, 7198, 82, 3, 150, ""));
        inventoryManager.addInventoryRecord("IN0010", new InventoryRecord("Item 10", "Desc 10", "$50.00", 175, 8750, 283, 8, 150, ""));
        inventoryManager.addInventoryRecord("IN0011", new InventoryRecord("Item 11", "Desc 11", "$59.00", 176, 10384, 229, 1, 100, ""));
        inventoryManager.addInventoryRecord("IN0012", new InventoryRecord("Item 12", "Desc 12", "$18.00", 22, 396, 36, 12, 50, ""));
        inventoryManager.addInventoryRecord("IN0013", new InventoryRecord("Item 13", "Desc 13", "$26.00", 72, 1872, 102, 9, 100, ""));
        inventoryManager.addInventoryRecord("IN0014", new InventoryRecord("Item 14", "Desc 14", "$42.00", 62, 2604, 83, 2, 100, ""));
        inventoryManager.addInventoryRecord("IN0015", new InventoryRecord("Item 15", "Desc 15", "$32.00", 46, 1472, 23, 15, 50, ""));
        inventoryManager.addInventoryRecord("IN0016", new InventoryRecord("Item 16", "Desc 16", "$90.00", 96, 8640, 180, 3, 50, ""));
        inventoryManager.addInventoryRecord("IN0017", new InventoryRecord("Item 17", "Desc 17", "$97.00", 57, 5529, 98, 12, 50, "Yes"));
        inventoryManager.addInventoryRecord("IN0018", new InventoryRecord("Item 18", "Desc 18", "$12.00", 6, 72, 7, 13, 50, ""));
        inventoryManager.addInventoryRecord("IN0019", new InventoryRecord("Item 19", "Desc 19", "$82.00", 143, 11726, 164, 12, 150, ""));
        inventoryManager.addInventoryRecord("IN0020", new InventoryRecord("Item 20", "Desc 20", "$16.00", 124, 1984, 113, 14, 50, ""));
        inventoryManager.addInventoryRecord("IN0021", new InventoryRecord("Item 21", "Desc 21", "$19.00", 112, 2128, 75, 11, 50, ""));
        inventoryManager.addInventoryRecord("IN0022", new InventoryRecord("Item 22", "Desc 22", "$24.00", 182, 4368, 132, 15, 150, ""));
        inventoryManager.addInventoryRecord("IN0023", new InventoryRecord("Item 23", "Desc 23", "$29.00", 106, 3074, 142, 1, 150, "Yes"));
        inventoryManager.addInventoryRecord("IN0024", new InventoryRecord("Item 24", "Desc 24", "$75.00", 173, 12975, 127, 9, 100, ""));
        inventoryManager.addInventoryRecord("IN0025", new InventoryRecord("Item 25", "Desc 25", "$14.00", 28, 392, 21, 8, 50, ""));



        inventoryManager.searchByID("IN0023");
    }
}