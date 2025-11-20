package map;

import java.util.*;

public class AttendanceTracker {

    public static void main(String[] args) {

        // 1. Initialize students with 0 attendance
        List<String> students = Arrays.asList("Alice", "Bob", "Charlie", "Diana", "Evan");
        Map<String, Integer> attendance = new HashMap<>();

        for (String student : students) {
            attendance.put(student, 0);
        }

        System.out.println("Initial Attendance: " + attendance);

        // 2. Simulate attendance for 15 days
        // Each day's present list (for simulation)
        List<List<String>> monthAttendance = Arrays.asList(
                Arrays.asList("Alice", "Bob", "Charlie"),
                Arrays.asList("Alice", "Diana"),
                Arrays.asList("Bob", "Charlie", "Evan"),
                Arrays.asList("Alice", "Charlie"),
                Arrays.asList("Bob", "Evan"),
                Arrays.asList("Charlie", "Diana"),
                Arrays.asList("Alice", "Bob"),
                Arrays.asList("Alice", "Charlie", "Evan"),
                Arrays.asList("Diana"),
                Arrays.asList("Bob", "Charlie"),
                Arrays.asList("Alice", "Evan"),
                Arrays.asList("Charlie"),
                Arrays.asList("Alice", "Bob", "Diana"),
                Arrays.asList("Evan"),
                Arrays.asList("Bob", "Charlie")
        );

        // Mark attendance day-by-day
        for (List<String> presentList : monthAttendance) {
            for (String student : presentList) {
                attendance.put(student, attendance.get(student) + 1);
            }
        }

        System.out.println("\nAttendance After 15 Days:");
        for (Map.Entry<String, Integer> entry : attendance.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " days");
        }

        // 3. Find students below threshold
        int threshold = 10;
        System.out.println("\nStudents with attendance fewer than " + threshold + " days:");

        for (Map.Entry<String, Integer> entry : attendance.entrySet()) {
            if (entry.getValue() < threshold) {
                System.out.println("→ " + entry.getKey() + " (" + entry.getValue() + " days)");
            }
        }
    }
}

