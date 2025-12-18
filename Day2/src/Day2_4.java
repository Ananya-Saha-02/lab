//Write a program in Java to create a class Rectangle having data
//members length and breadth and three methods called read, calculate and display to read the
//values of length and breadth, calculate the area and perimeter of the rectangle and display the
//result respectively.
import java.util.*;
class Rectangle
{
    double  length;
    double breadth;
    double area;
    double perimeter;
    public void read()
    {
        System.out.println("The length of the rectangle is:- "+ length);
        System.out.println("The breadth of the rectangle is:- "+ breadth);
    }

    public void calculate()
    {
        area = (length * breadth);
        perimeter = 2*(length +breadth);
    }

    public void display()
    {
        System.out.println("The perimeter of the rectangle is:- "+perimeter);
        System.out.println("The area of the rectangle is:- "+area);
    }
}
public class Day2_4
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        Rectangle rec = new Rectangle();
        //Taking input
        System.out.println("Enter the values of length and breadth:-");
        rec.length = obj.nextDouble();
        rec.breadth = obj.nextDouble();

        rec.read();

        rec.calculate();

        rec.display();
    }
}
