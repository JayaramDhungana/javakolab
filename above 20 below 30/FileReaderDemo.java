// 24. Write a Java program to read contents of a file using character stream.

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        // Specify the file path (modify this according to your file location)
        String filePath = "above 20 below 30\\example.txt";

        FileReader fileReader = null;

        try {
            // Initialize FileReader to read the file
            fileReader = new FileReader(filePath);
            int character;

            System.out.println("File Contents:");
            // Read the file character by character until end of file (-1)
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            // Handle exceptions such as file not found or read errors
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close(); // Close the FileReader to release resources
                }
            } catch (IOException e) {
                System.out.println("An error occurred while closing the file: " + e.getMessage());
            }
        }
    }
}
