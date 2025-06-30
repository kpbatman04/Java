package multithreading2.practice.question4;

public class Lights extends Thread{
    private final trafficColor color;

    public Lights(trafficColor color) {
        this.color = color;
    }

    @Override
    public void run() {
        System.out.printf(" %s active signal\n", color);
        try {
            Thread.sleep(color.getOnTimeInMillis());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s Inactive\n",color);
    }
}
