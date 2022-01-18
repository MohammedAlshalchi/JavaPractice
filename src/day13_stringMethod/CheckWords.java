package day13_stringMethod;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {
 /*
   5. Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"

  */
/*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 words");

        String word1 =input.next(),
                word2 =input.next(),
                word3=input.next();

        if (word1.length()==word2.length() && word1.length()==word3.length()){
            System.out.println("All words are same length");
        }else if (word1.length()==word2.length() && word1.length()!=word3.length()
        ){
            System.out.println("Not Same nor Different lengths");
        }else {
            System.out.println("All different length");
        }
*/


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first word:");
        String word1 = scan.next();

        System.out.println("Enter your second word");
        String word2 = scan.next();

        System.out.println("Enter your third word");
        String word3 = scan.next();
        String result = "";

        if ( word1.equals(word2) && word2.equals(word3) ){
            result = "All words are same length";
        }else if(word1.equals(word2)){
            result =  "Not Same nor Different lengths";
        }else if(word1.equals(word3)){
            result =  "Not Same nor Different lengths";
        }else if(word2.equals(word3)) {
            result =  "Not Same nor Different lengths";
        } else {
            result = "All different length";
        }

        System.out.println(result);

scan.close();



































































    }

































































































}
