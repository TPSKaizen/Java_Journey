package ArrayAndArrayList;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {

        int[] arr = new int[5];
        System.out.println(Arrays.toString(arr));

        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] arr){
        arr[0] = 99;
    }
}
