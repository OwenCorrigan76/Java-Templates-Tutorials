package threads;

public class Main {
    public static void main(String[] args) {
//        ThreadExample thread1 = new ThreadExample();
//        ThreadExample thread2 = new ThreadExample();
//
//        thread1.start();
//        thread1.setName("Thread 1");
//        thread2.start();
//        thread2.setName("Thread 2");

        Thread thread1 = new Thread(new RunnableExample());
        thread1.start();
        thread1.setName("Thread 1");

        Thread thread2 = new Thread(() -> {
            int i = 0;
            while (i < 100) {
                System.out.println("Number " + i + " " + Thread.currentThread().getName());
                i++;
            }
        });
        thread2.start();
        thread1.setName("Thread 2");
    }
}
