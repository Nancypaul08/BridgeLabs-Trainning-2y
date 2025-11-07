package Exception_Handling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();

        try {
            atm.withdraw(amount);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage()); // Handling the exception
        }

        sc.close();
    }
}

