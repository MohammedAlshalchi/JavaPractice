package day19_LoopExtra;

import java.util.Scanner;

public class AllTwice {
    public static void main(String[] args) {
/*
3. Write a program that can display all the characters that appeared twice in the string.
 */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your String ");

        String str = input.next();
        String result ="";
String count1 ="";

        for (int i = 0; i <str.length() ; i++) {
            int count =0;

            for (int j = 0; j < str.length(); j++) {

             if (str.charAt(i) == str.charAt(j)){
                 count++;
             }




            }
            if (count1.contains(""+str.charAt(i))){
                continue;
            }

             count1+=str.charAt(i);

            if (count == 2){
                System.out.print(str.charAt(i));
            }

        }











input.close();





    }
}
