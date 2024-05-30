package returnTypes;

public class Amplifier {
    private int volume;
    private double weight;
    private String make;
    private String model;

    public Amplifier(int volume, double weight, String make, String model) {
        this.volume = volume;
        this.weight = weight;
        this.make = make;
        this.model = model;
    }

    public Amplifier(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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

    public void makeSound(){
        System.out.println("Boom Boom");
    }

    public static Amplifier myAmp2(){
        return new Amplifier("JK", "100");
    }

    public static Amplifier myAmp3(){
        return new Amplifier("JK22", "300");
    }
}
