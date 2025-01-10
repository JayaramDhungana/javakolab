//9
public class AreaCalculator {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        // Calculate and display area of a circle
        double circleArea = calculator.calculateArea(7.0);
        System.out.println("Area of the circle (radius 7): " + circleArea);

        // Calculate and display area of a rectangle
        double rectangleArea = calculator.calculateArea(5.0, 10.0);
        System.out.println("Area of the rectangle (length 5, breadth 10): " + rectangleArea);

        // Calculate and display area of a triangle
        double triangleArea = calculator.calculateArea(8.0, 6.0, true);
        System.out.println("Area of the triangle (base 8, height 6): " + triangleArea);
    }

    // Method to calculate the area of a circle
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Overloaded method to calculate the area of a rectangle
    public double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    // Overloaded method to calculate the area of a triangle
    public double calculateArea(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        }
        return 0.0;
    }
}
