package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsAndLambdas {
    public static void main(String[] args) {
        getNames();
        testGuitarsMap();
    }

    public static void getNames() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Owen");
        names.add("Jim");
        names.add("Bill");
        names.add("Gwen");
        names.add("Oran");
        names.add("Phil");

        if (names.stream().count() < 1) {
            System.out.println("mofo");
        } else {
            System.out.println("mufu");
        }
    }
    static void testGuitarsMap() {
        Map<String, String> guitars = new HashMap<>();
        guitars.put("Make", "Strat");
        guitars.put("Model", "Tele");
        guitars.put("Year", "2010");

        System.out.println(guitars.entrySet());
        System.out.println(guitars.keySet().stream().filter(String::isEmpty));
    }

}
