package multithreading.runnable;

public class printtask implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d%c ",i,targetchar);
        }
        System.out.printf("\n%s%cop completed",Thread.currentThread().getName(),targetchar);
    }
    private final char targetchar;
    public printtask(char targetchar){
        this.targetchar = targetchar;
    }
}
