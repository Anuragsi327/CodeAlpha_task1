package codealphatask;
import java.util.Scanner;

public class StudentGradeTracker
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n, i;
        int sum = 0;
        int high, low;

        System.out.print("Enter number of students: ");
        n = sc.nextInt();

        int grade[] = new int[n];

        for(i = 0; i < n; i++)
        {
            System.out.print("Enter grade of student " + (i + 1) + ": ");
            grade[i] = sc.nextInt();
        }

        high = grade[0];
        low = grade[0];

        for(i = 0; i < n; i++)
        {
            sum = sum + grade[i];

            if(grade[i] > high)
            {
                high = grade[i];
            }

            if(grade[i] < low)
            {
                low = grade[i];
            }
        }

        double avg = (double)sum / n;

        System.out.println("\n----- Student Report -----");
        for(i = 0; i < n; i++)
        {
            System.out.println("Student " + (i + 1) + " Grade = " + grade[i]);
        }

        System.out.println("Average Grade = " + avg);
        System.out.println("Highest Grade = " + high);
        System.out.println("Lowest Grade = " + low);
    }
}