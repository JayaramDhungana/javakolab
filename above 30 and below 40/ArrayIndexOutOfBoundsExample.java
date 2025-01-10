/*
37. Write a program to illustrate the concept of ArrayIndexOutOfBoundsException.
*/

public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        try {
            // Initialize an array with 5 elements
            int[] numbers = {10, 20, 30, 40, 50};

            // Attempt to access an invalid index (out of bounds)
            System.out.println("Accessing element at index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception
            System.err.println("Exception caught: " + e);
            System.err.println("You tried to access an invalid index in the array.");
        }

        // Program continues execution
        System.out.println("Program continues after handling the exception.");
    }
}
