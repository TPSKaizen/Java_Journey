package ArrayAndArrayList;

import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,102,33,4,5,900,203,456,8,10};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,0,3));
        System.out.println(maxRange(arr,3,7));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int max(int[] arr){
        if(arr == null)
            return -1;

        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }


    // max range
    static int maxRange(int[] arr, int start, int end){

        //edge cases
        if (arr == null || end > start)
            return -1;

        int max = Integer.MIN_VALUE;
        for (int i = start; i < end; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static void swapArr(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // reverse array
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
       while( start < end){
           swapArr(arr, start, end);
           start++;
           end--;
       }
    }
}
