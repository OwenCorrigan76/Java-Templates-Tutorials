package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {
    public static void addFruits() {

        // in this case, String is key, value is Integer
        Map<String, Integer> fruits = new HashMap<>();

        // use put to add key and value
        fruits.put("Apples", 20);
        fruits.put("Grapes", 30);
        fruits.put("Pears", 40);
        fruits.put("Pears", 50); // overrides Pears above


        // print the value of the key "Apples": 20
        System.out.println(fruits.get("Apples"));

        // puts if absent. In this case it won't change because apple is not absent
        fruits.putIfAbsent("Apples", 90);

        // puts if absent. In this case it will put Lemon
        fruits.putIfAbsent("Lemon", 90);

        // removes element by key: Grapes
        fruits.remove("Grapes");

        // an easier way to create a Map, but it is immutable
        Map<String, Integer> immutableMapOfFruits = Map.of("Apples", 90,
                "Pears", 20,
                "Lemons", 60
        );

        // to see if map contains key or value: true and false in this case
        System.out.println(fruits.containsKey("Apples"));
        System.out.println(fruits.containsValue(40));

        // set from map entries
        Set<Map.Entry<String, Integer>> mapEntries = fruits.entrySet();
        System.out.println(mapEntries);

        // set from map keys
        Set<String> mapKeys = fruits.keySet();
        System.out.println(mapKeys);

        System.out.println(fruits);
        System.out.println(immutableMapOfFruits);
    }
}
