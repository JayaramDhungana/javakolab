// 21. Write a Java program to demonstrate divide by zero exception.

public class DivideByZeroDemo {
    public static void main(String[] args) {
        int numerator = 10; // Example numerator
        int denominator = 0; // Example denominator (zero to trigger the exception)

        try {
            // Attempt division, which will cause an exception if denominator is zero
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the exception and display an error message
            System.out.println("Error: Cannot divide by zero. " + e.getMessage());
        }

        // Continue program execution after handling the exception
        System.out.println("Program continues after exception handling.");
    }
}
