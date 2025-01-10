//28
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectFromFile {
    public static void main(String[] args) {
        // Step 1: Read the object from the file
        try (FileInputStream fis = new FileInputStream("student.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
             
            Student student = (Student) ois.readObject(); // Deserialize object from the file
            System.out.println("Object read from file: " + student);
            
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred while reading the object: " + e.getMessage());
        }
    }
}
