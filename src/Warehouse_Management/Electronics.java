package Warehouse_Management;

class Electronics extends WarehouseItem {
    public Electronics(String name) {
        super(name);
    }

    public void showDetails() {
        System.out.println("Electronics Item: " + getName());
    }
}

class Groceries extends WarehouseItem {
    public Groceries(String name) {
        super(name);
    }

    public void showDetails() {
        System.out.println("Grocery Item: " + getName());
    }
}

class Furniture extends WarehouseItem {
    public Furniture(String name) {
        super(name);
    }

    public void showDetails() {
        System.out.println("Furniture Item: " + getName());
    }
}
