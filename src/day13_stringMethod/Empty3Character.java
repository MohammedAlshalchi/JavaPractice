package day13_stringMethod;

import java.util.Scanner;

public class Empty3Character {
  public static void main(String[] args) {
 /*
 3. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself


  */

    Scanner input = new Scanner(System.in);
    System.out.println("Enter sting");
    String word =input.next();

    if (word.length()==0){
      System.out.println("String is empty");
    }else if (word.length()<=3){
      System.out.println(word);
    }else if (word.length()>3){
      System.out.println(word.charAt(word.length()-3));
      System.out.println(word.charAt(word.length()-2));
      System.out.println(word.charAt(word.length()-1));
    }
input.close();






























  }























}
