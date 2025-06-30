package executor.Problems.question3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestingFactorial {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newFixedThreadPool(3)) {
            List<Future<Integer>> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                FacorialCalculator task = new FacorialCalculator(i);
                list.add(service.submit(task));
            }
            for (Future<Integer> future : list) {
                System.out.printf("\nResult is %d", future);
            }

        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}