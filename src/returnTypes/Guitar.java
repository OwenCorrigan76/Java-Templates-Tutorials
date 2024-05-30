package returnTypes;

public class Guitar {

    private String brand;
    private String model;
    private int year;
    private int strings;
    private String factory;

    public Guitar(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public Guitar(String brand, String model, int year, int strings){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.strings = strings;
    }

    public Guitar(String brand, String model, int year, int strings, String factory){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.strings = strings;
        this.factory = factory;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void playGuitar() {
        System.out.println("Playing the guitar");
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }
}
