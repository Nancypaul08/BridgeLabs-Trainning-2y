package map;

import java.util.*;

public class StudentGradeTracker {

    public static void main(String[] args) {

        // 1. Create the Map to store student grades
        Map<String, Double> gradeMap = new HashMap<>();

        // 2. Add several students and grades
        gradeMap.put("Alice", 85.0);
        gradeMap.put("Bob", 92.5);
        gradeMap.put("Charlie", 78.0);
        gradeMap.put("Diana", 88.5);

        System.out.println("Initial Grades: " + gradeMap);

        // 3. Update a grade (student re-takes test)
        gradeMap.put("Charlie", 90.0); // Charlie improved score
        System.out.println("After Updating Charlie: " + gradeMap);

        // 4. Remove a student who dropped out
        gradeMap.remove("Bob");
        System.out.println("After Removing Bob: " + gradeMap);

        // 5. Print in alphabetical order of names
        System.out.println("\nStudents Sorted Alphabetically:");

        Map<String, Double> sortedMap = new TreeMap<>(gradeMap);

        for (Map.Entry<String, Double> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
