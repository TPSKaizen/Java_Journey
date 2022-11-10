package Methods;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(isPrime(n));
    }

    static boolean isPrime(int n) {
        boolean ans = true;

        if (n <= 1)
            ans = false;

        int c = 2;
        while(c * c <= n){
            if( n % c == 0) {
                ans = false;
            }
            c++;
        }
        return ans;
    }

}
