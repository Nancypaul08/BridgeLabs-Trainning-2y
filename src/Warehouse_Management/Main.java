package Warehouse_Management;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Storage for Electronics
        Storage<Electronics> electronicStorage = new Storage<>();
        electronicStorage.addItem(new Electronics("Laptop"));
        electronicStorage.addItem(new Electronics("Smartphone"));

        // Storage for Groceries
        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Rice"));
        groceryStorage.addItem(new Groceries("Sugar"));

        // Storage for Furniture
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Sofa"));
        furnitureStorage.addItem(new Furniture("Dining Table"));

        // Display all items using wildcard method
        WarehouseDisplay.displayItems(electronicStorage.getItems());
        WarehouseDisplay.displayItems(groceryStorage.getItems());
        WarehouseDisplay.displayItems(furnitureStorage.getItems());
    }
}

