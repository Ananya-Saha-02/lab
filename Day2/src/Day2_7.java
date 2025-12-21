//Write a program in java using constructor overloading concept to calculate the area of a rectangle
//having data member as length and breadth. Use default constructor to initialize the value of the data member
//to zero and parameterized constructor to initialize the value of data member according to the user input.
class rectangle
{
    double length, breadth;
    void rectangle()
    {
        length=0;
        breadth =0;
        return;
    }

    void rectangle(int a, int b)
    {
        length =a;
        breadth =b;
        System.out.println("Int-Int");
        return;
    }

    void rectangle(int a, double b)
    {
        length =a;
        breadth =b;
        System.out.println("Int-Double");
        return;
    }

    void rectangle(double a, double b)
    {
        length =a;
        breadth =b;
        System.out.println("Double-Double");
        return;
    }

    void calculate()
    {
        double area = length*breadth;
        System.out.println("The area of the rectangle is:- "+area);
        return;
    }
}
public class Day2_7 {
    public static void main(String[] args)
    {
        rectangle rt = new rectangle();
        rt.rectangle(3, 4);
        rt.calculate();
        rt.rectangle(3, 4.5);
        rt.calculate();
        rt.rectangle(3.5, 4.0);
        rt.calculate();
    }
}
