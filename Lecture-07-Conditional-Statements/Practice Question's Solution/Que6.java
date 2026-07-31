/*Write a Java program that takes marks (0–100) as input and prints grade using if-else-if ladder.
Grading criteria:
● ≥ 90 → Grade A
● ≥ 75 → Grade B
● ≥ 60 → Grade C
● ≥ 40 → Grade D
● < 40 → Fail */

import java.util.Scanner;
public class Que6   
{
    public static void main(StringDemo[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();
        if(marks >= 90)
        {
            System.out.println("Grade A");
        }
        else if(marks >= 75)
        {
            System.out.println("Grade B");
        }
        else if(marks >= 60)
        {
            System.out.println("Grade C");
        }
        else if(marks >= 40)
        {
            System.out.println("Grade D");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}