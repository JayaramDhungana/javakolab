//4
import java.util.Scanner;

public class CheckArraySorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input: elements of the array
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Check if the array is sorted
        boolean isSorted = true;
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        // Output the result
        if (isSorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }

        // Close the scanner
        scanner.close();
    }
}
