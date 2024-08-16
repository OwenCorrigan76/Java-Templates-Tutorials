package constructors;

public class Factory {
    public static void main(String[] args) {
        Car car = new Car("Ford", "Focus");
        System.out.println(car.getMake() + " " + car.getModel());
        System.out.println(car.getNumWheels());
        car.setMake("Fiat");
        car.setModel("Punto");
        System.out.println(car.getMake() + " " + car.getModel());
        System.out.println(car.calculateMilesDriven(20, 44));
        car.drove(4000, 50);
    }
}
