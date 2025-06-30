package executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestingMultiThreadExecutor {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            PrintTask task  = new PrintTask((char)i);
            executor.submit(task);
        }
        executor.shutdown();
//        PrintTask task1 = new PrintTask('*');
//        PrintTask task2 = new PrintTask('$');
//        PrintTask task3 = new PrintTask('#');
//
//        executor.submit(task1);
//        executor.submit(task2);
//        executor.submit(task3);
        System.out.println("\n***********1");
        if(!executor.awaitTermination(10, TimeUnit.SECONDS)){
            System.out.println("\n***********2");
            executor.shutdownNow();
        }
    }
}
