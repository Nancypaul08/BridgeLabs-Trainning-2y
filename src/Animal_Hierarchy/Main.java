package Animal_Hierarchy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        List<Dog> dogs = Arrays.asList(new Dog(), new Dog());
        List<Cat> cats = Arrays.asList(new Cat(), new Cat());

        System.out.println("Dogs:");
        AnimalPrinter.printAnimals(dogs);

        System.out.println("\nCats:");
        AnimalPrinter.printAnimals(cats);
    }
}

