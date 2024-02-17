package collections;

import java.util.ArrayList;
import java.util.List;

public class EnhancedForLoop {

    public static void loopTest() {

        List<String> fruits = new ArrayList<>();

        // add to fruits
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("pear");

        // loop through fruits and print every fruit
        for(String fruit: fruits){
            System.out.println(fruit);
        }

        // loop through fruits and print first fruit index 0: apple
        for(String fruit: fruits){
            System.out.println(fruit.indexOf("apple"));
        }
    }
}
