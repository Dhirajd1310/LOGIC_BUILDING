import java.util.Arrays;
import java.util.Scanner;

class SortArrayAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];  // array of size 5

        // Taking user input
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();   // user enters numbers one by one
        }

        // Sorting the array
        Arrays.sort(arr);

        // Printing sorted array
        System.out.println("Sorted array in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
