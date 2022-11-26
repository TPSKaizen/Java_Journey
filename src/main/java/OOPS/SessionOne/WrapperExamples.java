package OOPS.SessionOne;

public class WrapperExamples {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Integer num1 = 45;
        Integer num2 = 50; // wont swap because Integer is final

        swap(a,b);
        swap(num1, num2);

        System.out.println(a + " " + b);
        System.out.println(num1 + " " + num2);

    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}
