package day13_stringMethod;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
  /*
 2. write a program that asks user to enter two strings, and print out the longest string
   */
        Scanner input =new Scanner(System.in);


        System.out.println("Enter first string");
        String firstString =input.nextLine();


        System.out.println("Enter second string");
        String secondString =input.nextLine();
        int lengthFirstString =firstString.length();
        int lengthSecondString =secondString.length();

        if (lengthFirstString > lengthSecondString){
            System.out.println("First string is longer "+firstString);
        }else {
            System.out.println("Second string is longer "+secondString);
        }

input.close();





















    }












}
