/*
35. Create a Shape interface having methods area() and perimeter(). 
Create two subclasses, Circle and Rectangle that implement the Shape interface. 
Create a class Sample with main method and demonstrate the area and perimeters 
of both the Shape classes. You need to handle the values of length, breadth, and 
radius in respective classes to calculate their area and perimeter.
*/

// Shape Interface
interface Shape {
    double area();
    double perimeter();
}

// Circle Class
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// Rectangle Class
class Rectangle implements Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return length * breadth;
    }

    @Override
    public double perimeter() {
        return 2 * (length + breadth);
    }
}

// Sample Class with Main Method
public class Sample {
    public static void main(String[] args) {
        // Create a Circle object
        Shape circle = new Circle(5.0); // radius = 5.0
        System.out.println("\nCircle:");
        System.out.println("Area: " + circle.area());
        System.out.println("Perimeter: " + circle.perimeter());

        // Create a Rectangle object
        Shape rectangle = new Rectangle(4.0, 6.0); // length = 4.0, breadth = 6.0
        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());
    }
}
