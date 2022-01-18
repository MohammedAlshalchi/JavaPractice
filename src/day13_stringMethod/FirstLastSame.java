package day13_stringMethod;

import java.util.Scanner;

public class FirstLastSame {
    public static void main(String[] args) {
  /*
  1. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
   */
        Scanner input =new Scanner(System.in);

        System.out.println("Enter the word");
        String word = input.next();

        char firstLetter =word.charAt(0);
        char lastLetter =word.charAt(word.length()-1);

        if (firstLetter == lastLetter){
            System.out.println("Same");
        }else {
            System.out.println("Not same");
        }


       // int word2 =word.length();
        //System.out.println(word2);

input.close();








































    }










}
