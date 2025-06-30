package oop;

public class AccessTest {
    public static void main(String[] args) {
        CarAccess car1 = new CarAccess();
        car1.color  = "red";
        car1.model = "swift";
        car1.cost = 876;
        System.out.println(car1);
        CarAccess newCar = new CarAccess("black","Thar",5,4567);
        System.out.println(newCar);
    }
}
