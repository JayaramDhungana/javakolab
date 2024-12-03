/*
    Question:
    13.Create a class `Swapper` with two integer instance variables `x` and `y` and a constructor with two parameters 
    that initializes the two variables. Include three member functions:
    - `getX()`: returns the value of `x`.
    - `getY()`: returns the value of `y`.
    - `swap()`: swaps the values of `x` and `y`.
    Then define a `main()` method to create an object of the `Swapper` class and swap the values of the instance variables.
*/

public class Swapper {
    // Instance variables
    private int x;
    private int y;

    // Constructor to initialize x and y
    public Swapper(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to get the value of x
    public int getX() {
        return x;
    }

    // Method to get the value of y
    public int getY() {
        return y;
    }

    // Method to swap the values of x and y
    public void swap() {
        int temp = x;
        x = y;
        y = temp;
    }

    public static void main(String[] args) {
        // Create an object of the Swapper class
        Swapper swapper = new Swapper(10, 20);

        // Display initial values of x and y
        System.out.println("Before swapping:");
        System.out.println("x = " + swapper.getX());
        System.out.println("y = " + swapper.getY());

        // Swap the values
        swapper.swap();

        // Display values after swapping
        System.out.println("After swapping:");
        System.out.println("x = " + swapper.getX());
        System.out.println("y = " + swapper.getY());
    }
}
