package loops;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("jim");
        names.add("james");
        names.add("owen");

        for (String name : names){
            name = name.toUpperCase();
            System.out.println(name);
        }

        int[] numbers = new int []{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int number: numbers){
            System.out.println("Number: " + number);
        }
    }
}
