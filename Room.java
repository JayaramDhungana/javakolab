//18. Define the Room class with instance variables length and breadth
// Define the Room class with instance variables length and breadth
class Room {
    protected double length;
    protected double breadth;

    // Constructor for Room class
    public Room(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate the area of the room
    public double getArea() {
        return length * breadth;
    }

    // Main method inside the Room class
    public static void main(String[] args) {
        // Create two MyRoom objects with specific dimensions
        MyRoom room1 = new MyRoom(5.0, 3.0, 4.0);
        MyRoom room2 = new MyRoom(6.0, 4.0, 3.5);

        // Calculate and display the area and volume of room1
        System.out.println("Room 1:");
        System.out.println("Area: " + room1.getArea() + " square units");
        System.out.println("Volume: " + room1.getVolume() + " cubic units");

        // Calculate and display the area and volume of room2
        System.out.println("\nRoom 2:");
        System.out.println("Area: " + room2.getArea() + " square units");
        System.out.println("Volume: " + room2.getVolume() + " cubic units");
    }
}

// Define the MyRoom class that extends Room class and adds height
class MyRoom extends Room {
    private double height;

    // Constructor for MyRoom class
    public MyRoom(double length, double breadth, double height) {
        super(length, breadth); // Call the constructor of Room class
        this.height = height;
    }

    // Method to calculate the volume of the room
    public double getVolume() {
        return getArea() * height; // Volume = Area * Height
    }
}



    

