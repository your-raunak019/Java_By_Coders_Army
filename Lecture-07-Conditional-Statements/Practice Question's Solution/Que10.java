/*
Write a Java program that takes:
● two numbers
● one operator (+, -, *, /)
and performs the operation using switch.
*/

import java.util.Scanner;
public class Que10
{
    public static void main(StringDemo[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        
        switch(operator)
        {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                if(num2 != 0)
                {
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                }
                else
                {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
        }
    }
}