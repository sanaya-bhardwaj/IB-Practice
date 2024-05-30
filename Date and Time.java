//Problem Description
//The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as year, month, day of month, hour, and so on, and for manipulating the calendar fields, such as getting the date of the next week.
//You are given a date. You just need to write the method, getDay, which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.
//For example, if you are given the date August 14th 2017, the method should return MONDAY as the day on that date.

import java.io.*;
import java.util.*;

public class Main {

    /*
     * Complete the 'getDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. String day
     *  2. String month
     *  3. String year
     */
      
    public static String getDay(String day, String month, String year) {
        // Convert the input strings to integers
        int d = Integer.parseInt(day);
        int m = Integer.parseInt(month);
        int y = Integer.parseInt(year);
        
        // Create a Calendar object
        Calendar calendar = new GregorianCalendar(y, m - 1, d);
        
        // Get the day of the week
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        
        // Convert the day of the week to the corresponding string
        String[] days = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
        
        return days[dayOfWeek - 1];
    }

    public static void main(String[] args) {
        
        /****don't alter the code below*************************************/
        
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
        
        /****************************************************/
        
    }
}
