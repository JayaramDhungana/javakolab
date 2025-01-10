//3 
import java.util.Scanner;

public class CheckAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Check if the character is an alphabet
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("The character '" + ch + "' is an alphabet.");
        } else {
            System.out.println("The character '" + ch + "' is not an alphabet.");
        }

        // Close the scanner
        scanner.close();
    }
}
