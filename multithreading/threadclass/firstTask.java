package multithreading.threadclass;

public class firstTask extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d* ",i);
        }
        System.out.printf("\n%s * op completed",Thread.currentThread().getName());
    }
}
