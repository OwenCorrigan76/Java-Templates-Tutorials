package loops;

public class For {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++){
            System.out.println("Number: " + i);
        }

        int sum = 0;
        for(int i=0,j=10; i<10; i++,j--)
            sum +=i*j;
        System.out.println(sum);
    }
}
