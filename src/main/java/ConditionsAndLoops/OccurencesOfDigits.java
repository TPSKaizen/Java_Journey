package ConditionsAndLoops;

public class OccurencesOfDigits {
    public static void main(String[] args) {

         long num = 12222334567777779L;
         int digit = 7;
         int occurences = 0;

         while ( num > 0){
             long rem = num % 10;
             if( rem == digit)
                 occurences++;

             num /= 10;
         }

        System.out.println(occurences);

    }
}
