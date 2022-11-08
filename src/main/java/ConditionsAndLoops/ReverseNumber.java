package ConditionsAndLoops;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

//        int num = 12345;
//        int reversed = 0;
//
//        for (int i = 0; i < 5; i++) {
//
//            int rem = num % 10;
//            num /= 10;
//
//            reversed = (reversed*10) + rem;
//        }
//
//        System.out.println(reversed);


        //While loop
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int reversed = 0;

        while ( num > 0){
            int rem = num % 10;
            num/=10;

            reversed = (reversed * 10) + rem;
        }

        System.out.println(reversed);
    }
}
