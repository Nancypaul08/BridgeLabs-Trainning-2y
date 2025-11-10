package Animal_Hierarchy;

import java.util.List;

class AnimalPrinter {

    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            a.sound();
        }
    }
}
