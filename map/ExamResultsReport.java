package map;

import java.util.*;

public class ExamResultsReport {

    public static void main(String[] args) {

        // subject → (student → marks)
        Map<String, Map<String, Integer>> examData = new HashMap<>();

        // 1. Add subjects and marks
        examData.put("Math", new HashMap<>());
        examData.get("Math").put("Alice", 92);
        examData.get("Math").put("Bob", 85);
        examData.get("Math").put("Charlie", 78);

        examData.put("Science", new HashMap<>());
        examData.get("Science").put("Alice", 88);
        examData.get("Science").put("Bob", 91);
        examData.get("Science").put("Charlie", 67);

        examData.put("English", new HashMap<>());
        examData.get("English").put("Alice", 73);
        examData.get("English").put("Bob", 82);
        examData.get("English").put("Charlie", 95);

        // ----- OUTPUT SECTION -----

        // 2. Top scorer per subject
        System.out.println("Top Scorer Per Subject:");
        for (String subject : examData.keySet()) {
            printTopper(examData, subject);
        }

        // 3. Average score per subject
        System.out.println("\nAverage Score Per Subject:");
        for (String subject : examData.keySet()) {
            printAverage(examData, subject);
        }

        // 4. Subjects with at least one score > 90
        System.out.println("\nSubjects with at least one student scoring above 90:");
        for (String subject : examData.keySet()) {
            if (hasAbove90(examData.get(subject))) {
                System.out.println("→ " + subject);
            }
        }
    }

    // Find and print topper of a subject
    public static void printTopper(Map<String, Map<String, Integer>> data, String subject) {
        Map<String, Integer> marks = data.get(subject);

        String topper = null;
        int maxScore = -1;

        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            if (entry.getValue() > maxScore) {
                maxScore = entry.getValue();
                topper = entry.getKey();
            }
        }

        System.out.println(subject + " → Topper: " + topper + " (" + maxScore + ")");
    }

    // Calculate and print average score for a subject
    public static void printAverage(Map<String, Map<String, Integer>> data, String subject) {
        Map<String, Integer> marks = data.get(subject);

        double sum = 0;
        for (int score : marks.values()) {
            sum += score;
        }

        double avg = sum / marks.size();
        System.out.println(subject + " → Average: " + avg);
    }

    // Check if any student scored above 90
    public static boolean hasAbove90(Map<String, Integer> marks) {
        for (int score : marks.values()) {
            if (score > 90) return true;
        }
        return false;
    }
}
