//Write a program to overload subtract method with various parameters in a class in Java. Write the
// driver class to use the different subtract methods using object.
import java.util.*;
class Subtract{
    void Subtract(int a , int b)
    {
        System.out.println("int - int");
        System.out.println("The result is:- " + (a-b));
        return;
    }
    void Subtract(int a, int b, int c)
    {
        System.out.println("int - int - int");
        System.out.println("The result is:- "+ (a-b-c));
        return;
    }
    void Subtract(int a, double b)
    {
        System.out.println("int - double");
        double c = a-b;
        System.out.println("The result is :- "+c);
        return ;
    }
    void Subtract(double a, double b)
    {
        System.out.println("double - double");
        System.out.println("The result is:- "+ (a-b));
        return;
    }
}
public class Day2_6
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        Subtract sub = new Subtract();
        sub.Subtract(4, 3);
        sub.Subtract( 10, 2 , 4);
        sub.Subtract( 10, 3.5);
        sub.Subtract( 15.67, 7.3);
    }
}
