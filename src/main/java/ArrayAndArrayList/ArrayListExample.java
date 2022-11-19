package ArrayAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner in = new Scanner(System.in);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.contains(123));

        list.set(0,99);

        list.remove(1);

        System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get item at any index

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }


    }
}
