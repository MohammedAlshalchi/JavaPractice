package day14;

import java.util.Scanner;

public class FirstWord {
    public static void main(String[] args) {
/*
Ask user to enter two words. Print first word without its first
character
then print the second word without its first character.
Input:
apple
banana
Output:
ppleanana
 */

        Scanner scan =new Scanner(System.in);

        System.out.println("Enter first string");
String firstString =scan.next();

        System.out.println("Enter second string");
        String secondString =scan.next();

        firstString=firstString.substring(1);
        secondString=secondString.substring(1);

String result =firstString+secondString;

        System.out.println(result);





scan.close();


    }
}
