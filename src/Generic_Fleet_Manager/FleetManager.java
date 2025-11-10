package Generic_Fleet_Manager;

import java.util.ArrayList;

class FleetManager<T extends Vehicle> {
    private ArrayList<T> fleet = new ArrayList<>();

    public void addVehicle(T vehicle) {
        fleet.add(vehicle);
    }

    public void showFleet() {
        for (T v : fleet) {
            v.show();
        }
    }
}

