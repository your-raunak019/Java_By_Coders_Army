/*Write a Java program to classify temperature into categories: */

import java.util.Scanner;
public class Que5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        double temp = sc.nextDouble();
        
        if(temp < 0)
        {
            System.out.println("The temperature is below freezing point.");
        }
        else if(temp >= 0 && temp < 10)
        {
            System.out.println("The temperature is cold.");
        }
        else if(temp >= 10 && temp < 20)
        {
            System.out.println("The temperature is cool.");
        }
        else if(temp >= 20 && temp < 30)
        {
            System.out.println("The temperature is warm.");
        }
        else
        {
            System.out.println("The temperature is hot.");
        }
    }
}