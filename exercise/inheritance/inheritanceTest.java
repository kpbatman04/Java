package exercise.inheritance;
import exercise.*;
public class inheritanceTest {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        twowheeler t1 = new twowheeler();

        System.out.println(v1.toString());
        System.out.println(v1.hashCode());
        System.out.println(v1.getClass() );
        v1.commute();
        t1.commute();
        t1.balance();

        MotorCycle moto = new MotorCycle();
        moto.commute();
        moto.start();
    }
}
