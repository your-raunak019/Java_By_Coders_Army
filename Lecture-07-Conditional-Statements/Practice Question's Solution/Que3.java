/* Write a Java program that takes age as input and checks whether the person is
eligible to vote or not. */

import java.util.Scanner;
public class Que3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age >= 18)
        {
            System.out.println("You Are Eligible to Vote.");
        }
        else
        {
            System.out.println("You Are Not Eligible to Vote.");
        }

    }
}