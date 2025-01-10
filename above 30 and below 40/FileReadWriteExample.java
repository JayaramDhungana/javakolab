/*
39. Write a Java program writes line of text to existing file.
 Also read the content of this file and write down on monitor
*/

import java.io.*;

public class FileReadWriteExample {
    public static void main(String[] args) {
        String filePath = "example.txt";  // The file to read and write to
        
        // Writing a line of text to the file
        try (FileWriter writer = new FileWriter(filePath, true); // 'true' for append mode
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.write("This is a new line of text.");
            bufferedWriter.newLine();  // To ensure a new line after the text
            System.out.println("Text written to file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }

        // Reading the content of the file and printing it on the monitor
        try (FileReader reader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            System.out.println("\nContent of the file:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        }
    }
}

