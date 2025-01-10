/*
33. Write a program to create a class Student with data members roll and name. 
Sort the 10 objects of this class on the basis of name.
*/

import java.util.Arrays;

class Student {
    private int roll;
    private String name;

    // Constructor
    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    // Getters
    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student[roll=" + roll + ", name=" + name + "]";
    }

    public static void main(String[] args) {
        // Array of 10 Student objects
        Student[] students = {
            new Student(1, "Jayaram"),
            new Student(2, "kishor"),
            new Student(3, "Srijan"),
            new Student(4, "Sonit"),
            new Student(5, "Chiranjibi"),
            new Student(6, "Sunil"),
            new Student(7, "Dinesh"),
            new Student(8, "Anup"),
            new Student(9, "Anjan"),
            new Student(10, "Sushma")
        };

        // Sorting the array based on name
        Arrays.sort(students, (s1, s2) -> s1.getName().compareTo(s2.getName()));

        // Printing sorted array
        System.out.println("\nSorted Students (by name):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
