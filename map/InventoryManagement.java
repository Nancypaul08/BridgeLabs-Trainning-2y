package map;

import java.util.*;

public class InventoryManagement {

    public static void main(String[] args) {

        Map<String, Integer> inventory = new HashMap<>();

        // 1. Add new products
        inventory.put("Apples", 50);
        inventory.put("Bananas", 30);
        inventory.put("Mangoes", 20);

        System.out.println("Initial Inventory: " + inventory);

        // 2. Customer buys products
        sellProduct(inventory, "Apples", 10);
        sellProduct(inventory, "Bananas", 35); // force out of stock
        sellProduct(inventory, "Mangoes", 5);

        System.out.println("After Sales: " + inventory);

        // 3. New shipment arrives
        addShipment(inventory, "Bananas", 25);
        addShipment(inventory, "Mangoes", 40);

        System.out.println("After Shipment: " + inventory);

        // 4. Manager queries product
        queryProduct(inventory, "Apples");
        queryProduct(inventory, "Bananas");
        queryProduct(inventory, "Oranges");  // not stocked

        // Print out-of-stock items
        printOutOfStock(inventory);
    }

    // Reduce quantity
    public static void sellProduct(Map<String, Integer> inventory, String product, int quantity) {
        if (!inventory.containsKey(product)) {
            System.out.println(product + " is not stocked.");
            return;
        }

        int current = inventory.get(product);
        int newQty = current - quantity;

        if (newQty <= 0) {
            inventory.put(product, 0); // or remove(product)
            System.out.println(product + " is now OUT OF STOCK.");
        } else {
            inventory.put(product, newQty);
            System.out.println("Sold " + quantity + " " + product + "(s). New Quantity: " + newQty);
        }
    }

    // Increase quantity
    public static void addShipment(Map<String, Integer> inventory, String product, int quantity) {
        int newQty = inventory.getOrDefault(product, 0) + quantity;
        inventory.put(product, newQty);
        System.out.println("Shipment added: " + product + " +" + quantity + " (Total: " + newQty + ")");
    }

    // Query remaining stock
    public static void queryProduct(Map<String, Integer> inventory, String product) {
        if (!inventory.containsKey(product)) {
            System.out.println(product + " is not stocked.");
        } else {
            System.out.println(product + " remaining: " + inventory.get(product));
        }
    }

    // Print all out-of-stock products
    public static void printOutOfStock(Map<String, Integer> inventory) {
        System.out.println("\nOut-of-Stock Products:");
        boolean none = true;

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            if (entry.getValue() == 0) {
                System.out.println("→ " + entry.getKey());
                none = false;
            }
        }

        if (none) System.out.println("None");
    }
}
