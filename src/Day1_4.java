//Program to check a user entered number is palindrome or not
import java.util.*;
public class Day1_4 {
    public static void main(String [] args)
    {
        int original, copy, palindrome=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number to be checked:-");
        original = obj.nextInt();
        copy = original;
        while(copy >0)
        {
            palindrome = (palindrome*10)+(copy%10);
            copy = copy/10;
        }
        if(palindrome == original)
            System.out.println("The given number is a Palindrome Number.");
        else
            System.out.println("The given number is NOT a Palindrome Number.");

    }
}
