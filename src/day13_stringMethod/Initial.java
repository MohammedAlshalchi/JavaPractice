package day13_stringMethod;

import java.util.Scanner;

public class Initial {
    public static void main(String[] args) {
  /*
   2. write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output
   */

        Scanner input =new Scanner(System.in);

        System.out.println("Enter first word");
        String word1= input.next();

        System.out.println("Enter second word");
        String word2 =input.next();


        word1=word1.toUpperCase();
        word2 =word2.toUpperCase();

        char firstLetter =word1.charAt(0);
        char lastLetter =word2.charAt(0);

        System.out.println(firstLetter+"."+lastLetter);

input.close();


































































    }








































































}
