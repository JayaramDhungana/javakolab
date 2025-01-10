/*
 * 48.Write a Java program to retrieve and display the records of students who live 
 * in the Kathmandu district. Assume the student table in the database has four
 *  attributes: ID, name, district,
 *  and age. Use GUI components to display the data in tabular format.
 */

 import javax.swing.*;
 import javax.swing.table.DefaultTableModel;
 import java.sql.*;
 
 public class FetchKathmanduStudentsGUI {
     public static void main(String[] args) {
         // Database credentials
         String url = "jdbc:mysql://localhost:3306/mrs"; // Replace with your database name
         String user = "root"; // Replace with your database username
         String password = ""; // Replace with your database password
 
         // SQL query to fetch students from Kathmandu district
         String query = "SELECT * FROM student WHERE district = 'Kathmandu'";
 
         // Initialize JFrame
         JFrame frame = new JFrame("Students from Kathmandu");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(600, 400);
 
         // Table to display data
         String[] columnNames = {"ID", "Name", "District", "Age"};
         DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
         JTable table = new JTable(tableModel);
         JScrollPane scrollPane = new JScrollPane(table);
 
         frame.add(scrollPane);
 
         // JDBC objects
         Connection connection = null;
         Statement statement = null;
         ResultSet resultSet = null;
 
         try {
             // Load the MySQL JDBC driver
             Class.forName("com.mysql.cj.jdbc.Driver");
 
             // Establish connection
             connection = DriverManager.getConnection(url, user, password);
 
             // Create a statement object to execute the query
             statement = connection.createStatement();
 
             // Execute the query
             resultSet = statement.executeQuery(query);
 
             // Populate table model with data from the ResultSet
             while (resultSet.next()) {
                 int id = resultSet.getInt("ID");
                 String name = resultSet.getString("name");
                 String district = resultSet.getString("district");
                 int age = resultSet.getInt("age");
 
                 // Add row to table model
                 tableModel.addRow(new Object[]{id, name, district, age});
             }
         } catch (ClassNotFoundException e) {
             JOptionPane.showMessageDialog(frame, "JDBC Driver not found. Add the JDBC driver to the classpath.", "Error", JOptionPane.ERROR_MESSAGE);
         } catch (SQLException e) {
             JOptionPane.showMessageDialog(frame, "SQL Exception: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
         } finally {
             // Close resources
             try {
                 if (resultSet != null) resultSet.close();
                 if (statement != null) statement.close();
                 if (connection != null) connection.close();
             } catch (SQLException e) {
                 JOptionPane.showMessageDialog(frame, "Error closing resources: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
             }
         }
 
         // Make the frame visible
         frame.setVisible(true);
     }
 }
 