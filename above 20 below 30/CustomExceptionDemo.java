// 23. Write a Java program to demonstrate custom exception.

class CustomException extends Exception {
    // Constructor for custom exception
    public CustomException(String message) {
        super(message); // Pass message to the parent Exception class
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        int number = -10; // Example input to demonstrate the custom exception

        try {
            // Check if number is negative, throw custom exception if true
            if (number < 0) {
                throw new CustomException("Number cannot be negative!");
            } else {
                System.out.println("Number is: " + number);
            }
        } catch (CustomException e) {
            // Handle the custom exception
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }

        // Program continues execution after handling the exception
        System.out.println("Program continues after exception handling.");
    }
}
