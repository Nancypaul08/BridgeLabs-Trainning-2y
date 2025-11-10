package Warehouse_Management;

import java.util.List;

class WarehouseDisplay {
    public static void displayItems(List<? extends WarehouseItem> itemList) {
        System.out.println("Displaying Stored Items:");
        for (WarehouseItem item : itemList) {
            item.showDetails();
        }
    }
}
