//Accept 10 numbers from command line and check how many of them are
//even and how many are odd.
import java.util.*;
public class Day2_1 {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int[] arr = new int[10];
        int count=0;
        System.out.println("Enter the values into the array:-");
        for(int i=0;i<10;i++)
        {
            arr[i] = obj.nextInt();
        }
        System.out.println("The values entered are:-");
        for(int i=0;i<10;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<10;i++)
        {
            if(arr[i] % 2 ==0)
                count++;
        }
        System.out.println("\nTotal no of odd numbers given are:- " + count);
        System.out.println("Total n. of even numbers given are:- " + (10-count));
    }
}
