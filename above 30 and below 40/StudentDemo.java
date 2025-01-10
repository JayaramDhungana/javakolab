/*
36. Create a class Student with private member variables name and percentage. 
Write methods to set, display and return values of private variables in the 
Student class. Create 10 different objects of the Student class, set the values, 
and display the name of the Student who has the highest percentage in the main 
method of another class named StudentDemo.
*/

class Student {
    private String name;
    private double percentage;

    // Method to set values
    public void setValues(String name, double percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    // Method to display values
    public void displayValues() {
        System.out.println("Student[name=" + name + ", percentage=" + percentage + "]");
    }

    // Method to get name
    public String getName() {
        return name;
    }

    // Method to get percentage
    public double getPercentage() {
        return percentage;
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        // Array to hold 10 Student objects
        Student[] students = new Student[10];

        // Initializing and setting values for 10 students
        students[0] = new Student();
        students[0].setValues("Jayaram", 88.5);

        students[1] = new Student();
        students[1].setValues("Kishor", 91.0);

        students[2] = new Student();
        students[2].setValues("Srijan", 79.3);

        students[3] = new Student();
        students[3].setValues("Nar", 85.0);

        students[4] = new Student();
        students[4].setValues("Sanjay", 93.2);

        students[5] = new Student();
        students[5].setValues("Anup", 68.5);

        students[6] = new Student();
        students[6].setValues("Anjan", 75.0);

        students[7] = new Student();
        students[7].setValues("Sonit", 89.7);

        students[8] = new Student();
        students[8].setValues("Chiranjibi", 94.1);

        students[9] = new Student();
        students[9].setValues("Dinesh", 72.5);

        // Finding the student with the highest percentage
        Student topStudent = students[0];
        for (Student student : students) {
            if (student.getPercentage() > topStudent.getPercentage()) {
                topStudent = student;
            }
        }

        // Displaying the name of the student with the highest percentage
        System.out.println("\nThe student with the highest percentage:");
        topStudent.displayValues();
    }
}
