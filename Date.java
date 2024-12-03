/*
    Question:
    14.Create a class `Date` with three integer instance variables named `day`, `month`, and `year`. 
    It has a constructor with three parameters for initializing the instance variables and a 
    member function `daySinceJan1()` that computes and returns the number of days since January 1 of the same year, 
    including January 1 and the day in the `Date` object. The program should consider leap years.
*/

public class Date {
    // Instance variables
    private int day;
    private int month;
    private int year;

    // Array to store the number of days in each month for a non-leap year
    private static final int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    // Constructor to initialize the date
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Method to check if the year is a leap year
    private boolean isLeapYear() {
        // A year is a leap year if divisible by 4 and (not divisible by 100 or divisible by 400)
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    // Method to calculate the number of days since January 1
    public int daySinceJan1() {
        int totalDays = 0;

        // Add days of complete months before the given month
        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonth[i];
        }

        // Add the days of the current month
        totalDays += day;

        // Add one more day if it is a leap year and the date is after February
        if (isLeapYear() && month > 2) {
            totalDays++;
        }

        return totalDays;
    }

    public static void main(String[] args) {
        // Example 1: Non-leap year
        Date date1 = new Date(1, 3, 2000); // March 1, 2000
        System.out.println("Days since January 1, 2000: " + date1.daySinceJan1()); // Output: 61

        // Example 2: Leap year
        Date date2 = new Date(1, 3, 1900); // March 1, 1900 (not a leap year)
        System.out.println("Days since January 1, 1900: " + date2.daySinceJan1()); // Output: 60
    }
}
