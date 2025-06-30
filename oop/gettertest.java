package oop;

import gettersetter.Car;

public class gettertest {
    public static void main(String[] args) {
        Car  car  = new Car("blue",
                "bolero",14,45500);
        car.setColor("black");
        System.out.printf("%s %s",car.getColor(),car.getModel());
    }
}
