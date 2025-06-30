package executor.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestingFutures {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(4);
        FetchName t1 = new FetchName("Krish");
        FetchName t2 = new FetchName("Khushi");
        FetchName t3 = new FetchName("Jay");
        FetchName t4 = new FetchName("Jaimin ");

        Future<String> name1 = service.submit(t1);
        Future<String> name2 = service.submit(t2);
        Future<String> name3 = service.submit(t3);
        Future<String> name4 = service.submit(t4);

        System.out.printf("\nFull Name : %s",name1.get()); // get makes other threads wait
        System.out.printf("\nFull Name : %s",name2.get());
        System.out.printf("\nFull Name : %s",name3.get());
        System.out.printf("\nFull Name : %s",name4.get());

        service.shutdown();
    }
}
