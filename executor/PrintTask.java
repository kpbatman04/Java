package executor;

public class PrintTask implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("%d%c ",i,targetchar);
        }
        System.out.printf("\n%s%c Task completed",Thread.currentThread().getName(),targetchar);
    }
    private final char targetchar;
    public PrintTask(char targetchar){
        this.targetchar = targetchar;
    }
}
