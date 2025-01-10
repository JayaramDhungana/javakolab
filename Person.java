/*
    Question:16
    Create a `Person` class with private instance variables for the person’s name and birth date. 
    Add appropriate getter and setter methods for these variables. 
    Create a subclass `CollegeGraduate` with private instance variables for the student’s GPA and year of graduation, 
    along with appropriate getter and setter methods. Include constructors for both classes.
    The `main` method is placed inside the `Person` class to demonstrate the functionality.
*/

// Person class with private instance variables for name and birth date
class Person {
    private String name, birthDate;

    // Constructor for Person class
    public Person(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    // Getter methods
    public String getName() { return name; }
    public String getBirthDate() { return birthDate; }

    // Display the person's information
    public void displayInfo() {
        System.out.println("Name: " + name + "\nBirth Date: " + birthDate);
    }

    // Main method
    public static void main(String[] args) {
        // Creating an object of CollegeGraduate
        CollegeGraduate graduate = new CollegeGraduate("Jayaram Dhungana", "2001-07-11", 3.9, 2021);

        // Display graduate's information
        graduate.displayInfo();
    }
}

// CollegeGraduate class inheriting from Person class
class CollegeGraduate extends Person {
    private double gpa;
    private int graduationYear;

    // Constructor for CollegeGraduate class
    public CollegeGraduate(String name, String birthDate, double gpa, int graduationYear) {
        super(name, birthDate);  // Call the constructor of the superclass (Person)
        this.gpa = gpa;
        this.graduationYear = graduationYear;
    }

    // Display graduate's complete information
    @Override
    public void displayInfo() {
        super.displayInfo();  // Display basic person info
        System.out.println("GPA: " + gpa + "\nGraduation Year: " + graduationYear);
    }
}
