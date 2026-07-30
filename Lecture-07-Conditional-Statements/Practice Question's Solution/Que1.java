/*Write a Java program that takes an integer input from the user
and checks whether the number is positive.*/


import java.util.Scanner;
public class Que1
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