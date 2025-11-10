package Generic_Fleet_Manager;

class Truck extends Vehicle {
    Truck(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println("Truck: " + name);
    }
}

class Bike extends Vehicle {
    Bike(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println("Bike: " + name);
    }
}

