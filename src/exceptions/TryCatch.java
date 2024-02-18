package exceptions;

import java.io.File;
import java.io.IOException;
import java.net.URI;

public class TryCatch {

    // trying to crete a file in a path that does not exist
    public void tryFileMethod() {
        File file = new File("madeUp/nowhere.txt");
        //also.... using URI constructor
        //File file = new File(URI.create("http://localhost"));
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public void methodToProveProgramIsStillRunningAfterTryCatch(){
        System.out.println("Program Still Running ");
    }
}
