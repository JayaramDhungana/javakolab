
//17.Create a class Box with fields width, height and depth. 
//Add methods getArea () and getVolume (). Use suitable constructors. 
//From main () method create an object of Box class and find its area as volume.
// Define the Box class with fields for width, height, and depth
class Box {
    private double width;
    private double height;
    private double depth;

    // Constructor to initialize the Box object with width, height, and depth
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate the surface area of the box
    public double getArea() {
        return 2 * (width * height + height * depth + width * depth);
    }

    // Method to calculate the volume of the box
    public double getVolume() {
        return width * height * depth;
    }

    // Main method inside the Box class
    public static void main(String[] args) {
        // Create an object of Box with specific dimensions
        Box box = new Box(5.0, 3.0, 4.0);

        // Calculate and display the surface area of the box
        double area = box.getArea();
        System.out.println("Surface Area of the Box: " + area);

        // Calculate and display the volume of the box
        double volume = box.getVolume();
        System.out.println("Volume of the Box: " + volume);
    }
}

