package polymorphism;

public abstract class Vehicle {
     private int noOftires;
     Vehicle(){
          this.noOftires = 0;
     }

     public Vehicle(int noOftires) {
          this.noOftires = noOftires;
     }

     public int getNoOftires() {
          return noOftires;
     }

     public void start(){
          System.out.println("Vehicle is starting");
     }
}
