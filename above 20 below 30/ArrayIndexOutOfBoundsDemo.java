// 22. Write a Java program to demonstrate array index bounds exception.

public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        // Example array with 5 elements
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            // Access an element outside the array bounds
            System.out.println("Accessing the 10th element: " + numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception and display an error message
            System.out.println("Error: Array index out of bounds. " + e.getMessage());
        }

        // Continue program execution after handling the exception
        System.out.println("Program continues after exception handling.");
    }
}
