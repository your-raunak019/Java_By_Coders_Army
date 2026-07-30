/*

Bonus Challenge Question (Very Hard)
Question 14: Print Pascal's Triangle
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1

*/

public class LoopQue14
{
    public static void main(String [] args)
    {
        int rows = 5;
        for(int i = 0; i < rows; i++)
        {
            int number = 1;
            for(int j = 0; j < rows - i; j++)
            {
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++)
            {
                System.out.print(number + " ");
                number = number * (i - k) / (k + 1);
            }
            System.out.println();
        }
    }
}