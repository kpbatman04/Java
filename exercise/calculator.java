package exercise;

public class calculator {
    public static int add(int a, int b){
        return a+b;
    }
//    public int add(int a, int b, int c){
//        return a+b+c;

    public static double add(double a, double b,double c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(add(2,3));
        System.out.println(add(2,3,5));
    }
}
