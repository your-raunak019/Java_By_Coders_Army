public class MultidimentionalArray
{
    public static void main(StringDemo[] args)
    {

        // MULTI-DIMENTIONAL ARRAY - > Each With Same length

                //        int [][] marks = new int[3][3]; // first represent 'row' & second represents 'column'

        //Now we can define this array as: //--

                //        marks [0][0] = 23;
                //        marks [0][1] = 45;
                //        marks [0][2] = 69;
                //
                //        marks [1][0] = 34;
                //        marks [1][1] = 11;
                //        marks [1][2] = 90;
                //
                //        marks [2][0] = 56;
                //        marks [2][1] = 23;
                //        marks [2][2] = 78;

        /*
        We can also defined this array as:

                //        int[][] marks = {
                //                {23, 45, 69},
                //                {34, 11, 90},
                //                {56, 23,78}
                //        };
         */


        /*
                //
                //        for (int row = 0; row < 3; row++) //or we can write-> for (int row = 0; row < marks.length; row++)
                //        {
                //            for (int col = 0; col < 3; col++) //or we can write-> for (int col = 0; col < marks[row].length; col++)
                //            {
                //                System.out.print(marks[row] [col] +" ");
                //            }
                //            System.out.println();
                //        }

         /*

                The output will look like,

                [23] [45] [69]
                [34] [11] [90]
                [56] [23] [78]

                 */

        // MULTI-DIMENTIONAL ARRAY - > Each With Different length

        int [][] marks = new int[3][]; //it means we are fixing our row to 3

        marks [0] = new int [2];
        marks [1] = new int [3];
        marks [2] = new int [4];

        marks [0][0] = 43;
        marks [0][1] = 33;

        marks [1][0] = 35;
        marks [1][1] = 56;
        marks [1][2] = 87;

        marks [2][0] = 76;
        marks [2][1] = 69;
        marks [2][2] = 54;
        marks [2][3] = 65;

        for (int row = 0; row < 3; row++)
        {
            for (int col = 0; col < marks[row].length; col++)
            {
                System.out.print(marks[row][col] +" ");
            }
            System.out.println();
        }

        /*
        The output will look like,

        [43] [33]
        [35] [56] [87]
        [76] [69] [54] [65]

         */
    }
}
