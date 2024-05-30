package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    // designed to hold an item that needs to be processed
    // Queue is an ordered Collection
    // First in last out

    public static void niceFruits(){
        Queue<String> fruits = new LinkedList<String>();
        fruits.add("apple");
        fruits.add("pear");
        fruits.add("mango");

        // removes the first element of the collection
        String removed = fruits.remove();
        // prints: apple
        System.out.println(removed);

        // peel to look at new head of the queue
        System.out.println("The new head is: " + fruits.peek());
    }
}
