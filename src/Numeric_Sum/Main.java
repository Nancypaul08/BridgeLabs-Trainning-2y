package Numeric_Sum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(10, 20, 30);
        List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.0);

        System.out.println("Sum of Integers: " + NumberUtil.sumNumbers(intList));
        System.out.println("Sum of Doubles: " + NumberUtil.sumNumbers(doubleList));
    }
}

