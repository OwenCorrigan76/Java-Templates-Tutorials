package exceptions;

import java.io.File;
import java.io.IOException;

public class StackTrace {

    public void printStackTrace() {
        File file = new File("madeUp/nowhere.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            // printing the stack trace
            e.printStackTrace();
        }
    }
}
