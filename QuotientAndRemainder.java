import java.util.Scanner;
public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int number1 = input.nextInt();
        System.out.print("Enter number2: ");
        int number2 = input.nextInt();
        
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        
        System.out.printf("The Quotient is %d and Remainder is %d of two number %d and %d\n", quotient, remainder, number1, number2);
        input.close();
    }
}
