package InterviewQuestions;

import java.util.Arrays;

public class SameLetters {
    /*
    String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
     */

    public static void main(String[] args) {
        String a = "abc",
                b = "cab";


        boolean result =sameLetters(a,b);
        System.out.println(result);
    }







    public static boolean sameLetters(String a, String b) {

        char[] ch1 = a.toCharArray();
        System.out.println(ch1);

        char[]  ch2 = b.toCharArray();
        System.out.println(ch2);

        Arrays.sort(ch1);

        Arrays.sort(ch2);

        String newArray1="", newArray2="";

        for(char each: ch1)

           newArray1 +=each;

        for(char each: ch2)

           newArray2 +=each;

        return newArray1.equals(newArray2) ;

    }







}
