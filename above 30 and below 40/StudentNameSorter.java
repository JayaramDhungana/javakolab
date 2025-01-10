/*40.	Write a Java program reads N names of students
 and then sort them in ascending order. */
import java.util.*;

public class StudentNameSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the leftover newline character
        
        // Create an array or list to store student names
        List<String> studentNames = new ArrayList<>();
        
        // Input student names
        System.out.println("Enter the names of the students:");
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            studentNames.add(name);
        }

        // Sort the names in ascending order
        Collections.sort(studentNames);

        // Output the sorted names
        System.out.println("\nSorted names of students:");
        for (String name : studentNames) {
            System.out.println(name);
        }

        // Close the scanner
        scanner.close();
    }
}
