package basicsOf;

public class Driver {
    static int minAgeOfDriving = 18;
    String name;
    int age;
     String dateOfLicense;
     public boolean isAllowedtoDrive(){
         return this.age >= minAgeOfDriving;
     }

    @Override
    public String toString() {
        return "My car name is " + name;
    }

    public static void main(String[] args) {
        Car mycar = new Car();
        mycar = null;
//        mycar.drive();
//        System.out.println(mycar.currentFuelinLiters);
        Car swift = new Car("red");
        swift.color = "red";
        swift.addfuel(5);
//        Car startedcar = swift.start();
        swift.start().drive();
        swift.drive();

        Driver myDriver =new Driver();
//        myDriver.dateOfLicense = "1/jan/2025";
        minAgeOfDriving = 20;
        System.out.println(minAgeOfDriving);
        System.out.println(swift.toString());
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("i am in finalize");
    }

}
