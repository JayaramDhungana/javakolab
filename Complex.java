/*
    Question:
    11.Write a Java program to add two complex numbers.
    A complex number has a real part and an imaginary part.
    The program should define a class `Complex` with instance variables for the real and imaginary parts, 
    a constructor to initialize these values, and a method to add two complex numbers.
    The main method should demonstrate the addition of two complex numbers and print the result.
*/

public class Complex {
    // Instance variables for the real and imaginary parts
    private double real;
    private double imaginary;

    // Constructor to initialize the real and imaginary parts
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers and return the result as a new Complex object
    public Complex add(Complex other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    // Method to represent the complex number as a string
    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }

    public static void main(String[] args) {
        // Create two complex numbers
        Complex c1 = new Complex(3.5, 4.5);
        Complex c2 = new Complex(1.5, 2.5);

        // Add the two complex numbers
        Complex sum = c1.add(c2);

        // Print the result
        System.out.println("First Complex Number: " + c1);
        System.out.println("Second Complex Number: " + c2);
        System.out.println("Sum of Complex Numbers: " + sum);
    }
}
