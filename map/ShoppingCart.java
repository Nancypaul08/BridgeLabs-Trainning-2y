package map;

import java.util.*;

public class ShoppingCart {

    public static void main(String[] args) {

        // 1. Use LinkedHashMap to keep insertion order
        LinkedHashMap<String, Double> cart = new LinkedHashMap<>();

        // Add products in the order user adds them
        cart.put("Laptop", 45000.0);
        cart.put("Mouse", 500.0);
        cart.put("Keyboard", 1200.0);
        cart.put("Headphones", 1500.0);
        cart.put("USB Cable", 300.0);

        // Display cart
        System.out.println("Items in Cart (Insertion Order):");
        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " → ₹" + entry.getValue());
        }

        // 3. Calculate total bill amount
        double total = 0;
        for (double price : cart.values()) {
            total += price;
        }

        System.out.println("\nTotal Before Discount: ₹" + total);

        // 4. Apply 10% discount if total > 5000
        if (total > 5000) {
            double discount = total * 0.10;
            total -= discount;
            System.out.println("Discount Applied: ₹" + discount);
        }

        System.out.println("Total After Discount: ₹" + total);

        // 5. Remove an item if quantity becomes zero (simulate)
        removeItem(cart, "Keyboard");
        removeItem(cart, "USB Cable");

        System.out.println("\nCart After Removing Items:");
        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " → ₹" + entry.getValue());
        }
    }

    // simulate removing an item
    public static void removeItem(LinkedHashMap<String, Double> cart, String item) {
        if (cart.containsKey(item)) {
            cart.remove(item);
            System.out.println("Item removed: " + item);
        } else {
            System.out.println("Item not found: " + item);
        }
    }
}

