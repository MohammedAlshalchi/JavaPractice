package day18_LoopPractice;
import  java.util.Scanner;
public class UniqueCharacters {
    public static void main(String[] args) {
      /*
   Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods
Ex:
     str = "aabccdeef";
 output:
                                bdf
 Hint: if you find out how to find the frequency of one character, then you can repeat it for the remaining characters
   to find the frequency.
            		if frequency of a character == 1  =========> unique

       */


        Scanner scan= new Scanner(System.in);
        System.out.println("Enter any string: ");
        String word = scan.next();

        for(int i=0; i < word.length(); i++) {
            int count = 0;

            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) { // ======> To make sure character repeat just one time ( unique )
                System.out.print(word.charAt(i));
/*
 if(count != 1){ ====> other solution
                continue;
            }
 */

            }

        }









































    }
}
