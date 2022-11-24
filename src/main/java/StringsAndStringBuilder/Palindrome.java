package StringsAndStringBuilder;

import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abcycba"));
    }


    static boolean isPalindrome(String item){
        if(item == null || item.length() == 0)
            return true;

        item = item.toLowerCase();


        for (int i = 0; i <= (item.length())/2; i++) {
            char start = item.charAt(i);
            char end = item.charAt(item.length() -1 -i);

               if(start != end){
                   return false;
               }
        }
        return true;
    }
}
