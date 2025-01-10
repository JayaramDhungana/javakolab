//2
import java.util.Scanner;

public class SecondLargestInArray {
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

        // Check if the array has at least two elements
        if (size < 2) {
            System.out.println("Array must have at least two elements.");
        } else {
            // Find the largest and second largest elements
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int num : arr) {
                if (num > largest) {
                    secondLargest = largest;
                    largest = num;
                } else if (num > secondLargest && num != largest) {
                    secondLargest = num;
                }
            }

            // Output the result
            if (secondLargest == Integer.MIN_VALUE) {
                System.out.println("There is no second largest element.");
            } else {
                System.out.println("The second largest element is: " + secondLargest);
            }
        }

        // Close the scanner
        scanner.close();
    }
}
