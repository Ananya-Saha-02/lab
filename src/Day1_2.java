//Write a program to print the corresponding grade for the given
//mark using if..else statement in Java
import java.util.*;
public class Day1_2 {
    public static void main(String [] args)
    {
        Scanner obj = new Scanner(System.in);
        int marks;
        System.out.println("Enter the marks:-");
        marks = obj.nextInt();
        if(marks>=90 && marks<=100)
            System.out.println("Grade :- O");
        else if( marks>=80 && marks<=89)
            System.out.println("Grade = E");
        else if( marks>=70 && marks<=79)
            System.out.println("Grade = A");
        else if(marks>=60 && marks<=69)
            System.out.println("Grade = B");
        else if(marks>=50 && marks<=59)
            System.out.println("Grade = C");
        else if(marks>40 && marks<=49)
            System.out.println("Grade = D");
        else if(marks<= 39)
            System.out.println("Grade = F");

    }
}
