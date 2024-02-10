package collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public void myFruits() {
        List<Object> fruits = new ArrayList<>();
        // add to fruits
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("pear");

        // change apple to mango
        fruits.set(0, "mango");

        // print the index of pear: 2
        System.out.println(fruits.indexOf("pear"));

        // remove pear by index: 2
        fruits.remove(2);
        System.out.println(fruits);

        // easier way to create a list but is immutable
        List<String> newList = List.of("pineapple", "grapes", "strawberry");
        System.out.println(newList);

        // get the first index: grapes
        System.out.println(newList.get(1));


    }
}
