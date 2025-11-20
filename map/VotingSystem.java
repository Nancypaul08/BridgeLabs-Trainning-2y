package map;

import java.util.*;

public class VotingSystem {

    public static void main(String[] args) {

        Map<String, Integer> voteMap = new HashMap<>();

        // Simulate 10 votes for 3+ candidates
        String[] votes = {
            "Alice", "Bob", "Charlie", "Alice", "Bob",
            "Alice", "Charlie", "Alice", "Bob", "Charlie"
        };

        // Cast votes
        for (String candidate : votes) {
            voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        }

        // Print total vote count for each candidate
        System.out.println("Total Votes:");
        for (Map.Entry<String, Integer> entry : voteMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // Find candidate with highest votes
        String winner = null;
        int maxVotes = -1;

        for (Map.Entry<String, Integer> entry : voteMap.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }

        System.out.println("\nWinner: " + winner + " with " + maxVotes + " votes!");
    }
}

