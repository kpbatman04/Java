package basicsOf;

import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        System.out.println("Enter the number you want factorial of: ");
        System.out.println(Math.random());
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The factrial is " + factorial(num));
    }
    public static long factorial(int num){
        if(num==1) return 1;
        return num*factorial(num-1);
    }
}
