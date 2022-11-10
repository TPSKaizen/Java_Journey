package Methods;

public class Overloading {
    public static void main(String[] args) {
        fun();
        fun(1);
    }

    static void fun(){
        System.out.println("Helo World");
    }

    static void fun(int a){
        System.out.println("Hello " + a);
    }
}
