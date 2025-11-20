package map;

import java.io.*;
import java.util.*;

public class WordFrequencyCounter {

    public static void main(String[] args) {
        // Change file path according to your system
        String filePath = "input.txt";

        Map<String, Integer> wordCount = new HashMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = br.readLine()) != null) {
                // Convert to lowercase and remove punctuation
                line = line.toLowerCase().replaceAll("[^a-z0-9\\s]", "");

                // Split into words
                String[] words = line.split("\\s+");

                // Count words
                for (String word : words) {
                    if (word.length() == 0) continue;

                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // Print result
        System.out.println(wordCount);
    }
}
