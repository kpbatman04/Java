package sleep;

public class TestingSleep {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Before Sleep");
        Thread.sleep(10000);
        System.out.println("After sleep");
    }
}
