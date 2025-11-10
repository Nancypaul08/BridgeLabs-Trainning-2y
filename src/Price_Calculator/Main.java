package Price_Calculator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        List<Mobile> mobiles = Arrays.asList(
            new Mobile(10000),
            new Mobile(15000),
            new Mobile(12000)
        );

        List<Laptop> laptops = Arrays.asList(
            new Laptop(45000),
            new Laptop(52000)
        );

        System.out.println("Total price of Mobiles: " + PriceUtil.calculateTotal(mobiles));
        System.out.println("Total price of Laptops: " + PriceUtil.calculateTotal(laptops));
    }
}
