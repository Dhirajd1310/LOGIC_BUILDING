import java.util.Scanner;

class FindIndexInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];  // array of size 5

        // Taking user input
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Number to search
        System.out.print("Enter the number to search: ");
        int key = sc.nextInt();

        // Search for the number in the array
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }

        // Display result
        if (index >= 0) {
            System.out.println("The number " + key + " is found at index " + index);
        } else {
            System.out.println("Not Found");
        }
    }
}
