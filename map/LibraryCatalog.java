package map;

import java.util.*;

public class LibraryCatalog {

    public static void main(String[] args) {

        // Map<ISBN, Title>
        Map<String, String> catalog = new HashMap<>();

        // 1. Add books
        catalog.put("978-1111111111", "Java Programming");
        catalog.put("978-2222222222", "Data Structures");
        catalog.put("978-3333333333", "Operating Systems");
        catalog.put("978-4444444444", "Computer Networks");

        System.out.println("Initial Catalog: " + catalog);

        // 2. Search by ISBN
        searchByISBN(catalog, "978-2222222222");
        searchByISBN(catalog, "978-9999999999"); // not found

        // 3. Remove a book
        catalog.remove("978-3333333333");
        System.out.println("\nAfter Removing ISBN 978-3333333333:");
        System.out.println(catalog);

        // 4. Print all entries sorted by ISBN
        System.out.println("\nCatalog Sorted by ISBN:");
        Map<String, String> sorted = new TreeMap<>(catalog);
        for (Map.Entry<String, String> entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // Extended Feature: Search by Title
        System.out.println("\nSearching Title: 'Computer Networks'");
        searchByTitle(catalog, "Computer Networks");

        System.out.println("\nSearching Title: 'Python Basics'");
        searchByTitle(catalog, "Python Basics"); // not found
    }

    // Search book by ISBN
    public static void searchByISBN(Map<String, String> catalog, String isbn) {
        if (catalog.containsKey(isbn)) {
            System.out.println("ISBN " + isbn + " → " + catalog.get(isbn));
        } else {
            System.out.println("ISBN " + isbn + ": Book not found");
        }
    }

    // Search book by title (requires iteration)
    public static void searchByTitle(Map<String, String> catalog, String title) {
        boolean found = false;

        for (Map.Entry<String, String> entry : catalog.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(title)) {
                System.out.println("Found: " + entry.getKey() + " → " + entry.getValue());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book with title '" + title + "' not found.");
        }
    }
}


