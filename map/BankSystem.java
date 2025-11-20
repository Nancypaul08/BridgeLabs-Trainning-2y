package map;

import java.util.*;

public class BankSystem {

    public static void main(String[] args) {

        // 1. Create customer accounts with initial balances
        Map<String, Double> accounts = new HashMap<>();
        accounts.put("AC1001", 5000.0);
        accounts.put("AC1002", 8500.0);
        accounts.put("AC1003", 12000.0);
        accounts.put("AC1004", 3200.0);
        accounts.put("AC1005", 15000.0);

        System.out.println("Initial Account Balances:");
        System.out.println(accounts);

        // 2. Sample deposit and withdrawal operations
        deposit(accounts, "AC1001", 2000);
        withdraw(accounts, "AC1002", 5000);
        withdraw(accounts, "AC1003", 20000); // exceeds
        deposit(accounts, "AC1004", 1000);
        withdraw(accounts, "AC1005", 4000);

        System.out.println("\nBalances After Transactions:");
        System.out.println(accounts);

        // 3. Print customers sorted by descending balance
        System.out.println("\nCustomers Sorted by Descending Balance:");
        printSortedDescending(accounts);

        // 4. Print top 3 customers
        System.out.println("\nTop 3 Customers by Balance:");
        printTop3(accounts);
    }

    // Deposit method
    public static void deposit(Map<String, Double> accounts, String accNo, double amount) {
        if (!accounts.containsKey(accNo)) {
            System.out.println("Account not found: " + accNo);
            return;
        }
        accounts.put(accNo, accounts.get(accNo) + amount);
        System.out.println("Deposited " + amount + " to " + accNo);
    }

    // Withdraw method
    public static void withdraw(Map<String, Double> accounts, String accNo, double amount) {
        if (!accounts.containsKey(accNo)) {
            System.out.println("Account not found: " + accNo);
            return;
        }
        double balance = accounts.get(accNo);
        if (amount > balance) {
            System.out.println("❌ Withdrawal of " + amount + " failed for " + accNo + " — Insufficient balance!");
        } else {
            accounts.put(accNo, balance - amount);
            System.out.println("Withdrew " + amount + " from " + accNo);
        }
    }

    // Sort customers by descending balance
    public static void printSortedDescending(Map<String, Double> accounts) {
        List<Map.Entry<String, Double>> list = new ArrayList<>(accounts.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        for (Map.Entry<String, Double> entry : list) {
            System.out.println(entry.getKey() + " → ₹" + entry.getValue());
        }
    }

    // Print top 3 richest customers
    public static void printTop3(Map<String, Double> accounts) {
        List<Map.Entry<String, Double>> list = new ArrayList<>(accounts.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        for (int i = 0; i < Math.min(3, list.size()); i++) {
            Map.Entry<String, Double> entry = list.get(i);
            System.out.println((i + 1) + ". " + entry.getKey() + " → ₹" + entry.getValue());
        }
    }
}

