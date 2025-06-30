package passby;

public class Testpassbyvalue {
    public static void main(String[] args) {
        int  x = 5;
        int y =10;
        int sum = add(x,y);
        System.out.println("the sum is " + sum);

    }
    public static int add(int x, int y){
        x += y;
        return x+y;
    }
}
