public class Lec3
{
    public static void main (String [] args)
    {
        //Integers-> byte, short , int , long

        byte b = 5;
        short s = 10;
        int i = 40000;
        long l = 12_34_56_789; /* the output of the long value will be 123456789 because Computer
         does not read the underscore here. You can put this in any whether it is integer , float,
          double . NOTE :- You can't put this underscore before and after the (e) that is used for
          10 raise to the power and also for decimal not before neither after */
        System.out.println("Integers Value--> " + b + "," + s + "," + i + "," + l );

        //Real Numbers-> float , double

        float f = 10.54f;
        double d = 23.0987;
        System.out.println("Real Numbers Value--> " +f + "," +d );

        //Characters

        char c = 'a';
        System.out.println("Character Value--> " +c );

        // Boolean

        boolean bool = false;
        System.out.println("Boolean Value--> " +bool );

        // Alternative ways to declare variables:

        /* If we want that we provide a binary value and the output comes into decimal value then
        we have to put ( 0b ) at the starting of the binary number that we are storing in the variable */

        //Ex..

        //byte q = 0b101; // 0b for binary
        //byte w = 07;    // 0 for 0ctal but we can store only 1-7
        //byte e = 0X5;   // 0X for hexadecimal ( 0 - 15 ) [ 1,2,3,4,5,6,7,8,9,A,B,C,D,E,F ]
        //long r = 10000;
        //System.out.println("Integers Value--> " + q + "," + w + "," + e + "," + r);
    }
}
