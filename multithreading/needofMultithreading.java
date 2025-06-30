package multithreading;

public class needofMultithreading {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d* ",i);
        }
        System.out.println("* op completed");
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d# ",i);
        }
        System.out.println("# op completed");
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d@ ",i);
        }
        System.out.println("@ op completed");
        long end = System.currentTimeMillis();
        System.out.printf("Time taken : %d",end-start);
    }
}
