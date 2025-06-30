package basicsOf;

public class Car {
    static int noOfCarsSold;
    static {
        noOfCarsSold = 0;
        System.out.println("I am in static block");
    }
    { // this will run whenever an instance is created
        noOfCarsSold++;
        System.out.println("I am in INit block");
    }

    Car(String color){
        this.color = color;
        noOfwheels = 4;
        maxspeed = 200;
    }
    Car(){// we can use whole cons. again or just use this keyword for the property necesssary
        this("black");// this must be first statement

    }
    int noOfwheels;
    String color;
    double maxspeed;
    double currentFuelinLiters  =3;
    public void drive(){
        if(currentFuelinLiters==0) System.out.println("cant drive now");
        else if (currentFuelinLiters<5) {
            System.out.println("In reserved mode, please refuel");
            currentFuelinLiters--;
        }
        else {
        System.out.println("car is driving");
        currentFuelinLiters--;
        }
    }
    public void addfuel(float currentFuelinLiters){
       this.currentFuelinLiters+=currentFuelinLiters;
    }
    public Car start(){
        if (currentFuelinLiters==0) System.out.println("Caris out of fuel !can not start.");
        else if(currentFuelinLiters < 4) System.out.println("In reserved ode please refuel");
        else System.out.println("Car is started,.... vroom vroom");
        return this;
    }
    public static void main(String[] args) {
        Car mycar = new Car("Red");
        mycar.start().drive();
        System.out.println(mycar.color);
        Car thar = new Car();
        System.out.println(thar.color);
    }
}
