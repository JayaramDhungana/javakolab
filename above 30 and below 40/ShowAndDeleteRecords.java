/*
 * Program: Show and Delete Records (GUI)
 * This program retrieves all student records from the database and displays them in a JTable.
 * Users can select a row and delete the corresponding record.
 * Author: Your Name
 * Date: Your Date
 */

 import javax.swing.*;
 import javax.swing.table.DefaultTableModel;
 import java.awt.*;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 import java.sql.*;
 
 public class ShowAndDeleteRecords {
     public static void main(String[] args) {
         // Database credentials
         String url = "jdbc:mysql://localhost:3306/mrs"; // Replace with your database name
         String user = "root"; // Replace with your database username
         String password = ""; // Replace with your database password
 
         // Create the JFrame
         JFrame frame = new JFrame("Show and Delete Student Records");
         frame.setSize(600, 400);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setLayout(new BorderLayout());
 
         // Create table model and JTable
         DefaultTableModel tableModel = new DefaultTableModel(new String[]{"ID", "Name", "District", "Age"}, 0);
         JTable table = new JTable(tableModel);
         JScrollPane scrollPane = new JScrollPane(table);
 
         // Create Delete Button
         JButton deleteButton = new JButton("Delete Selected Record");
 
         // Panel for Delete Button
         JPanel buttonPanel = new JPanel();
         buttonPanel.add(deleteButton);
 
         // Add components to the frame
         frame.add(scrollPane, BorderLayout.CENTER);
         frame.add(buttonPanel, BorderLayout.SOUTH);
 
         // Load data from the database
         try (Connection connection = DriverManager.getConnection(url, user, password);
              Statement statement = connection.createStatement()) {
 
             // Execute query to fetch all student records
             String query = "SELECT * FROM student";
             ResultSet resultSet = statement.executeQuery(query);
 
             // Populate the table model with data
             while (resultSet.next()) {
                 int id = resultSet.getInt("ID");
                 String name = resultSet.getString("name");
                 String district = resultSet.getString("district");
                 int age = resultSet.getInt("age");
                 tableModel.addRow(new Object[]{id, name, district, age});
             }
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(frame, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
         }
 
         // Add Action Listener to the Delete Button
         deleteButton.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 // Get selected row
                 int selectedRow = table.getSelectedRow();
                 if (selectedRow == -1) {
                     JOptionPane.showMessageDialog(frame, "Please select a record to delete.", "No Selection", JOptionPane.WARNING_MESSAGE);
                     return;
                 }
 
                 // Get ID of the selected record
                 int id = (int) tableModel.getValueAt(selectedRow, 0);
 
                 // Delete the record from the database
                 String deleteQuery = "DELETE FROM student WHERE ID = ?";
                 try (Connection connection = DriverManager.getConnection(url, user, password);
                      PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
 
                     // Set query parameter
                     preparedStatement.setInt(1, id);
 
                     // Execute the query
                     int rowsDeleted = preparedStatement.executeUpdate();
                     if (rowsDeleted > 0) {
                         JOptionPane.showMessageDialog(frame, "Record deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                         tableModel.removeRow(selectedRow); // Remove the row from the table
                     }
                 } catch (SQLException ex) {
                     JOptionPane.showMessageDialog(frame, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                 }
             }
         });
 
         // Make the frame visible
         frame.setVisible(true);
     }
 }
 