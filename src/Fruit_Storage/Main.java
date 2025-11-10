package Fruit_Storage;

public class Main {
    public static void main(String[] args) {

        FruitBox<Fruit> fruitBox = new FruitBox<>();
        fruitBox.add(new Apple());
        fruitBox.add(new Mango());

        System.out.println("Fruit Box Contains:");
        fruitBox.display();

        // Try adding non-fruit:
        // FruitBox<Car> carBox = new FruitBox<>();  // ERROR: Car is not a Fruit
    }
}
