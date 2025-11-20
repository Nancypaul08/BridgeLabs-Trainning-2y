package map;

import java.util.*;

public class WordFrequency {

    public static void main(String[] args) {

        String sentence = "Java is fun and Java is powerful";

        // Normalize: lowercase + remove punctuation
        sentence = sentence.toLowerCase().replaceAll("[^a-z\\s]", "");

        // Split into words
        String[] words = sentence.split("\\s+");

        // Map to store frequencies
        Map<String, Integer> freqMap = new HashMap<>();

        // Count each word
        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        // Print word counts
        System.out.println("Word Frequency:");
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
