package enums;

public enum trafficLights {
    RED("Stop"),GREEN("Go"),YELLOW("start");
    private final String action;

    trafficLights(String action) {
        this.action = action;
    }
}
