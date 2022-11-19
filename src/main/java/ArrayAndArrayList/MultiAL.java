package ArrayAndArrayList;

import java.util.ArrayList;

public class MultiAL {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //initialize
        for (int i = 0; i < 5; i++) {
            list.add(new ArrayList<>());
        }


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                list.get(i).add(1);
            }
        }

        System.out.println(list);
    }
}
