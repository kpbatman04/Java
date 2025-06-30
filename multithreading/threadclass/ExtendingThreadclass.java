package multithreading.threadclass;

public class ExtendingThreadclass {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        firstTask t1 = new firstTask();
        secondTask t2 = new secondTask();
        thirdtask t3 = new thirdtask();
        System.out.println("\n startinf first thread;");
        t1.start();
        System.out.println("\n startinf second thread;");
        t2.start();
        System.out.println("\n startinf third thread;");
        t3.start();
        long end = System.currentTimeMillis();
        System.out.printf("%s Time taken : %d",Thread.currentThread().getName(),end-start);
    }
}
