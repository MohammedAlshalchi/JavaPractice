package InterviewQuestions;


// solution1
//    create a method that return the reversed array
//
//    String sum= reversedArray(new int[] { 2,7,3,9});
//
//        System.out.println(sum);
//}
//    public static String reversedArray ( int [] arr){
//        String reverse = ""  ;
//        for (int i = arr.length - 1; i >= 0; i--) {
//            reverse += arr[i]+" ";
//
//        }
//        return reverse;



   /*

   solution 2
     public static void main(String[] args) {

     Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};


   int []  array = {1,2,3,4,5};

   int []  reversedArray = new int[array.length];

for (int i = array.length - 1, j=0 ; i >= 0; i--,j++) {
      reversedArray[j] = array[i];

   }
        System.out.println(Arrays.toString(reversedArray));
}

    */

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


