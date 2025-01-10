package src;
/*
 * Program: Factorial Servlet
 * This servlet reads a number entered in a text field, calculates its factorial, and displays the result in another text field.
 * Author: Your Name
 * Date: Your Date
 * 50.	Write a Java Program to delete a record from database.
 *  Assume your own database and table
 */

 import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;
 
 public class FactorialServlet extends HttpServlet {
 
     // Method to calculate factorial
     private long calculateFactorial(int number) {
         long factorial = 1;
         for (int i = 1; i <= number; i++) {
             factorial *= i;
         }
         return factorial;
     }
 
     // Handles the POST request to calculate factorial
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         // Set content type
         response.setContentType("text/html");
 
         // Get the input number from the form
         String numberStr = request.getParameter("number");
         PrintWriter out = response.getWriter();
         
         try {
             // Parse the input number
             int number = Integer.parseInt(numberStr);
 
             // Calculate the factorial
             long factorial = calculateFactorial(number);
 
             // Prepare the HTML response
             out.println("<html><body>");
             out.println("<h2>Factorial of " + number + " is: " + factorial + "</h2>");
             out.println("<form action='index.html' method='GET'>");
             out.println("<input type='submit' value='Back to Calculator'>");
             out.println("</form>");
             out.println("</body></html>");
         } catch (NumberFormatException e) {
             out.println("<html><body>");
             out.println("<h2>Invalid input. Please enter a valid number.</h2>");
             out.println("<form action='index.html' method='GET'>");
             out.println("<input type='submit' value='Back to Calculator'>");
             out.println("</form>");
             out.println("</body></html>");
         }
     }
 }
 
