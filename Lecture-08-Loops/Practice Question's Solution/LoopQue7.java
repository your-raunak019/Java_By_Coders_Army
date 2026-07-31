/*

Write a Java program to print:
1
2 3
4 5 6
7 8 9 10

*/

public class LoopQue7
{
    public static void main(StringDemo[] args)
    {
        int count = 1;
        for(int i = 1; i<=4; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print(count +" ");
                count++;
            }
            System.out.println();
        }
    }
}