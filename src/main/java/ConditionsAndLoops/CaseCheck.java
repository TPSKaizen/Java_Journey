package ConditionsAndLoops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // There is no nextChar, so we take a String input and take the first character
        char ch = in.next().trim().charAt(0);

        if(ch >= 'a' && ch <='z')
            System.out.println("Lowercase");
        else
            System.out.println("Uppercase");

       // System.out.println(ch);

    }
}
