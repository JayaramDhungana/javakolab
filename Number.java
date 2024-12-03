// 10.	Create a class Number with three int instance variable x , y and z. The class will have one constructor. The class also will contain member function getMax () that will return the largest number. Create a main method that will create an object of Number and will print the largest number.
public class Number {
    // Instance variables
    int x, y, z;

    // Constructor to initialize the values of x, y, and z
    public Number(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Member function to return the largest number
    public int getMax() {
        // Find the maximum of x, y, and z
        int max = x;

        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }

        return max;
    }

    public static void main(String[] args) {
        // Create an object of the Number class
        Number number = new Number(10, 20, 15);

        // Print the largest number using getMax method
        System.out.println("The largest number is: " + number.getMax());
    }
}
