public class MethodOverloadingSum {
    public static void main(String[] args) {
        MethodOverloadingSum obj = new MethodOverloadingSum();

        // Call method to find the sum of two numbers
        int sumOfTwo = obj.sum(10, 20);
        System.out.println("Sum of two numbers (10, 20): " + sumOfTwo);

        // Call method to find the sum of three numbers
        int sumOfThree = obj.sum(10, 20, 30);
        System.out.println("Sum of three numbers (10, 20, 30): " + sumOfThree);
    }

    // Method to calculate the sum of two numbers
    public int sum(int a, int b) {
        return a + b;
    }

    // Overloaded method to calculate the sum of three numbers
    public int sum(int a, int b, int c) {
        return a + b + c;
    }
}
