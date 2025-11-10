package Generic_Fleet_Manager;

class Vehicle {
    String name;

    Vehicle(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("Vehicle: " + name);
    }
}
