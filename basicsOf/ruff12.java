package basicsOf;

public class ruff12 {
    public static int findSmallest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int smallest = arr[0];
        int smallestindex = 0;// Assume first element is the smallest
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallestindex = i;
            }
        }
        return smallestindex;
    }
    public static void main(String[] args) {
        int[] arr= {5, 3, 9, 1, 6, 0};
        System.out.println(arr.length); ;
        System.out.println("Smallest number: " + findSmallest(arr));
    }
}
