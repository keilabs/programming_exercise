import java.util.Scanner

/**
 * ConvertToSeconds.java
 * Purpose: To create a program that prompts the user for number of
 * years, months, days, hours, minutes and convert it to seconds.
 * This program assumes that month = 30 days.
 */

public class ConvertToSeconds
{
    Scanner keyboard = new Scanner(System.in);

    public int getUserDate()
    {
        int years;
        int months;
        int days;
        int hours;
        int minutes;

        System.out.println("Enter the number of years: ");
        years = keyboard.nextInt;
        System.out.println("Enter the number of months: ");
        months = keyboard.nextInt;
        System.out.println("Enter the number of days: ");
        days = keyboard.nextInt;
        System.out.println("Enter the number of hours: ");
        hours = keyboard.nextInt;
        System.out.println("Enter the number of minutes: ");
        minutes = keyboard.nextInt;

        return years, months, days, hours, minutes;
    }

    public int convertToSeconds(years, months, days, hours, minutes)
    {
        int seconds = 0;
        months += (years * 12);
        days += (months * 30);
        hours += (days * 24);
        minutes += (hours * 60);
        seconds += (minutes * 60);
        return seconds
    }

    public static void main(String[] args)
    {
        int seconds = 0;
        getUserDate();
        seconds = convertToSeconds(years, months, days, hours, minutes);
        System.out.println(seconds);
    }
}
