/*41.	Write a Simple GUI program that displays “hello World” in a 
text field. The program should display if user clicks a button.

 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorldGUI {
    public static void main(String[] args) {
        // Create the frame for the GUI
        JFrame frame = new JFrame("Hello World GUI");
        
        // Create a text field to display the message
        JTextField textField = new JTextField(20);
        textField.setEditable(false);  // Make the text field non-editable
        
        // Create a button that will trigger the action
        JButton button = new JButton("Click Me!");
        
        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("Hello World");
            }
        });

        // Set the layout of the frame
        frame.setLayout(new FlowLayout());
        
        // Add the button and text field to the frame
        frame.add(button);
        frame.add(textField);
        
        // Set default close operation and frame size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}
