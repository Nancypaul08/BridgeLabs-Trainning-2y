package Generic_Fleet_Manager;

public class Main {
    public static void main(String[] args) {

        // Fleet of Trucks
        FleetManager<Truck> truckFleet = new FleetManager<>();
        truckFleet.addVehicle(new Truck("Volvo Heavy Truck"));
        truckFleet.addVehicle(new Truck("Tata Cargo"));
        System.out.println("Truck Fleet:");
        truckFleet.showFleet();

        // Fleet of Bikes
        FleetManager<Bike> bikeFleet = new FleetManager<>();
        bikeFleet.addVehicle(new Bike("Royal Enfield"));
        bikeFleet.addVehicle(new Bike("Hero Splendor"));
        System.out.println("\nBike Fleet:");
        bikeFleet.showFleet();

        // Following will cause compile error:
        // FleetManager<String> wrongFleet = new FleetManager<>(); // ❌ Not allowed, String is not a Vehicle
    }
}

