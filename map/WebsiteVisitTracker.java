package map;

import java.util.*;

public class WebsiteVisitTracker {

    public static void main(String[] args) {

        // Map to store page visit counts
        Map<String, Integer> visitMap = new HashMap<>();

        // Simulated user activity (page visits)
        String[] visits = {
            "home", "about", "products", "home", "products",
            "contact", "home", "about", "home", "products"
        };

        // 1. Count visits
        for (String page : visits) {
            visitMap.put(page, visitMap.getOrDefault(page, 0) + 1);
        }

        System.out.println("Page Visit Counts:");
        System.out.println(visitMap);

        // 2. Sort pages by descending visit count
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(visitMap.entrySet());

        sortedList.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println("\nPages Sorted by Visit Count (Descending):");
        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // 3. Find the page with the highest visits
        String maxPage = null;
        int maxVisits = -1;

        for (Map.Entry<String, Integer> entry : visitMap.entrySet()) {
            if (entry.getValue() > maxVisits) {
                maxVisits = entry.getValue();
                maxPage = entry.getKey();
            }
        }

        System.out.println("\nMost Visited Page:");
        System.out.println("→ " + maxPage + " (" + maxVisits + " visits)");
    }
}

