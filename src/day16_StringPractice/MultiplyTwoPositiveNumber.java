package day16_StringPractice;

import java.util.Scanner;

public class MultiplyTwoPositiveNumber {
    public static void main(String[] args) {
     /*
       Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200

      */

        Scanner input =new Scanner(System.in);
        System.out.println("Enter you teo numbers");

        int num1 =input.nextInt();
        int num2 =input.nextInt();

        int sum=0;

        if(num1>0 && num2>0 ){

            for(int i=0;i<num1;i++){
                sum += num2;
            }
            System.out.println(sum);

        }else{
            System.out.println("Invalid");
        }

input.close();




























































































    }



















































}
