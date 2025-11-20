package map;

import java.util.*;

public class EmployeeSalaryDirectory {

    public static void main(String[] args) {

        // 1. Add employees and salaries
        Map<String, Double> salaryMap = new HashMap<>();
        salaryMap.put("Alice", 45000.0);
        salaryMap.put("Bob", 52000.0);
        salaryMap.put("Charlie", 48000.0);
        salaryMap.put("Diana", 60000.0);
        salaryMap.put("Evan", 39000.0);
        salaryMap.put("Frank", 55000.0);

        System.out.println("Initial Salaries:");
        System.out.println(salaryMap);

        // 2. Give raises
        giveRaise(salaryMap, "Alice", 10);    // +10%
        giveRaise(salaryMap, "Diana", 5);     // +5%
        giveRaise(salaryMap, "Frank", 12);    // +12%
        giveRaise(salaryMap, "John", 8);      // not found

        System.out.println("\nSalaries After Raises:");
        System.out.println(salaryMap);

        // 3. Compute average salary
        double avg = computeAverage(salaryMap);
        System.out.println("\nAverage Salary: " + avg);

        // 4. Find highest-paid employee(s)
        System.out.println("\nHighest Paid Employee(s):");
        printHighestPaid(salaryMap);
    }

    // Raise salary by percentage
    public static void giveRaise(Map<String, Double> map, String name, double percent) {
        if (!map.containsKey(name)) {
            System.out.println("Employee not found: " + name);
            return;
        }
        double current = map.get(name);
        double newSalary = current + (current * percent / 100);
        map.put(name, newSalary);
        System.out.println("Given " + percent + "% raise to " + name + " → New Salary: " + newSalary);
    }

    // Compute average salary
    public static double computeAverage(Map<String, Double> map) {
        double total = 0;
        for (double salary : map.values()) {
            total += salary;
        }
        return total / map.size();
    }

    // Print employee(s) with highest salary
    public static void printHighestPaid(Map<String, Double> map) {
        double max = Collections.max(map.values());

        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                System.out.println("→ " + entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
