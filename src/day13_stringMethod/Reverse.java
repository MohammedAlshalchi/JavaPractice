package day13_stringMethod;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
  /*
 1.  Create a class called Reverse, write a program that will reverse a string.
 Your program should reverse a string only 5 characters long. If word is shorter,
 display message: "Too short!". If word is longer,
 display message: "Too long!".
 Otherwise, reverse this word and print out result into the console
   */

        Scanner input =new Scanner(System.in);

        System.out.println("Enter yor string");
        String word = input.nextLine();




        if (word.length()>5){
            System.out.println("Too long!");
        }else if (word.length()<5){
            System.out.println("Too short!");
        }else {

            System.out.println(word.charAt(4)+""+word.charAt(3)+""+word.charAt(2)+""+word.charAt(1)+
                    ""+word.charAt(0));// we should put " " so we can get word NOT number
            //System.out.println(""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)
                             //+word.charAt(0));
        }












input.close();





















































    }






































}
