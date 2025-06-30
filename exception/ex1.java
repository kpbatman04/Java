package exception;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first ;
        int second;
        System.out.println("enter two numbers!");
        first = sc.nextInt();
        second = sc.nextInt();
        try{
            int result  = first /second;
            System.out.println("the result is " + result);
        }catch (ArithmeticException e){
            if (e.getMessage().equals("/ by zero")){
                System.out.println("Invalid dividor");
            }else{
                throw e;
            }

        }finally{
            System.out.println("i am in finally");
        }
    }
}
