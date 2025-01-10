/*42.	 Write GUI program using Swing components to find sum and 
difference of two numbers. Use two text fields for giving input and
 a label for output. The program 
should display sum if user presses mouse and difference if user release mouse. */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SumDifferenceCalculator {
    public static void main(String[] args) {
        // Create the frame for the GUI
        JFrame frame = new JFrame("Sum and Difference Calculator");

        // Create two text fields for user input
        JTextField num1Field = new JTextField(10);
        JTextField num2Field = new JTextField(10);

        // Create a label to display the result
        JLabel resultLabel = new JLabel("Result: ");
        
        // Create a panel to hold the text fields and label
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(new JLabel("Enter number 1: "));
        panel.add(num1Field);
        panel.add(new JLabel("Enter number 2: "));
        panel.add(num2Field);
        panel.add(resultLabel);

        // Create a MouseListener to handle mouse pressed and released events
        num1Field.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                try {
                    // Get the numbers from text fields
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    
                    // Calculate and display the sum
                    double sum = num1 + num2;
                    resultLabel.setText("Sum: " + sum);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input!");
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                try {
                    // Get the numbers from text fields
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());

                    // Calculate and display the difference
                    double difference = num1 - num2;
                    resultLabel.setText("Difference: " + difference);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input!");
                }
            }
        });

        // Set up the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(new FlowLayout());
        frame.add(panel);
        frame.setVisible(true);
    }
}
