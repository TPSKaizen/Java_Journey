package ConditionsAndLoops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int count = 2;

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

            while ( count <= n ){
                int temp = b;
                b = a+b;
                a = temp;
                count++;

                System.out.println(b);
        }


    }
}
