package InterviewQuestions;


import java.util.Arrays;
import java.util.Scanner;

public class ReverseNegativeNumber {
    /*
    3. Number -- Reverse negative number
Write a return method that can reverse
negative number and return it as int
     */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number");
        int number = input.nextInt();

        if (number >= 0){
            System.out.println("Invalid number");
            System.exit(0);
        }
        int newNumber = reverseNumber(number);
        System.out.println(newNumber);

    }

    public static int reverseNumber(int number) {

            int number2 = Math.abs(number);
            String number3 = "" + number2;
            String[] arrayToNumber = number3.split("");
            String[] reversedNumber = new String[arrayToNumber.length];
            for (int i = arrayToNumber.length - 1, j = 0; i >= 0; i--, j++) {
                reversedNumber[j] =arrayToNumber[i];
            }
            String temporary  = "";
            for (int r = 0; r < reversedNumber.length; r++) {

               temporary += reversedNumber[r];
            }

        return Integer.parseInt(temporary);
    }







}


/*
public static int reverseNumber(int num){

        String numberAsString = String.valueOf(num); // this method turns int into a String

        String reversedString = "";
        for (int i = numberAsString.length()-1; i > 0 ; i--) {
            reversedString += numberAsString.charAt(i);
        }

        int stringToNumber  = Integer.parseInt(reversedString.toString()); //converts String into primitive
        return -stringToNumber;


    }
 */