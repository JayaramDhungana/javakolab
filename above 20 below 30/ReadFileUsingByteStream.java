//26
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileUsingByteStream {
    public static void main(String[] args) {
        String filePath = "above 20 below 30\\output.txt"; // Replace with the path of your file
        try (FileInputStream fis = new FileInputStream(filePath)) {
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
