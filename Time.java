/*
    Question:
    12.Write a Java program to add two Time objects (hr, min, sec).
    The program should define a `Time` class with instance variables for hours, minutes, and seconds.
    The class should have a constructor to initialize these values, a method to add two Time objects,
    and a method to display the time. The addition should handle overflow, such as 60 seconds = 1 minute.
*/ 

public class Time {
    // Instance variables for hours, minutes, and seconds
    private int hours;
    private int minutes;
    private int seconds;

    // Constructor to initialize hours, minutes, and seconds
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Method to add two Time objects
    public Time add(Time other) {
        int totalSeconds = this.seconds + other.seconds;
        int totalMinutes = this.minutes + other.minutes + totalSeconds / 60;
        int totalHours = this.hours + other.hours + totalMinutes / 60;

        // Handle overflow for seconds and minutes
        int newSeconds = totalSeconds % 60;
        int newMinutes = totalMinutes % 60;
        int newHours = totalHours;

        return new Time(newHours, newMinutes, newSeconds);
    }

    // Method to represent the time as a string
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        // Create two Time objects
        Time t1 = new Time(2, 45, 50);
        Time t2 = new Time(1, 20, 30);

        // Add the two Time objects
        Time totalTime = t1.add(t2);

        // Print the results
        System.out.println("First Time: " + t1);
        System.out.println("Second Time: " + t2);
        System.out.println("Total Time: " + totalTime);
    }
}
