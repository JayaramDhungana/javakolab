/*44.	Write a Java program in awt to create form to enter
 employee information (eid, ename, salary, gender) */
import java.awt.*;
import java.awt.event.*;

public class EmployeeForm {
    public static void main(String[] args) {
        // Create the Frame
        Frame frame = new Frame("Employee Information Form");
        frame.setSize(400, 400);
        frame.setLayout(null);
        
        // Labels
        Label labelEid = new Label("Employee ID:");
        labelEid.setBounds(50, 50, 100, 20);
        frame.add(labelEid);
        
        Label labelEname = new Label("Employee Name:");
        labelEname.setBounds(50, 100, 100, 20);
        frame.add(labelEname);
        
        Label labelSalary = new Label("Salary:");
        labelSalary.setBounds(50, 150, 100, 20);
        frame.add(labelSalary);
        
        Label labelGender = new Label("Gender:");
        labelGender.setBounds(50, 200, 100, 20);
        frame.add(labelGender);

        // Text Fields
        TextField textEid = new TextField();
        textEid.setBounds(180, 50, 150, 20);
        frame.add(textEid);

        TextField textEname = new TextField();
        textEname.setBounds(180, 100, 150, 20);
        frame.add(textEname);

        TextField textSalary = new TextField();
        textSalary.setBounds(180, 150, 150, 20);
        frame.add(textSalary);

        // Gender Radio Buttons
        CheckboxGroup genderGroup = new CheckboxGroup();
        Checkbox male = new Checkbox("Male", genderGroup, true);
        male.setBounds(180, 200, 60, 20);
        frame.add(male);

        Checkbox female = new Checkbox("Female", genderGroup, false);
        female.setBounds(250, 200, 70, 20);
        frame.add(female);

        // Submit Button
        Button submitButton = new Button("Submit");
        submitButton.setBounds(50, 250, 80, 30);
        frame.add(submitButton);

        // Reset Button
        Button resetButton = new Button("Reset");
        resetButton.setBounds(150, 250, 80, 30);
        frame.add(resetButton);

        // TextArea to Display Output
        TextArea outputArea = new TextArea();
        outputArea.setBounds(50, 300, 300, 80);
        outputArea.setEditable(false);
        frame.add(outputArea);

        // Action Listener for Submit Button
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String eid = textEid.getText();
                String ename = textEname.getText();
                String salary = textSalary.getText();
                String gender = genderGroup.getSelectedCheckbox().getLabel();

                if (eid.isEmpty() || ename.isEmpty() || salary.isEmpty()) {
                    outputArea.setText("Please fill out all fields.");
                } else {
                    outputArea.setText("Employee Details:\n");
                    outputArea.append("ID: " + eid + "\n");
                    outputArea.append("Name: " + ename + "\n");
                    outputArea.append("Salary: " + salary + "\n");
                    outputArea.append("Gender: " + gender + "\n");
                }
            }
        });

        // Action Listener for Reset Button
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textEid.setText("");
                textEname.setText("");
                textSalary.setText("");
                genderGroup.setSelectedCheckbox(male);
                outputArea.setText("");
            }
        });

        // Window Closing Event
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        // Set Frame Visible
        frame.setVisible(true);
    }
}

