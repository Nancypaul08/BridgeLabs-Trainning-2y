package Numeric_Sum;

import java.util.List;

class NumberUtil {

    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;

        for (Number num : list) {
            sum += num.doubleValue(); // convert to double for calculation
        }
        return sum;
    }
}
