package map;

import java.util.*;

public class EmployeeDepartmentMapping {

    public static void main(String[] args) {

        // 1. Add employees (ID → Department)
        Map<Integer, String> empDept = new HashMap<>();
        empDept.put(101, "HR");
        empDept.put(102, "IT");
        empDept.put(103, "Finance");
        empDept.put(104, "IT");
        empDept.put(105, "Marketing");
        empDept.put(106, "HR");

        System.out.println("Initial Employee → Department Mapping:");
        System.out.println(empDept);

        // 2. Change department of an employee
        changeDepartment(empDept, 103, "IT");  // Finance → IT
        changeDepartment(empDept, 110, "HR");  // Non-existent

        System.out.println("\nAfter Department Changes:");
        System.out.println(empDept);

        // 3. Reverse lookup: find all employees in a given department
        System.out.println("\nEmployees in IT Department:");
        List<Integer> itEmployees = findEmployeesInDepartment(empDept, "IT");
        System.out.println(itEmployees);

        // 4. Total employees per department
        System.out.println("\nEmployee Count Per Department:");
        Map<String, Integer> deptCount = getDepartmentCounts(empDept);

        for (Map.Entry<String, Integer> entry : deptCount.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }

    // Change department
    public static void changeDepartment(Map<Integer, String> map, int empId, String newDept) {
        if (map.containsKey(empId)) {
            map.put(empId, newDept);
            System.out.println("Employee " + empId + " moved to " + newDept);
        } else {
            System.out.println("Employee ID " + empId + " not found.");
        }
    }

    // Reverse lookup: find all employees in a given department
    public static List<Integer> findEmployeesInDepartment(Map<Integer, String> map, String dept) {
        List<Integer> employees = new ArrayList<>();

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(dept)) {
                employees.add(entry.getKey());
            }
        }
        return employees;
    }

    // Count employees per department (grouping)
    public static Map<String, Integer> getDepartmentCounts(Map<Integer, String> map) {
        Map<String, Integer> counts = new HashMap<>();

        for (String dept : map.values()) {
            counts.put(dept, counts.getOrDefault(dept, 0) + 1);
        }

        return counts;
    }
}
