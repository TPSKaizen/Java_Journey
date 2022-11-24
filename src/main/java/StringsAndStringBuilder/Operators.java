package StringsAndStringBuilder;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); //converts char into integer value
        System.out.println("a" + "b"); // concatenates a and b
        System.out.println('a' + 3); // prints numeric value of 'd'
        System.out.println("a" + 1);
        // Above line converts the integer 1 to its wrapper class the calls toString();


        System.out.println("Kunal " + new Integer(56)); // calls toString()

        System.out.println();
    }
}
