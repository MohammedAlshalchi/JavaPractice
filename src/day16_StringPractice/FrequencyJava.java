package day16_StringPractice;

import java.util.Scanner;

public class FrequencyJava {
    public static void main(String[] args) {

 /*
   write a program that can return the frequency of the word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create

  */
        Scanner input =new Scanner(System.in);
        System.out.println("Enter string");//====> Java Java
        String str=input.nextLine();

        String word ="java";
        int wordLength =word.length();
        int sum =0;
        int length = str.length();
        for (int i = 0; i < length-wordLength     ; i++) {

            if (str.substring(i,i+4).equalsIgnoreCase(word)){
                sum++;
            }

        } System.out.println(sum);
input.close();













































    }
}
