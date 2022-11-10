package Methods;

public class Scope {
    public static void main(String[] args) {
        //What is scope ? Ans : Where we can access variables

        int a = 1;
        int b = 2;

        //Block Scope - Values initialized in this block will REMAIN in the block
        //            - We can see variables which were initialized in a higher scope
        {
                // int a = 78; - Cannot re-initialize
                int c = 99;
                System.out.println(a);
        }
     //   System.out.println(c); - Cannot see inside the block scope


        //For loop scope
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        } // the i cannot be access outside for loop
    }

//    static void random(){
    // I cannot access a because the scope is outside the function
//        System.out.println(a);
//    }
}
