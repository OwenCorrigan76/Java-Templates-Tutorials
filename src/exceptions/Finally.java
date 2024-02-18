package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Finally {

    public void multiple() {
        File file = new File("/Users/owencorrigan/Desktop/Web Dev Stuff/Java Training/src/numbers.txt");
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(file);
            while (fileReader.hasNext()) {
                System.out.println(fileReader.nextDouble());
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Next will close");
            fileReader.close();
        }
    }
}


