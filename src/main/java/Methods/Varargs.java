package Methods;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        // Varargs are used when we don't know how many variables are being passed in
        fun(1,2,3,4,5);

        multiple(1,2,"Bob","Marko","Rene");
    }

    static void multiple(int a, int b, String ...c){
        System.out.println(Arrays.toString(c));
    }
    static void fun(int ...a){ //takes in an array for the specified data type
        System.out.println(Arrays.toString(a));
    }
}
