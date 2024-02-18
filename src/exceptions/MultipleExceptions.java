package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptions {

    public void multiple() {
        File file = new File("/Users/owencorrigan/Desktop/Web Dev Stuff/Java Training/src/numbers.txt");
        System.out.println(file.exists());
        try {
            Scanner fileReader = new Scanner(file);
            System.out.println(fileReader);
            while (fileReader.hasNext()) {
                System.out.println(fileReader.nextDouble());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // multiples can also be written as a single catch block:
    // catch (FileNotFoundException | InputMismatchException e) {
    //            e.printStackTrace();
    //            }

}
