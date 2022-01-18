package day19_LoopExtra;

import java.util.Scanner;

public class IndexOfFirstUnique {
    public static void main(String[] args) {
        /*
    4. Write a program that can return the index number of the first unique character.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your String");
        String str = input.nextLine();


        for (int i = 0; i < str.length(); i++) {
            int count =0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)){
                    count++;
                }


            }

            if (count == 1){
                System.out.print(i);
                break;
            }
        }


input.close();

    }}
