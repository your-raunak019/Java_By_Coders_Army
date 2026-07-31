/*

Write a Java program to print:
* * * * *
    *
    *
    *
    *

*/

public class LoopQue2
{
    public static void main(StringDemo[] args)
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.print(" * ");
        }
        System.out.println();
        
        for (int i = 1; i <= 4; i++)
        {
            for (int j = 1; j <= 4; j++)
            {
                if (j == 3)
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}