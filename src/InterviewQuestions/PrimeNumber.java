package InterviewQuestions;

import java.util.Scanner;

public class PrimeNumber {
/*
1. Numbers -- Prime Number
Write a method that can check if a number is
prime or not
 */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input the number");
        int number = input.nextInt();

        int result = PrimeNumber(number);

    }

    public static int PrimeNumber(int number) {


if (number < 2 ){
    System.out.println("Invalid number");

}else {


    for (int i = 2; i < number; i++) {

        if (number % i == 0) {
            System.out.println(number + " is not a prime number");
            break;
        } else {
            System.out.println(number + " is a prime number");
            break;
        }
    }

}

        return number;

}

    }














































