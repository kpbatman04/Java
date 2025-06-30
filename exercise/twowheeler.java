package exercise;

import exercise.inheritance.Vehicle;

public class twowheeler extends Vehicle {
    public twowheeler(){
        setNumberOfTires(2);
//        numberOfTires = 3;
    }
    public void balance(){
        System.out.println("I am balancing on 2 tires.");
    }
}
