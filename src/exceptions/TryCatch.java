package exceptions;

import java.io.File;
import java.io.IOException;
import java.net.URI;

public class TryCatch {
    public static void main(String[] args) {
        tryFileMethod();
    }
    // trying to crete a file in a path that does not exist
    public static void tryFileMethod() {
        File file = new File("madeUp/nowhere.txt");
        //also.... using URI constructor
        // File file = new File(URI.create("http://localhost"));
        try {
            file.createNewFile();
            // ***NB*** We could also use Polymorphism to catch this if we
            // didn't know the exception as exception is the superclass
            // could use (exception e)
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public void methodToProveProgramIsStillRunningAfterTryCatch(){
        System.out.println("Program Still Running ");
    }
}
