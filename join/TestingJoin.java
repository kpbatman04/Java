package join;

import multithreading.runnable.printtask;

public class TestingJoin {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();

        printtask p1 = new printtask('*');
        printtask p2 = new printtask('$');
        printtask p3 = new printtask('#');
        Thread t1 = new Thread(p1);
        t1.start();
        System.out.println("\n thread 1 started");
        Thread t2 = new Thread(p2);
        t2.start();
        System.out.println("\nthread 2 started");
        t1.join();
        Thread t3 = new Thread(p3);
        t3.start();
        System.out.println("\nthread 3 started");
        long end = System.currentTimeMillis();
        System.out.printf("%s Time taken : %d",Thread.currentThread().getName(),end-start);
    }
}
