package day16_StringPractice;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
/*
Write a program that asks user to enter string and a char,
the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4

 */

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a string: ");
        String str = input.next();

        System.out.println("Enter a char:");
        String ch1 = input.next();

        int count = 0;

        for (int i = 0; i <str.length() ; i++) {// i: index number of str (starting from 0 )

           String ch = "" +str.charAt(i);// ch: each character of str

            if (ch1.equals(ch)){
                //count++;
            }

        }
        System.out.println(count);

        // other solution

        /* Scanner input =new Scanner(System.in);

        System.out.println("Enter string");
       String str = input.next();

       System.out.println("Enter char");
        String str1 = input.next();
        char chr = str1.charAt(0);

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {


            if (chr == str.charAt(i) ) {
                sum++;
            }

        }
        System.out.println(sum);
*/





        input.close();

    }}

