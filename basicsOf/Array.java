import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        System.out.println("ENter the size of array");
        Scanner sc  = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " +size+" elements");
        for (int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The values are as follows");
        for (int i =0;i<size;i++){
            System.out.print(+arr[i]+" ");
//            System.out.println(" ");
        }

    }
}
