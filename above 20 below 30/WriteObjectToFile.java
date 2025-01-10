//27
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Step 1: Create a Student class that implements Serializable
class Student implements Serializable {
    private static final long serialVersionUID = 1L; // For version control during serialization
    String name;
    int age;
    String course;

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", course='" + course + "'}";
    }
}

public class WriteObjectToFile {
    public static void main(String[] args) {
        // Step 2: Create a Student object to be written to the file
        Student student = new Student("Jayaram Dhungana", 23, "Computer Science");

        // Step 3: Write the object to a file
        try (FileOutputStream fos = new FileOutputStream("student.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
             
            oos.writeObject(student); // Write the object to the file
            System.out.println("Object written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the object: " + e.getMessage());
        }
    }
}
