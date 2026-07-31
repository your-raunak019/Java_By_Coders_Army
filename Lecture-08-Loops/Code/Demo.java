public class Demo
{
    public static void main(StringDemo[] args)
    {
        // Comma Seperated Variation:-
        //  for(int i= 1, j= 1; i<=10 && j<=5; i++, j+=2);
        //  {
        //      System.out.println(i * j);  // it will print Square of 1-10.
        //  }

            //  boolean b = true;
            //  for (int i = 1; b == true; i++)
            //  {
            //      if (condition)
            //      {
            //          b = false;
            //      }
            //  }

        //Nested Loop:- (Pattern Printing)

        /*

        *
        * *
        * * *
        * * * *
        * * * * *

        */

        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ❤️ ");
            }
            System.out.println();
        }
    }
}
