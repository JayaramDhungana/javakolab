/*43.	  
You are hired by a reputed software company which is going to design an application 
for “Movie Rental System”. Your responsibility is to design a schema named MRS and 
create a table named Movie(id, Title, Genre, Language, Length). Write a program to 
design a GUI to take input for this table and insert the data into table after clicking 
OK button
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class MovieRentalSystem {
    public static void main(String[] args) {
        // Set up the GUI
        JFrame frame = new JFrame("Movie Rental System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create the form labels and text fields
        JLabel idLabel = new JLabel("Movie ID:");
        JTextField idField = new JTextField(15);
        
        JLabel titleLabel = new JLabel("Title:");
        JTextField titleField = new JTextField(15);

        JLabel genreLabel = new JLabel("Genre:");
        JTextField genreField = new JTextField(15);

        JLabel languageLabel = new JLabel("Language:");
        JTextField languageField = new JTextField(15);

        JLabel lengthLabel = new JLabel("Length (in minutes):");
        JTextField lengthField = new JTextField(15);

        // Create the OK button
        JButton okButton = new JButton("OK");

        // Set the layout of the frame
        frame.setLayout(new GridLayout(6, 2));
        
        // Add components to the frame
        frame.add(idLabel);
        frame.add(idField);
        frame.add(titleLabel);
        frame.add(titleField);
        frame.add(genreLabel);
        frame.add(genreField);
        frame.add(languageLabel);
        frame.add(languageField);
        frame.add(lengthLabel);
        frame.add(lengthField);
        frame.add(new JLabel());  // Empty label for spacing
        frame.add(okButton);

        // Action listener for the OK button
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieve data from text fields
                String id = idField.getText();
                String title = titleField.getText();
                String genre = genreField.getText();
                String language = languageField.getText();
                String length = lengthField.getText();

                // Check if any field is empty
                if (id.isEmpty() || title.isEmpty() || genre.isEmpty() || language.isEmpty() || length.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "All fields must be filled!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Connect to the database and insert data
                try {
                    // Load the JDBC driver
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    
                    // Connect to the database using XAMPP MySQL
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/MRS", "root", "");
                    
                    // Prepare SQL query to insert the movie details
                    String sql = "INSERT INTO Movie (id, Title, Genre, Language, Length) VALUES (?, ?, ?, ?, ?)";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    
                    // Set the values in the prepared statement
                    pstmt.setInt(1, Integer.parseInt(id));
                    pstmt.setString(2, title);
                    pstmt.setString(3, genre);
                    pstmt.setString(4, language);
                    pstmt.setInt(5, Integer.parseInt(length));
                    
                    // Execute the insert statement
                    pstmt.executeUpdate();

                    // Show success message
                    JOptionPane.showMessageDialog(frame, "Movie data inserted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

                    // Clear the text fields
                    idField.setText("");
                    titleField.setText("");
                    genreField.setText("");
                    languageField.setText("");
                    lengthField.setText("");

                    // Close the connection
                    conn.close();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
