import java.util.Scanner;
public class CalculateAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        System.out.println("Average: " + ((a + b + c) / 3));
    }
}
