import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number1: ");
        double number1 = input.nextDouble();
        System.out.print("Enter number2: ");
        double number2 = input.nextDouble();
        
        double add = number1 + number2;
        double sub = number1 - number2;
        double mul = number1 * number2;
        double div = number2 != 0 ? number1 / number2 : Double.NaN;
        
        System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f and %.2f\n",
                          number1, number2, add, sub, mul, div);
        input.close();
    }
}
