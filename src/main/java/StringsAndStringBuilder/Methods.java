package StringsAndStringBuilder;

import java.util.Arrays;
import java.util.Locale;

public class Methods {
    public static void main(String[] args) {
        String name = "Brian McConney";
        System.out.println(Arrays.toString((name.toCharArray()))); // converts to Char Array
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('a'));
        System.out.println("    Brian    ".strip()); //deletes all whitespaces
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
