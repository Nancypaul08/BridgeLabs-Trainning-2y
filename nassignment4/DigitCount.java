import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        int n = num;

        if (n == 0) {
            count = 1;
        } else {
            while (n != 0) {
                n /= 10;
                count++;
            }
        }

        System.out.println("Number of digits in " + num + " = " + count);
    }
}
