/*
38. Write a Java program to read data from the file “text.txt” 
and write the data into the file “best.txt”.
*/

import java.io.*;

public class FileCopyExample {
    public static void main(String[] args) {
        // Specify the input and output file names
        String inputFile = "text.txt";
        String outputFile = "best.txt";

        // Try-with-resources to ensure proper closure of streams
        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;

            // Read from input file and write to output file line by line
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // Add a newline after each line
            }

            System.out.println("Data successfully copied from " + inputFile + " to " + outputFile);
        } catch (FileNotFoundException e) {
            System.err.println("Error: The file " + inputFile + " was not found.");
        } catch (IOException e) {
            System.err.println("Error occurred while reading or writing the file: " + e.getMessage());
        }
    }
}
