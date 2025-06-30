package polymorphism;

public class testtransport {
    public static void main(String[] args) {
        Car c = new Car(4);
//        Vehicle v = new Vehicle();
//        Vehicle vcar = new Car();
//         Car cVehivcle = (Car) new Vehicle();
        plane p = new plane();
//        c.start();
//        p.start();
        castTest(c);
        castTest(p);
//        castTest(cVehivcle);
//        Object ref = new Vehicle();
        }
        private static void   castTest(Vehicle veh){

//            Car cvehicle = (Car) veh;
//            ((Car) veh).noofdoors();
            veh.start(); // rumtime polymorphism
    }
}
