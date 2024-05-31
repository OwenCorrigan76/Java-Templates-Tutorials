package returnTypes;

public class ReturnTypes {
    public static void main(String[] args) {
        //call the method and print the result
        System.out.println(timesTwo(4));
        System.out.println(quadrupleIt(4));
//------------------------------------------------------
        Amplifier myAmplifier = AmpFactory.makeAnAmp();
        System.out.println("This model is : " + myAmplifier.getMake());

        Amplifier amplifier = Amplifier.myAmp2();
        String make = amplifier.getMake();
        System.out.println("Make is : " + make);


        Amplifier amplifier1 = Amplifier.myAmp3();
        String model = amplifier1.getModel();
        System.out.println("Model is: " + model);
        amplifier1.setMake("Fender");
        System.out.println("Make is : " + amplifier1.getMake());

//------------------------------------------------------

        // create a new guitar object
        Guitar guitar = new Guitar("Fender", "Stratocaster", 1954);
        Guitar guitar2 = new Guitar("Fender", "Stratocaster", 1954, 7, "USA");

        // create a new guitar object using the factory method which creates a new guitar object in the method
        Guitar myGuitar = GuitarFactory.makeGuitar("Fender", "Stratocaster", 1954);
        Guitar mySeondGuitar = GuitarFactory.makeGuitar("Fender", "Stratocaster", 1954, 6, "USA");

        // call the method from below
        playingGuitar();
        // call the method with arguments
        playingGuitar("Fender", "Stratocaster", 1954);
        // This is wrong because th playGuitar method is static
        // Must be called with the class name
        guitar.playGuitar();
        guitar2.playGuitar();

        // This is fine because the method is not static
        guitar.guitarFound();
        guitar2.guitarFound();
        System.out.println(guitar2.findGuitar2());
        //This is how you call the static method with the Class name
        Guitar.playGuitar();

        System.out.println("Guitar Type: " + Guitar.guitarType);


        myGuitar.displayDetails();
        String mySecondGuitar = mySeondGuitar.getBrand();
        System.out.println("My second guitar brand is: " + mySecondGuitar);
    }

    public static void playingGuitar(){
    }

    public static void playingGuitar(String brand, String model, int year) {
        System.out.println("Brand is : " + brand + " " + model + " " + year);
    }
//------------------------------------------------------


    //return a value multiplied by 2
    public static int timesTwo(int num) {
        return num * 2;
    }

    // use the timesTwo method to return a value multiplied by 4
    public static int quadrupleIt(int num) {
        int number = timesTwo(num);
        return number * 2;
    }
}
