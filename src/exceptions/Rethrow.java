package exceptions;

// If code has potential to have a checked exception
// it must be caught or rethrown

import java.io.File;
import java.io.IOException;

public class Rethrow {
    // throwing moves it to the method that calls this method
    // main method throws it again ???
    public static void rethrowException() throws IOException {
        File file = new File("noPath/noFile");
        file.createNewFile();
    }
}
