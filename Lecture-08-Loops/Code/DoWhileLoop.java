// Syntex:-

/*
do
{
    Task;
    i++; or i--;
}
while (condition);
*/

//NOTE:- do while loop runs Atleast one time or more

// Where we can Use:
/*
-Menu Item Selection
ex:
    -Start The Game
    -Exit The Game
    -Settings
 */



public class DoWhileLoop
{
    public static void main(StringDemo[] args)
    {
        int i = 10;
        do
        {
            System.out.println(i);
            i--;
        }
        while(i>=1);
    }
}
