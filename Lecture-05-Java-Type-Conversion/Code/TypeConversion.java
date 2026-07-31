public class TypeConversion
{
    public static void main(StringDemo[] args)
    {
        //Implicit conversion:-
        //-------------------
        //-->  (byte to int)
        //byte b = 24;
        //int i;
        //i = b;
        //System.out.println(i);

        //-->  (char to int)
        //char c = 'a';
        //int i;
        //i = c;
        //System.out.println(i); //97


        //Explicit Conversion:-
        //-------------------
        //int i = 300;
        //byte b;
        //b = (byte)i;
        //System.out.println(b);


        //truncating conversion:-
        //----------------------
        //float f = 16.25f;
        //int i;

        //i = (int)f;
        //System.out.println(i);  //15

        //boolean to any data type:-
        //--> these conversion is not possible

        //Automatic type Promotion
//--------------------------------------------------------------------------------------
        //Example of all conversion in one example

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;

        double result = (f*b) + (i/c) - (d*s);

        // f * b --> float
        // i / c --> integer
        // d * s --> double

        // float + integer --> float
        // float - double --> double

        // So final Answer will be in Double

        System.out.println((f*b) + " + " + (i/c) + " + " + (d*s));
        System.out.println(" Result = " + result);
//-----------------------------------------------------------------------------------------
    }
}