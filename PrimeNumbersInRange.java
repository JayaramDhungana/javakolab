//7
public class PrimeNumbersInRange {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 300 and 500 are:");
        printPrimesInRange(300, 500);
    }

    // Method to print prime numbers in a given range
    public static void printPrimesInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // For clean formatting
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Not prime if divisible by any number other than 1 and itself
            }
        } 
        return true;
    }
}
