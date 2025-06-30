package executor.Problems.question2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestQ2 {
//    public static void main(String[] args) throws InterruptedException {
//        ExecutorService executor = Executors.newFixedThreadPool(4);
//        printCurrentThread thread1 = new printCurrentThread("abc1");
//        printCurrentThread thread2 = new printCurrentThread("abc2");
//        printCurrentThread thread3 = new printCurrentThread("abc3");
//        printCurrentThread thread4 = new printCurrentThread("abc4");
//
//        for (int i = 0; i <4 ; i++) {
//            printCurrentThread thread = new printCurrentThread("abc"+i);
//            executor.submit(thread);
//            Thread.sleep(4000);
//
//        }
//        executor.shutdown();
//    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i <4 ; i++) {
            SleepTask task = new SleepTask();
            executor.submit(task);
        }
        executor.shutdown();
        if (!executor.awaitTermination(15, TimeUnit.SECONDS)) {
            System.out.println("\nEMERGENCY SHUTDOWN");
            executor.shutdownNow();
        }
    }
}
