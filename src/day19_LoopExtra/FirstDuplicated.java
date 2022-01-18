package day19_LoopExtra;

import java.util.Scanner;

public class FirstDuplicated {
    public static void main(String[] args) {
   /*
   1. Write a program that can return the first duplicated character from a string
    */
/*
//MY SOLUTION ?????????
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your String");
        String str =input.next();


        for (int i = 0; i < str.length(); i++) {

            if ( ((str.indexOf(i) == str.lastIndexOf(i)))){
                System.out.println(str.charAt(i));
                break;

            }


        }
*/
      /*
         String str = scan.next();

        String duplicate = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char ch = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                char ch2 = str.charAt(j);
                if (ch == ch2) {
                    count++;
                }
            }
            if (count >= 2) {
                duplicate += ch;
                break;

            }
        }System.out.println(duplicate);
       */
        // TAMERLEAN SOULTION
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int output = 0;
        for (char i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                System.out.println(str.charAt(i));
                break;
            }

        }
scan.close();
    }
}
