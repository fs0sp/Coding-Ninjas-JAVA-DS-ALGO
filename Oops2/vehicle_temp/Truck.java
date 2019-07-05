package vehicle_temp;

import vehicle.Vehicle;

public class Truck extends Vehicle {
    int maxLoadingCapacity;

    public void print() {
        System.out.println("Truck Capacity :" + maxLoadingCapacity);
        System.out.println("Truck Color :" + color);
        System.out.println("Truck MaxSpeed :" + getMaxSpeed());
    }
}