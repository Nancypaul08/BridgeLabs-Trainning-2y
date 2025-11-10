package Generic_Pair;

public class Main {
    public static void main(String[] args) {

        // Example given
        Pair<String, Integer> student = new Pair<>("Amol", 20);

        System.out.println("Name: " + student.getFirst());
        System.out.println("Age: " + student.getSecond());

        // Another Example
        Pair<Double, String> product = new Pair<>(199.99, "Laptop");
        System.out.println("\nPrice: " + product.getFirst());
        System.out.println("Item: " + product.getSecond());
    }
}

