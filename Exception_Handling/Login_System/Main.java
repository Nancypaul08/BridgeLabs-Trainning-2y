package Login_System;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LoginSystem login = new LoginSystem();
        
        while (true) {
            System.out.print("Enter Username: ");
            String user = sc.nextLine();
            
            System.out.print("Enter Password: ");
            String pass = sc.nextLine();

            try {
                login.validate(user, pass);
                break; // success → exit loop
            } catch (InvalidCredentialsException e) {
                System.out.println(e.getMessage());
                System.out.println("Please try again.\n");
            }
        }
        
        sc.close();
    }
}

