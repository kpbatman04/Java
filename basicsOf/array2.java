package basicsOf;

import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,4,6,7,8,9,12,33};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to find in the array");
        int num = sc.nextInt();
        boolean isFound = isFound(arr,num);
        if(isFound){
            System.out.println("Your number is found");
        }
        else{
            System.out.println("your number is not found");
        }

    }
    public static boolean isFound(int[] arr,int num){
        for (int i = 0; i<arr.length;i++){
            if(arr[i] == num) return true;

        }
        return false;
    }
}
