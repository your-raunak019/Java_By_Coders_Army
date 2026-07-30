/*
Write a program that checks whether a year is a leap year.
Condition:
A year is leap year if:
● divisible by 400
OR
● divisible by 4 but not by 100
*/

import java.util.Scanner;
public class Que11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
        {
            System.out.println(year + " is a leap year.");
        }
        else
        {
            System.out.println(year + " is not a leap year.");
        }
    }
}