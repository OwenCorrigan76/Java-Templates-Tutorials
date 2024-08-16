package constructors;

import java.util.Optional;

public class Car {
    private static final int numWheels = 4;
    private String make;
    private String model;
    private double distance;
    private double timeDriving;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
//        this.distance = distance;
//        this.timeDriving = timeDriving;
    }

    public void drove(double time, double distance){
        System.out.println("Distance driven is: " + calculateMilesDriven(time, distance));
    }

    public double calculateMilesDriven(double time, double distance){
        return time * distance;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
