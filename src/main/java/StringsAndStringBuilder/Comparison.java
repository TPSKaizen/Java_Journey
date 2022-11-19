package StringsAndStringBuilder;

public class Comparison {
    public static void main(String[] args) {
        String a = "Brian";
        String b = "Brian";

        System.out.println(a == b);

        // ^ Above objects are same in string pool

       /*
       Two ways to compare

       1. ==
       If a -----> "kunal"
       and b ----> "kunal"

       then a == b will give false

       if a and b ------> "kunal"
       then a == b will give true

       == checks if reference variables are pointing to same object

       2. equals() methods
        equals compares the VALUES only.
        */

        //How to create different objects of same value

        String c = new String("Brian"); //creates a new value outside string pool but within heap

        System.out.println(a == c);
        System.out.println(a.equals(c));
    }
}
