package exceptions;

import java.io.File;
import java.io.IOException;

public class StackTrace {
    public static void main(String[] args) {
        printStackTrace();
    }

    public static void printStackTrace() {
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
