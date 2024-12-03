import java.util.Scanner;

public class FactorialRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: A positive number
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calculate factorial using recursion
            long factorial = findFactorial(number);
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        // Close the scanner
        scanner.close();
    }

    // Recursive method to find factorial
    public static long findFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        }
        return n * findFactorial(n - 1); // Recursive case
    }
}
