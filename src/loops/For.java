package loops;

public class For {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Number: " + i);
        }

        int sum = 0;
        for (int i = 0, j = 10; i < 10; i++, j--)
            sum += i * j;
        System.out.println(sum);

        String [] words = new String[]{"Owen", "Bob", "Jim"};
        for (int i = 0; i < words.length; i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(words[i]);
        }
    }

}
