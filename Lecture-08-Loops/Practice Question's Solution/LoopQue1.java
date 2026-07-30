/*
Write a Java program to print the following pattern:
* * * *
* * * *
* * * *
* * * *
Condition:
● Use loops only
● Number of rows = 4
● Number of columns = 4
*/


public class LoopQue1
{
    public static void main(String [] args)
    {
        for (int i = 1; i <= 4; i++)
        {
            for (int j = 1; j <= 4; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
        
    }
}