package Challenges.Enumchallenge;

public class testclass {
    public static void main(String[] args) {
          days d1;
        System.out.println("Days of the week");
        for (days value : days.values()) {
            System.out.println(value +" "+ value.getType());
        }
    }
}
