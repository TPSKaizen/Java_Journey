package ConditionsAndLoops;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        int largest = 0;
//
//        // Q Find the largest number
//        if ( a > b && a > c)
//            largest = a;
//        else if (b > a && b > c)
//            largest = b;
//        else
//            largest = c;

//        int largest = a;
//
//        if ( b > largest )
//            largest = b;
//
//        if (c > largest)
//            largest = c;

        int largest = Math.max(c, Math.max(a,b));

        System.out.println(largest);
    }
}
