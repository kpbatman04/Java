package multithreading.runnable;

public class threadPriority {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        printtask p1 = new printtask('*');
        printtask p2 = new printtask('$');
        printtask p3 = new printtask('#');
        Thread t1 = new Thread(p1);
        t1.setPriority(Thread.MIN_PRIORITY); // do nto give guarantee
        t1.start();
        Thread t2 = new Thread(p2);
        t2.setPriority(Thread.NORM_PRIORITY);
        t2.start();
        Thread t3 = new Thread(p3);
        t3.setPriority(Thread.MAX_PRIORITY);
        t3.start();
        long end = System.currentTimeMillis();
        System.out.printf("%s Time taken : %d",Thread.currentThread().getName(),end-start);
    }
}
