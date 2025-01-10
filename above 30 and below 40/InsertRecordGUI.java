/*
 * 49.	Write a Java program to insert one record to database. 
 * Assume your own database and table

 */

 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 import java.sql.*;
 
 public class InsertRecordGUI {
     public static void main(String[] args) {
         // Database credentials
         String url = "jdbc:mysql://localhost:3306/mrs"; // Replace with your database name
         String user = "root"; // Replace with your database username
         String password = ""; // Replace with your database password
 
         // Create the JFrame
         JFrame frame = new JFrame("Insert Student Record");
         frame.setSize(400, 300);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setLayout(new GridLayout(5, 2, 10, 10)); // 5 rows, 2 columns with spacing
 
         // Create Labels and Text Fields
         JLabel labelID = new JLabel("Student ID:");
         JLabel labelName = new JLabel("Name:");
         JLabel labelDistrict = new JLabel("District:");
         JLabel labelAge = new JLabel("Age:");
 
         JTextField textID = new JTextField();
         JTextField textName = new JTextField();
         JTextField textDistrict = new JTextField();
         JTextField textAge = new JTextField();
 
         // Create Insert Button
         JButton insertButton = new JButton("Insert Record");
 
         // Add Action Listener to the Button
         insertButton.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 // Read input values
                 int id = 0;
                 String name = textName.getText();
                 String district = textDistrict.getText();
                 int age = 0;
 
                 try {
                     id = Integer.parseInt(textID.getText());
                     age = Integer.parseInt(textAge.getText());
                 } catch (NumberFormatException ex) {
                     JOptionPane.showMessageDialog(frame, "ID and Age must be numbers.", "Input Error", JOptionPane.ERROR_MESSAGE);
                     return;
                 }
 
                 // Database insertion
                 String query = "INSERT INTO student (ID, name, district, age) VALUES (?, ?, ?, ?)";
                 try (Connection connection = DriverManager.getConnection(url, user, password);
                      PreparedStatement preparedStatement = connection.prepareStatement(query)) {
 
                     // Set query parameters
                     preparedStatement.setInt(1, id);
                     preparedStatement.setString(2, name);
                     preparedStatement.setString(3, district);
                     preparedStatement.setInt(4, age);
 
                     // Execute the query
                     int rowsInserted = preparedStatement.executeUpdate();
                     if (rowsInserted > 0) {
                         JOptionPane.showMessageDialog(frame, "Record inserted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                         // Clear input fields
                         textID.setText("");
                         textName.setText("");
                         textDistrict.setText("");
                         textAge.setText("");
                     }
                 } catch (SQLException ex) {
                     JOptionPane.showMessageDialog(frame, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                 }
             }
         });
 
         // Add components to the frame
         frame.add(labelID);
         frame.add(textID);
         frame.add(labelName);
         frame.add(textName);
         frame.add(labelDistrict);
         frame.add(textDistrict);
         frame.add(labelAge);
         frame.add(textAge);
         frame.add(new JLabel()); // Empty space
         frame.add(insertButton);
 
         // Make the frame visible
         frame.setVisible(true);
     }
 }
 
