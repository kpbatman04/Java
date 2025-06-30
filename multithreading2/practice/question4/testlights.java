package multithreading2.practice.question4;

public class testlights {
    public static void main(String[] args) throws InterruptedException {
        Lights red = new Lights(trafficColor.RED);
        Lights yellow = new Lights(trafficColor.YELLO);
        Lights green = new Lights(trafficColor.GREEN);

        green.start();
        green.join();
        yellow.start();
        yellow.join();
        red.start();
        red.join();
    }
}
