import java.util.Scanner;

public class FactorsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        if (num > 0) {
            int i = 1;
            System.out.println("Factors:");
            while (i < num) {
                if (num % i == 0)
                    System.out.println(i);
                i++;
            }
        } else {
            System.out.println("Not a positive integer");
        }
    }
}
