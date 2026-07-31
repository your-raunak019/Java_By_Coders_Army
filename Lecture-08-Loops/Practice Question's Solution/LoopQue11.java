/*

Write a Java program to print:
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

*/

public class LoopQue11
{
    public static void main(StringDemo[] args)
    {
        for(int i = 1; i<=5; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("1 ");
                }
                else
                {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}