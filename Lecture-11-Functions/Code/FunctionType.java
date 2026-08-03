// Function in Java

public class FunctionType
{
    public static void main(String[] args)
    {
        //First Function Call
        greet();

        //Second Function Call
        String name = "Rounak"; //or we can write only-> sayHello(name: "Rounak");
        sayHello(name);

        //Third Function Call
        int x = getNumber();
        System.out.println(x); //or we can also write-> Sytstem.out.println(getNumber());

        //Forth Function Call
        System.out.println(multiply(2, 4)); //8
    }

    //1. No Input No Output
    static void greet()
    {
        System.out.println("HELLO");
        return;
    }

    //2. Gives Input But Not Output
    static void sayHello(String name)
    {
        System.out.println("HELLO " + name);
        return;
    }

    //3. No Input But Gives Output
    static int getNumber()
    {
        return 10;
    }

    //4. Gives Both Input & Output
    static int multiply(int a, int b)
    {
        int mul = a*b;
        return mul;
        //return (a*b);
    }
}
