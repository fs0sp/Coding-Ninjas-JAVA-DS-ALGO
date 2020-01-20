package vehicle;

public class Vehicle {
    protected String color;
    private int maxSpeed;


    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        System.out.println("Vehicle Constructor");

    }


    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    public void print() {
        System.out.println("Vehicle Color : " + color);
        System.out.println("Vehicle MaxSpeed : " + maxSpeed);
    }

}