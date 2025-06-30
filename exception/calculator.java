package exception;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        a();
    }

        private static void a(){
            b();
        }
        private static void b(){
            c();
        }
        private static void c(){
            d();
        }
        private static void d(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to divison calculator");
            System.out.println("Enter two values: ");
            int first = sc.nextInt();
            int second = sc.nextInt();
            try {
                int[]a = new int[5];
//                System.out.printf("Result is %d",a[6]);
//                a[6]= first/second;
//                System.out.printf("Result is %d",a[6]);
//                System.out.println("Result is : "+result);
            }catch(ArithmeticException e){
                System.out.printf("%s, enter valid dividor",e.getMessage());

            }catch(Throwable th){
                // supreme checker
                System.out.println("Genral exception.");
            throw th; // means still shows default error by compiler
            }finally {

                System.out.println("I am in  finally");
            }

        }
}
