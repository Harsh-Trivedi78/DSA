// Description: This program checks if a given year is a leap year or not.
// It uses the standard rules for leap years: a year is a leap year if it is divisible by 4
// and not divisible by 100, except if it is also divisible by 400.
// This program prompts the user to enter a year and then checks if it is a leap year.




package Basic_programs;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Leap year condition
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            System.out.println(year + " is a Leap Year");
        else
            System.out.println(year + " is not a Leap Year");

        scanner.close();
    }
}

