package ArrayAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr=  new int[5];

        arr[0] = 23;
        arr[1] = 233;
        arr[2] = 238;
        arr[3] = 123;
        arr[4] = 423;

        System.out.println(arr[3]);

        System.out.println(Arrays.toString(arr));

        //input using for loops
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        //output using for loops
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //output using for each loops
        for (int elem : arr) {
            System.out.println(elem);
        }

        //array of objects

        String[] objArr = new String[5];

        for (int i = 0; i < objArr.length; i++) {
            objArr[i] = in.next();
        }

        System.out.println(Arrays.toString(objArr));
    }
}
