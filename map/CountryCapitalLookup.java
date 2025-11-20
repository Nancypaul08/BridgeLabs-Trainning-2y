package map;

import java.util.*;

public class CountryCapitalLookup {

    public static void main(String[] args) {

        // 1. Add country → capital pairs
        Map<String, String> countries = new HashMap<>();
        countries.put("India", "New Delhi");
        countries.put("USA", "Washington, D.C.");
        countries.put("France", "Paris");
        countries.put("Japan", "Tokyo");
        countries.put("Germany", "Berlin");
        countries.put("Canada", "Ottawa");
        countries.put("Australia", "Canberra");
        countries.put("Brazil", "Brasilia");

        System.out.println("Initial Country-Capital Map:");
        System.out.println(countries);

        // 2. Lookup capital using a sample user query
        System.out.println("\nLookup:");
        lookupCapital(countries, "India");
        lookupCapital(countries, "Japan");
        lookupCapital(countries, "Spain");   // not in map → Unknown

        // 3. Print all sorted alphabetically by country
        System.out.println("\nCountries & Capitals (Alphabetical Order):");
        Map<String, String> sorted = new TreeMap<>(countries);

        for (Map.Entry<String, String> entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }

    // Method to lookup a capital for a given country
    public static void lookupCapital(Map<String, String> map, String country) {
        if (map.containsKey(country)) {
            System.out.println(country + " → " + map.get(country));
        } else {
            System.out.println(country + " → Unknown country");
        }
    }
}

