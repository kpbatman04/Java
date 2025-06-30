package executor.Problems.question3;

import java.util.concurrent.Callable;

public class FacorialCalculator implements Callable<Integer> {
    private final int number;

    public FacorialCalculator(int number) {
        this.number = number;
    }
    public int fact(int number){
        if (number <= 1) {
            return 1;
        }
        else return fact(number)*fact(number-1);
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(2000);
            if(number <= 1) return 1;
            int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return null;
    }
}
