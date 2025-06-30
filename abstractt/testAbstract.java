package abstractt;

public class testAbstract {
    public static void main(String[] args) {
//        vehicle veh = new vehicle(2); // abstract class can only be inherited
        Car car = new Car();
        car.commute();
        car.makeSound();

    }
}
