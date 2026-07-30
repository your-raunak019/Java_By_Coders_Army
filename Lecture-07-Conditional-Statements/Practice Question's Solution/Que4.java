/* Write a Java program that takes two integers as input and prints which one is greater. */

import java.util.Scanner;
public class Que4   
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();
        if(num1 > num2)
        {
            System.out.println(num1 + " is greater than " + num2);
        }
        else if(num1 < num2)
        {
            System.out.println(num2 + " is greater than " + num1);
        }
        else
        {
            System.out.println("Both numbers are equal.");
        }
    }
}