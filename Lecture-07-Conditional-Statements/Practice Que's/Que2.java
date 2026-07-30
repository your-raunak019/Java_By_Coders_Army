/*Que.2-> Write a Java program to check whether a given integer is even or odd.*/

import java.util.Scanner;

public class Que2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        if(num % 2 == 0)
        {
            System.out.println(num + " is an even number.");
        }
        else
        {
            System.out.println(num + " is an odd number.");
        }
    }
}