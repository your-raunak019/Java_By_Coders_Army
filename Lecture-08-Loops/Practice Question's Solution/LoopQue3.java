/*

Write a Java program to print:
*
* *
* * *
* * * *
* * * * *

*/

public class LoopQue3
{
    public static void main(StringDemo[] args)
    {
        for(int i = 1; i<=5; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}