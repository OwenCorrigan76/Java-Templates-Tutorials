package collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    // returned sets cannot guarantee order
    public void addFruits() {
        Set<Object> fruits = new HashSet<>();
        // add to a set
        fruits.add("apple");
        fruits.add("pear");
        fruits.add("mango");

        // boolean
        System.out.println("contains a pear: " + fruits.contains("pear"));

        // remove pear from set
        fruits.remove("pear");
        System.out.println(fruits);

        // print size of the set
        System.out.println(fruits.size());

        // easier way to create and add to a set
        Set<Object> easierWayToAdd = Set.of("orange", "grapes", "lemon");
        System.out.println(easierWayToAdd);

        // NB **** cannot add or remove as Sets are immutable ****
        // easierWayToAdd.remove("grapes");
        // easierWayToAdd.add("pear");
        System.out.println(easierWayToAdd);
    }
}

