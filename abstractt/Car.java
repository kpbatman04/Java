package abstractt;

import exercise.inheritance.Vehicle;

public class Car extends vehicle {
    public Car(){
        super(4);
    }

    @Override
    public void makeSound() {
        System.out.println("Vroom Vroomm.");
    }

    @Override
    public void getsetGo() {
        System.out.println("going to place..");
    }
}
