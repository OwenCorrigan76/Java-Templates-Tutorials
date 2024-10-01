package threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Example example = new Example();
        // Thread 1
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();  // Wait for thread t1 to finish
        t2.join();  // Wait for thread t2 to finish

        System.out.println("Final count: " + example.getCount()); // Should be 2000
    }
//        ThreadExample thread1 = new ThreadExample();
//        ThreadExample thread2 = new ThreadExample();
//
//        thread1.start();
//        thread1.setName("Thread 1");
//        thread2.start();
//        thread2.setName("Thread 2");

//        Thread thread1 = new Thread(new RunnableExample());
//        thread1.start();
//        thread1.setName("Thread 1");
//
//        Thread thread2 = new Thread(() -> {
//            int i = 0;
//            while (i < 100) {
//                System.out.println("Number " + i + " " + Thread.currentThread().getName());
//                i++;
//            }
//        });
//        thread2.start();
//        thread1.setName("Thread 2");
//    }
}
