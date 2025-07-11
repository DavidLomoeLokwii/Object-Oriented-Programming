package passengersource;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Vehicle> availableVehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        availableVehicles.add(vehicle);
    }

    // Schedule a vehicle for a new passenger
    public boolean scheduleVehicle(Passenger passenger) {
        if (availableVehicles.isEmpty()) {
            System.out.println("NO VEHICLES CURRENTLY");
            return false;        }

        Vehicle assigned = availableVehicles.remove(0); 
        assigned.pickupPassenger(passenger);
        return true;
    }
}
