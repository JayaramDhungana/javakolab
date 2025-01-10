
//29
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {
    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("example.txt", "rw")) {
            // Write data at the beginning of the file
            raf.writeUTF("Hello, World!");
            // Seek to a specific position
            raf.seek(0);
            // Read data from the file
            String message = raf.readUTF();
            System.out.println("Message read from file: " + message);
            
            // Write at a specific position
            raf.seek(6); // Move to the 6th byte
            raf.writeUTF("Java");
            
            // Move back and read the modified data
            raf.seek(0);
            String updatedMessage = raf.readUTF();
            System.out.println("Updated message: " + updatedMessage);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
