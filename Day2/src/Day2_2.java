//Program to find no. of objects created out of a class using ‘static’
//modifier.
import java.util.*;
public class Day2_2 {
    private static int count=0;

    public Day2_2()
    {
        count++;
    }

    public static int getDay2_2()
    {
        return count;
    }
    public static void main(String[] args)
    {
        Day2_2 oj1 = new Day2_2();
        Day2_2 hii = new Day2_2();
        System.out.println("Count:- "+ getDay2_2());

    }
}
