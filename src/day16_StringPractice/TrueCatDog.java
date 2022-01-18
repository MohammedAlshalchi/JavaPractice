package day16_StringPractice;

import java.util.Scanner;

public class TrueCatDog {
    public static void main(String[] args) {
 /*
  write a program to print true if the string "cat" and "dog" appear the same number of
   times in the given sentence
               Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true
 */
        Scanner input = new Scanner(System.in);

        System.out.println(" Enter your string ");
        String str= input.nextLine();

        String word1 ="cat";
        String word2 ="dog";

        int sum1 =0;
        int sum2 =0;

        int lengthword1 =word1.length();
        int lengthword2 =word2.length();

        for (int i = 0; i <=str.length()-lengthword1 ; i++) {
            if (str.substring(i,i+lengthword1).equalsIgnoreCase(word1)){
              sum1++;
            }

        }
        for (int i = 0; i <str.length()-lengthword2 ; i++) {
            if (str.substring(i,i+lengthword2).equalsIgnoreCase(word2)){
                sum2++;
            }
        }

if (sum1==sum2){
    System.out.println("true");
}else {
    System.out.println("false");
}



input.close();





























    }
}
