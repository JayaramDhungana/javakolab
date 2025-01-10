/*
 *45. Demonstration of FlowLayout in Java
 
 */

 import java.awt.*;
 import java.awt.event.*;
 
 public class FlowLayoutDemo {
     public static void main(String[] args) {
         // Create a Frame
         Frame frame = new Frame("FlowLayout Example");
 
         // Set FlowLayout as the layout manager
         frame.setLayout(new FlowLayout());
 
         // Add some buttons to demonstrate FlowLayout
         for (int i = 1; i <= 5; i++) {
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
 