/*
 46:Program: Demonstration of GridLayout in Java
 */

 import java.awt.*;
 import java.awt.event.*;
 
 public class GridLayoutDemo {
     public static void main(String[] args) {
         // Create a Frame
         Frame frame = new Frame("GridLayout Example");
 
         // Set GridLayout with 3 rows and 2 columns
         frame.setLayout(new GridLayout(3, 2));
 
         // Add some buttons to demonstrate GridLayout
         for (int i = 1; i <= 6; i++) {
             Button button = new Button("Button " + i);
             frame.add(button);
         }
 
         // Add a WindowListener to handle window closing
         frame.addWindowListener(new WindowAdapter() {
             public void windowClosing(WindowEvent e) {
                 frame.dispose();
             }
         });
 
         // Set frame properties
         frame.setSize(300, 200);
         frame.setVisible(true);
     }
 }
 