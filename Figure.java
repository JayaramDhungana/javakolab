//20. Define an abstract class Figure with instance variables dim1 and dim2
abstract class Figure {
    protected double dim1;
    protected double dim2;

    // Constructor to initialize dim1 and dim2
    public Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    // Abstract method to be implemented by subclasses to calculate the area
    public abstract double getArea();

    // Main method inside the Figure class
    public static void main(String[] args) {
        // Create a Rectangle object and a Triangle object
        Figure rectangle = new Rectangle(5.0, 4.0); // length = 5.0, breadth = 4.0
        Figure triangle = new Triangle(6.0, 3.0);  // base = 6.0, height = 3.0

        // Calculate and display the area of the rectangle
        System.out.println("Area of Rectangle: " + rectangle.getArea() + " square units");

        // Calculate and display the area of the triangle
        System.out.println("Area of Triangle: " + triangle.getArea() + " square units");
    }
}

// Define the Rectangle class that extends Figure and implements getArea
class Rectangle extends Figure {

    // Constructor for Rectangle class
    public Rectangle(double length, double breadth) {
        super(length, breadth); // Initialize dim1 and dim2 using the superclass constructor
    }

    // Method to calculate the area of the rectangle
    @Override
    public double getArea() {
        return dim1 * dim2; // Area = length * breadth
    }
}

// Define the Triangle class that extends Figure and implements getArea
class Triangle extends Figure {

    // Constructor for Triangle class
    public Triangle(double base, double height) {
        super(base, height); // Initialize dim1 and dim2 using the superclass constructor
    }

    // Method to calculate the area of the triangle
    @Override
    public double getArea() {
        return 0.5 * dim1 * dim2; // Area = 0.5 * base * height
    }
}
