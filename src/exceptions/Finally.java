package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        multiple();
    }
    public static void multiple() {
        File file = new File("/someDirectory/numbers.txt");
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(file);
            while (fileReader.hasNext()) {
                System.out.println(fileReader.nextDouble());
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        } finally {
            for (int i = 0; i < 10; i++) {
                System.out.println("Num: " + i);
            }
            System.out.println("Next will close");
            fileReader.close();
        }
    }
}


