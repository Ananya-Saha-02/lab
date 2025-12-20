//Write a program in java to input and display the details of n number
//of students having roll, name and cgpa as data members. Also display the name of the
//student having lowest cgpa.
//
//Input: Enter Roll No, Name and cgpa of ‘n’ number of students.
//Output: Display the details of ‘n’ number of students. Also display the name of
//
//student with lowest cgpa
import java.util.*;
class Student {
    int roll;
    String name;
    double cgpa;
}
public class Day2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] s = new Student[n];
        for (int i = 0; i < n; i++) {
            s[i] = new Student();   // object creation
            System.out.println("\nEnter details of student " + (i + 1));
            s[i].roll = sc.nextInt();
            sc.nextLine();
            s[i].name = sc.nextLine();

            s[i].cgpa = sc.nextDouble();
            sc.nextLine();
        }
        System.out.println("\n--- Student Details ---");
        for (int i = 0; i < n; i++)
            System.out.println("Roll No: " + s[i].roll + ", Name: " + s[i].name + ", CGPA: " + s[i].cgpa);
        int minIndex = 0;
        for (int i = 1; i < n; i++) {
            if (s[i].cgpa < s[minIndex].cgpa)
                minIndex = i;
        }
        System.out.println("\nStudent with lowest CGPA: " + s[minIndex].name);
    }
}
