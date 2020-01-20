package vehicle;

import vehicle.Vehicle;

public class VehicleUse {

    public static void main(String[] args) {
        //Vehicle v = new Vehicle();
       // v.print();

        Vehicle v = new Car(10,20);

        Car c = new Car();
        c.numGears = 10;
        c.color = "Red";
        //c.print();
        c.setMaxSpeed(100);
        //c.print();

    }

}