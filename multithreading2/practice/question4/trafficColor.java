package multithreading2.practice.question4;

public enum trafficColor {
    RED(5000),
    YELLO(4000),
    GREEN(3000);
    private final int onTimeInMillis;

    public int getOnTimeInMillis() {
        return onTimeInMillis;
    }

    trafficColor(int onTimeInMillis){
        this.onTimeInMillis = onTimeInMillis;
    }
}
