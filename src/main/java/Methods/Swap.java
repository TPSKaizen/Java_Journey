package Methods;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swapNumbers(a,b);
        System.out.println(a + " " + b);

        String name = "Brian";

        changeName(name);
        System.out.println(name);
    }

     static void changeName(String name) {
        name = "Potato man";
    }

    static void swapNumbers(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
