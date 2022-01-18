package day14;

import java.util.Scanner;

public class EndsWithLy {
    public static void main(String[] args) {
    /*
   ask the user to enter a word. if the word ends with "ly", print
"really???" ,  otherwise, print "never mind"
     */

        Scanner scan =new Scanner(System.in);

        System.out.println("Enter word");
        String word =scan.next();

        String result =word.substring(word.length()-2);

        if (result.equals("ly")){
            System.out.println("really???");
        }else {
            System.out.println("never mind");
        }

scan.close();






































    }
}
