import java.util.Scanner;

/**
 * ConvertToSeconds.java
 * Purpose: To create a program that prompts the user for number of
 * years, months, days, hours, minutes and convert it to seconds
 * without the use of Date object.
 * This program assumes that month = 30 days.
 */

public class ConvertToSeconds
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int years;
        int months;
        int days;
        int hours;
        int minutes;
        int seconds = 0;

        System.out.println("Enter the number of years: ");
        years = keyboard.nextInt();
        System.out.println("Enter the number of months: ");
        months = keyboard.nextInt();
        System.out.println("Enter the number of days: ");
        days = keyboard.nextInt();
        System.out.println("Enter the number of hours: ");
        hours = keyboard.nextInt();
        System.out.println("Enter the number of minutes: ");
        minutes = keyboard.nextInt();

        months += (years * 12);
        days += (months * 30);
        hours += (days * 24);
        minutes += (hours * 60);
        seconds += (minutes * 60);

        System.out.println(seconds);
    }
}
