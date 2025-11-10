package Fruit_Storage;

import java.util.ArrayList;

class FruitBox<T extends Fruit> {    // Only Fruit or its subclasses allowed
    private ArrayList<T> box = new ArrayList<>();

    public void add(T fruit) {
        box.add(fruit);
    }

    public void display() {
        for (T fruit : box) {
            fruit.show();
        }
    }
}
