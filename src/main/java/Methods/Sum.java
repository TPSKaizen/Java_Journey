package Methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
       int ans = sumReturned();

       int ans2 = sum3(1,3);

        System.out.println(ans);
        System.out.println(ans2);
    }

    // pass the value of numbers when you are calling the value in main
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }

    // Q : take input fo 2 numbers and print the sum
    static void sum(){
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1 + num2;

        System.out.println(sum);
    }

    // Q : Return value of sum

    static int sumReturned(){
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1 + num2;

        return sum;
    }


}
