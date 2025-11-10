package Generic_Box;

public class Main {
    public static void main(String[] args) {

        // Storing Integer
        Box<Integer> intBox = new Box<>();
        intBox.set(50);
        System.out.println("Integer value: " + intBox.get());

        // Storing String
        Box<String> strBox = new Box<>();
        strBox.set("Hello Generics");
        System.out.println("String value: " + strBox.get());

        // Storing Double
        Box<Double> doubleBox = new Box<>();
        doubleBox.set(99.99);
        System.out.println("Double value: " + doubleBox.get());
    }
}

