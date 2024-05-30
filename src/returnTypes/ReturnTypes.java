package returnTypes;


public class ReturnTypes {
    public static void main(String[] args) {
        //call the method and print the result
        System.out.println(timesTwo(4));
        System.out.println(quadrupleIt(4));

        // create a new guitar object
        Guitar guitar = new Guitar("Fender", "Stratocaster", 1954);
        // create a new guitar object using the factory method
        Guitar myGuitar = GuitarFactory.makeGuitar("Fender", "Stratocaster", 1954);
        Guitar mySeondGuitar = GuitarFactory.makeGuitar("Fender", "Stratocaster", 1954, 6, "USA");

        // call the method
        playingGuitar();
        // call the method with arguments
        playingGuitar("Fender", "Stratocaster", 1954);
        // call the method with the object
        guitar.playGuitar();
        // call the method with the object
        myGuitar.playGuitar();
        myGuitar.displayDetails();
        String mySecondGuitar = mySeondGuitar.getBrand();
        System.out.println("My second guitar brand is: " + mySecondGuitar);

    }

    private static void playingGuitar() {
    }

    //return a value multiplied by 2
    public static int timesTwo(int num) {
        return num * 2;
    }

    // use the timesTwo method to return a value multiplied by 4
    public static int quadrupleIt(int num) {
        int number = timesTwo(num);
        return number * 2;
    }

    public static void playingGuitar(String brand, String model, int year) {
        System.out.println("Brand is : " + brand + " " + model + " " + year);
    }
}
