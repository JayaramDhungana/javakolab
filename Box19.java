// Define the Box class with instance variables length, breadth, and height
class Box19 {
    protected double length;
    protected double breadth;
    protected double height;

    // Constructor for Box class to initialize the dimensions
    public Box19(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    // Method to calculate the volume of the box
    public double getVolume() {
        return length * breadth * height;
    }

    // Main method inside the Box class
    public static void main(String[] args) {
        // Create a Shipment object with specific dimensions, weight and cost details
        Shipment shipment = new Shipment(5.0, 3.0, 4.0, 10.0, 100.0);

        // Calculate and display the volume of the shipment
        System.out.println("Volume of the Shipment: " + shipment.getVolume() + " cubic units");

        // Calculate and display the weight of the shipment
        System.out.println("Weight of the Shipment: " + shipment.getWeight() + " kg");

        // Calculate and display the cost of the shipment
        System.out.println("Cost of the Shipment: " + shipment.getCost() + " USD");
    }
}

// Define the BoxWeight class that extends Box and adds weight
class BoxWeight extends Box19 {
    protected double weight;

    // Constructor for BoxWeight class to initialize dimensions and weight
    public BoxWeight(double length, double breadth, double height, double weight) {
        super(length, breadth, height); // Call the constructor of Box class
        this.weight = weight;
    }

    // Method to get the weight of the box
    public double getWeight() {
        return weight;
    }
}

// Define the Shipment class that extends BoxWeight and adds cost
class Shipment extends BoxWeight {
    private double cost;

    // Constructor for Shipment class to initialize dimensions, weight, and cost
    public Shipment(double length, double breadth, double height, double weight, double cost) {
        super(length, breadth, height, weight); // Call the constructor of BoxWeight class
        this.cost = cost;
    }

    // Method to get the cost of the shipment
    public double getCost() {
        return cost;
    }
}
