// Jump Statement -> break & Continue

//______ BREAK______//--> Stops the code at a particular condition.

//public class JumpStatement
//{
//    public static void main(String[] args) {
//
//        for(int i = 1; i <= 10; i++) {
//            System.out.println(i);
//
//            if (i > 5) {
//                break;
//            }
//        }
//    }
//}


    //checking the prime number
//public class JumpStatement {
//    public static void main(String[] args) {
//        int p = 7;
//
//        // 2,3,4,5,6,7,8,9
//        int i;
//        for (i = 2; i < p; i++){
//            if (p % i == 0){
//                System.out.println("The Number is Not Prime");
//                break;
//            }
//        }
//        if ( i == p){
//            System.out.println("The Number Is Prime");
//        }
//    }
//}


    // checking the prime number
//public class JumpStatement {
//    public static void main(String[] args) {
//        int p = 9;
//
//        // 2,3,4,5,6,7,8,9
//        for (int i = 2; i < p; i++){
//            if (p % i == 0){
//                System.out.println("The Number is Not Prime");
//                break;
//            }
//        }
//
//    }
//}

//------------------------------------------------------------------------------------------------------//
//_____CONTINUE_____//--> Skip the Output at a particular condition.
    // printing odd numbers by using continue statement
public class JumpStatement {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}


    //Break in Nested Loop
//public class JumpStatement {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++){
//            for (int j = 1; j <= i; j++){
//                System.out.print(" * ");
//
//                if (j >= 5){
//                    break;
//                }
//            }
//            System.out.println();
//        }
//    }
//}

    // labels:-
//public class JumpStatement {
//    public static void main(String[] args) {
//
//        outer: for(int i = 1; i <= 10; i++){
//            inner: for(int j = 1; j <= i; j++){
//                System.out.print(" * ");
//
//                if (j >= 5){
//                    break outer;
//                }
//            }
//            System.out.println();
//        }
//    }
//}


    //Code Blocks:-

//public class JumpStatement{
//    public static void main(String[] args) {
//        first: {
//            second: {
//                third:{
//                    System.out.println("Hello Ji 😘");
//                }
//            }
//        }
//    }
//}