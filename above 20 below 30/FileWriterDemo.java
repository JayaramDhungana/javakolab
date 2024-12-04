// 25. Write a Java program to write some lines of text to a file using character stream.

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        // Specify the file path where the text will be written
        String filePath = "output.txt";

        // Example text lines to write to the file
        String[] lines = {
            "Hello, World!",
            "This is an example of writing to a file.",
            "Java makes file handling easy!"
        };

        FileWriter fileWriter = null;

        try {
            // Initialize FileWriter to write to the file
            fileWriter = new FileWriter(filePath);

            // Write each line of text to the file
            for (String line : lines) {
                fileWriter.write(line + "\n"); // Add a newline after each line
            }

            System.out.println("Text successfully written to " + filePath);
        } catch (IOException e) {
            // Handle exceptions such as inability to write to the file
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close(); // Close the FileWriter to release resources
                }
            } catch (IOException e) {
                System.out.println("An error occurred while closing the file: " + e.getMessage());
            }
        }
    }
}
