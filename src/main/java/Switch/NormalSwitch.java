package Switch;

import java.util.Scanner;

public class NormalSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      //  String fruit = in.next();
        int fruit = in.nextInt();

        // if we don't put a break statement it will continue to execute
        // old syntax
//        switch (fruit) {
//            case "Mango" :
//                System.out.println("I am a mango");
//                break;
//            case "Apple":
//                System.out.println("I am an apple");
//                break;
//            case "Grape" :
//                System.out.println("I am a grape");
//                break;
//            default :
//                System.out.println("I am not a good fruit");
//        }

        // Practical use of not using break statements
        // old way
//        switch ( fruit ) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//            default:
//                System.out.println("Enter a proper day.");
//                break;
//        }

    // new way
        switch (fruit) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Enter a proper day.");
        }

        //new syntax
//        switch (fruit) {
//            case "Mango" -> System.out.println("I am a mango");
//            case "Apple" -> System.out.println("I am an apple");
//            case "Grape" -> System.out.println("I am a grape");
//            case "Tomato" -> {
//                System.out.println("I am not a fruit");
//                System.out.println("Are you dumb?");
//            }
//            default -> System.out.println("I am not a good fruit");
//        }

//        String a = "kunal";
//        String b = "kunal";
//        // this says that a and b are pointing towards the same object.
//        System.out.println(a == b);
//
//
//        // Checking values of the objects
//        System.out.println(a.equals(b));

    }
}
