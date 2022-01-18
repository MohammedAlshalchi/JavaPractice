package day13_stringMethod;

import java.util.Scanner;

public class FirstLastCharactor {
    public static void main(String[] args) {
/*
1. write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence
 */

        Scanner input = new Scanner(System.in);
        System.out.println("sentence");

        String sentence =input.nextLine();

        char firstLetter =sentence.charAt(0);
        char lastLetter = sentence.charAt(sentence.length()-1);


        System.out.println("First letter: "+firstLetter);
        System.out.println("Second Letter: "+lastLetter);

input.close();














    }














}
