/*
 * 47.Adding Two Numbers Using Swing Components
 
 */

 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 
 public class AddTwoNumbers {
     public static void main(String[] args) {
         // Create a JFrame
         JFrame frame = new JFrame("Add Two Numbers");
         frame.setSize(400, 300);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setLayout(new GridLayout(4, 2, 10, 10)); // 4 rows, 2 columns, with gaps
 
         // Create Labels
         JLabel labelNum1 = new JLabel("Number 1:");
         JLabel labelNum2 = new JLabel("Number 2:");
         JLabel labelResult = new JLabel("Result:");
 
         // Create Text Fields
         JTextField textNum1 = new JTextField();
         JTextField textNum2 = new JTextField();
         JTextField textResult = new JTextField();
         textResult.setEditable(false); // Output field should not be editable
 
         // Create Button
         JButton addButton = new JButton("Add");
 
         // Add Action Listener to the Button
         addButton.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 try {
                     // Parse numbers from the text fields
                     double num1 = Double.parseDouble(textNum1.getText());
                     double num2 = Double.parseDouble(textNum2.getText());
 
                     // Calculate sum
                     double sum = num1 + num2;
 
                     // Display the result
                     textResult.setText(String.valueOf(sum));
                 } catch (NumberFormatException ex) {
                     // Handle invalid input
                     JOptionPane.showMessageDialog(frame, "Please enter valid numbers", "Error", JOptionPane.ERROR_MESSAGE);
                 }
             }
         });
 
         // Add components to the frame
         frame.add(labelNum1);
         frame.add(textNum1);
         frame.add(labelNum2);
         frame.add(textNum2);
         frame.add(labelResult);
         frame.add(textResult);
         frame.add(addButton);
 
         // Set frame visibility
         frame.setVisible(true);
     }
 }
 