package ArrayAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
        /*
                1 2 3
                4 5 6
                7 8 9
         */

       /// int[][] arr = new int[3][3]; // dont need to specify columns but you can if you want

//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7,8,9}
//        };
//
//        for (int[] array: arr) {
//            System.out.println(Arrays.toString(array));
//        }

        int[][] arr = new int[3][3];

        // input
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        //output
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // output with Arrays.toString
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        // output with foreach
        for (int[] array: arr) {
            System.out.println(Arrays.toString(array));
        }
    }
}
