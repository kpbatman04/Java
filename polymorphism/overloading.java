package polymorphism;

public class overloading {
    public int add(int a , int b){
        return a +b;
    }
    public String add(String a, String b){
        return  a+b;
    }
    public double add(int a, int b, int c, int d){
        return a+b+c+d;
    }

    public static void main(String[] args) {
        overloading o1 = new overloading();
        System.out.println("sum is "+o1.add(3,4));
    }
}
