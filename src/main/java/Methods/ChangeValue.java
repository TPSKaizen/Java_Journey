package Methods;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // create array
        int[] arr = {1,3,4,5,6};

        System.out.println(Arrays.toString(arr));

        changeArr(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void changeArr(int[] nums){
        //We passed the value of the reference of the array, hence we can modify the values
        nums[0] = 99;
    }
}
