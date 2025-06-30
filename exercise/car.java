package exercise;

public class car extends vehicle{
    @Override
    public void service(){
        super.service();
        System.out.println("car's service");
    }

    public static void main(String[] args) {
        car c1 = new car();
        c1.service();
    }
}
