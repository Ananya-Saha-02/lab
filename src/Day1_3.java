//Write a program to print the week day for the given day no. of the
//current month using switch case statement
import java.util.*;
public class Day1_3 {
    public static void main(String []args)
    {
        Scanner obj = new Scanner(System.in);
        int day_no, week;
        System.out.println("Enter the day number of the current month:-");
        day_no = obj.nextInt();
        week = day_no%7;
        switch(week)
        {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;

        }
    }
}
