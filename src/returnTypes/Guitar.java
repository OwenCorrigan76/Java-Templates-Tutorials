package returnTypes;

public class Guitar implements GuitarStrings {

    public static void main(String[] args) {
       guitarWoodType();

    }


    static void guitarWoodType(){
        String m = (WoodType.woodType());
        String a = (WoodType.woodType2());
        String n = woodType();
        System.out.println("I like " + m + " guitars and I like " + a + " guitars. But I don't like " + n + " guitars.");
    }

    private String brand;
    private String model;
    private int year;
    private int strings;
    private String factory;
    static String guitarType = "Electric";

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

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public String findGuitar() {
        return (this.brand + " " + this.model + " " + this.year + " " + this.strings + " " + this.factory + " " + guitarType);
    }

    public String findGuitar2() {
        return (this.brand + " " + this.model + " " + this.year + " " + this.strings  + " " + guitarType);
    }

    public void guitarFound(){
        String foundGuitar = findGuitar();
        System.out.println("Guitar found: " + foundGuitar);
    }

    public static void playGuitar() {
        System.out.println("Playing the guitar");
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }

    @Override
    public void numStrings() {
        System.out.println("Number of strings: " + strings);
    }


    public static String woodType() {
        return "Babmoo";
    }
}
