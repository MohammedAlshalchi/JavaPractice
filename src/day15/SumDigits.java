package day15;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
 /*
6. Write a program that can return the sum of digits from a  string
Ex:
input: A1B2C3
output:    6
Hint: You need to get each of the character by using a loop
             To convert char to number:

   '0' - 48   ==> 0

   '1' - 48   ==> 1

  */

        Scanner input =new Scanner(System.in);
        System.out.println("Enter your string");

        String digits =input.nextLine();

        int sum = 0;

        for (int i = 0; i < digits.length(); i++) {
            char ch = digits.charAt(i);
            //int digit = ch - 48;
            if (ch >= 48 && ch <= 57) {
                int digit = ch - 48;
                sum += digit;
            }

        }
        System.out.println(sum);


        input.close();

        //mo5h6m7ed9
        //27









    }
}
