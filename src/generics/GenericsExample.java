package generics;

import java.util.Arrays;
import java.util.List;

public class GenericsExample {

    public void testGenerics() {
        String[] words = {"apple", "banana", "pear"};
        Integer[] numbers = {1, 2, 3};
        // now call the method with whatever object is required
        List<String> wordsList = convertArrayToList(words);
        List<Integer> numbersList = convertArrayToList(numbers);
        System.out.println(wordsList + " " + numbersList);
    }

    // Take an array as an argument and return a list
    // Instead of being strict on the type, we use a generic: T
    public static <T> List<T> convertArrayToList(T[] array) {
        return Arrays.asList(array);
    }

    // In this method the generic must be a number
    public static <T extends Number> List<T> convertArrayToList2(T[] array) {
        return Arrays.asList(array);
    }
}
