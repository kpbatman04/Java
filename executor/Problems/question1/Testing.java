package executor.Problems.question1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Testing {
    public static void main(String[] args) {
        try{
            ExecutorService service = Executors.newSingleThreadExecutor();
            PrintNum p1 = new PrintNum();
            service.submit(p1);
            service.shutdown();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
