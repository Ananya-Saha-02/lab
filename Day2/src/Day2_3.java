//:Write a class file – box with three data members(length, width,
//height) and a method volume() . Also implement the application class Demo
//where an object of the box class is created with user entered dimensions and
//volume is printed.
import java.util.*;
class Box
{
    static double length;
    static double breadth;
    static double width;

    public double volume()
    {
        return (length * breadth * width);
    }
}
public class Day2_3
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        Box b = new Box();
        //Taking inputs
        System.out.println("Enter the height, length and breadth:-");
        b.length = obj.nextDouble();
        b.breadth = obj.nextDouble();
        b.width = obj.nextDouble();

        double volume = b.volume();
        System.out.println("The volume of the given box is:- "+ volume);
    }
}
