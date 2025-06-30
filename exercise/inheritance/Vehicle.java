package exercise.inheritance;

public class Vehicle {
   protected  int numberOfTires;//if we make it
    //default then it will only be applicable in the only package but if we make it protected then it can be accessed in outer own package too

    public  void setNumberOfTires(int numberOfTires){
            this.numberOfTires = numberOfTires;
    }
    @Override
    public String toString(){
        return "Vehicle no of tyres : " + numberOfTires;
    }

    public void commute(){
        System.out.printf("I am going from A to B on %d tires\n",numberOfTires);
    }
}
