package collections;

import java.util.ArrayList;
import java.util.List;

public class ForEachLambda {

    public static void testForeachLambda(){
        List<String> fruits = new ArrayList<>();
        // add to fruits
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("pear");

        // using a lambda to create a variable f and then specify the action
        fruits.forEach(f -> System.out.println(f));

        // this is the same as above.
        fruits.forEach(System.out::println);

        // using a lambda to so something with each element of the collection
        fruits.forEach(f -> {
            f = "fruits: " + f;
            System.out.println(f);
        });
    }
}
