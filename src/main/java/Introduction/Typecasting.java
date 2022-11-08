package Introduction;

public class Typecasting {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        float num = in.nextFloat();
//
//        System.out.println(num);
//
//
//        // typecasting
//        int num1 = (int)(67.456f);
//
//        System.out.println(num1);

        //automatic type promotion
//        int a = 257;
//        byte b = (byte) a; // 267 % 256 = 1

//        System.out.println(b);
//
//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//
//        int d= a * b / c; // the bytes are being promoted to integers in the expression
//
//        System.out.println(d);

//        byte bob = 50;
//        bob = b*2; // cannot store int in byte

//        int number = 'A';
//        System.out.println(number);

        //Rules for type casting
        /*
            1. Byte, short, char are promoted to integer
            2. If any operands or Long,float or double, it will be promoted to long, float or double respectively

         */

        byte aByte = 42;
        char aChar = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * aByte) + (i / aChar) - (d * s);
        // float + int + double
        System.out.println((f * aByte) + " " + (i / aChar) + " " + (d * s));
        System.out.println(result);
    }
}
