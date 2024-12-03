/*
    Question:
    15.Create a `USMoney` class with two integer instance variables `dollars` and `cents`.
    Add a constructor with two parameters for initializing a `USMoney` object. 
    The constructor should ensure that the cents value is between 0 and 99 by transferring extra cents to dollars.
    Add a `plus` method that adds two `USMoney` objects and returns a new `USMoney` object with the correct total dollars and cents.
    Then define a `main()` method to create two `USMoney` objects and add them using the `plus` method.
*/

public class USMoney {
    // Instance variables
    private int dollars;
    private int cents;

    // Constructor to initialize dollars and cents
    public USMoney(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
        normalize(); // Adjust cents if out of range
    }

    // Normalize method to handle overflow of cents
    private void normalize() {
        if (cents >= 100) {
            dollars += cents / 100; // Add extra cents to dollars
            cents = cents % 100;    // Keep cents between 0 and 99
        } else if (cents < 0) {
            int borrowedDollars = (Math.abs(cents) / 100) + 1;
            dollars -= borrowedDollars;
            cents += borrowedDollars * 100;
        }
    }

    // Method to add two USMoney objects
    public USMoney plus(USMoney other) {
        int totalDollars = this.dollars + other.dollars;
        int totalCents = this.cents + other.cents;
        return new USMoney(totalDollars, totalCents);
    }

    // Method to represent USMoney as a string
    @Override
    public String toString() {
        return "$" + dollars + "." + String.format("%02d", cents);
    }

    public static void main(String[] args) {
        // Create two USMoney objects
        USMoney x = new USMoney(5, 80);  // $5.80
        USMoney y = new USMoney(1, 90);  // $1.90

        // Add the two USMoney objects
        USMoney sum = x.plus(y);

        // Print the results
        System.out.println("First Amount: " + x);
        System.out.println("Second Amount: " + y);
        System.out.println("Total Amount: " + sum); // Expected: $7.70
    }
}
