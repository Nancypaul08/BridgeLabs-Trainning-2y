package map;

import java.util.*;

public class CourseRegistration {

    public static void main(String[] args) {

        // 1. Add 5 courses with initial registration counts
        Map<String, Integer> courseMap = new HashMap<>();
        courseMap.put("CS101", 45);
        courseMap.put("CS102", 12);
        courseMap.put("CS201", 3);
        courseMap.put("MA101", 55);
        courseMap.put("PHY110", 2);

        System.out.println("Initial Course Registrations:");
        System.out.println(courseMap);

        // 2. Simulate add/drop students
        addStudents(courseMap, "CS101", 10);   // now 55
        dropStudents(courseMap, "CS102", 5);   // now 7
        addStudents(courseMap, "CS201", 4);    // now 7
        dropStudents(courseMap, "PHY110", 3);  // drops to 0 (not negative)
        addStudents(courseMap, "MA101", 2);    // now 57

        System.out.println("\nAfter Registration Changes:");
        System.out.println(courseMap);

        // 3. Print near-full and under-subscribed courses
        printStatus(courseMap);
    }

    // Add students
    public static void addStudents(Map<String, Integer> map, String course, int count) {
        int newCount = map.getOrDefault(course, 0) + count;
        map.put(course, newCount);
        System.out.println("Added " + count + " to " + course + " → Now: " + newCount);
    }

    // Drop students (never negative)
    public static void dropStudents(Map<String, Integer> map, String course, int count) {
        int current = map.getOrDefault(course, 0);
        int newCount = Math.max(0, current - count);
        map.put(course, newCount);
        System.out.println("Dropped " + count + " from " + course + " → Now: " + newCount);
    }

    // Print courses near full and under-subscribed
    public static void printStatus(Map<String, Integer> map) {
        System.out.println("\nNear Full Courses (≥ 50 students):");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 50) {
                System.out.println("→ " + entry.getKey() + ": " + entry.getValue());
            }
        }

        System.out.println("\nUnder-Subscribed Courses (< 5 students):");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() < 5) {
                System.out.println("→ " + entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
