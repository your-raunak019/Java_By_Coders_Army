/*
Write a Java program to check whether a number is:
● Positive
● Negative
● Zero
*/

import java.util.Scanner;
public class Que8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        if(num > 0)
        {
            System.out.println(num + " is a positive number.");
        }
        else if(num < 0)
        {
            System.out.println(num + " is a negative number.");
        }
        else
        {
            System.out.println("The number is zero.");
        }
        
    }
}