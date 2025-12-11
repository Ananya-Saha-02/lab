//Write a program in Java to take first name and last name from user and
//print both in one line as last name followed by first name
import java.util.*;
public class Day1_5 {
    public static void main(String [] args)
    {
        Scanner obj = new Scanner(System.in);
        String str1, str2;
        System.out.println("Enter the first String:-");
        str1 = obj.nextLine();
        System.out.println("Enter the second String:-");
        str2 = obj.nextLine();
        System.out.print(str1+" ");
        System.out.print(str2);

    }
}
