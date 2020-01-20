
package vehicle;

import vehicle.Vehicle;

public class Car extends Vehicle {
    

    int numGears;
    boolean isConvertible;

    public Car(int numGears, int maxSpeed) {
        super.(maxSpeed);
        this.numGears = numGears;
        System.out.println("Car Constructor");
    }    

    public void print() {
        super.print();
        System.out.println("Car NumGears : " + numGears);
        System.out.println("Car isConvertible : " + isConvertible);
    }

}
