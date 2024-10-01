package loops;

import java.util.ArrayList;
import java.util.List;

public class BreakContinue {
    public static void main(String[] args) {
        int[] data1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 9;
        int index;
        for (int i = 0; i < data1.length; i++) {
            if (data1[i] == target) { // When we find what we're looking for,
                index = i; // remember where we found it
                System.out.println(index);
                break; // and stop looking! }
            } // The Java interpreter goes here after executing break


        int[] data2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int j = 0; j < data2.length; j++) { // Loop through data.
            if (data2[j] == 1) continue;
            System.out.println(data2[j]);
        }
    }
}
}