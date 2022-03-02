package InterviewQuestions;

import java.util.Scanner;

public class ArmstrongNumbers {
    /*
    2. Numbers -- Armstrong numbers
Write a method that can check if a number is
Armstrong number
     */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number");
        int num = input.nextInt();


       boolean armstrongNumber = ArmStrongNumber(num);
       if (armstrongNumber){
           System.out.println(armstrongNumber+" : "+" is an Armstrong number ");
       }else {
           System.out.println(armstrongNumber+" : "+" is not an Armstrong number ");
       }

    }

    public  static  boolean ArmStrongNumber (int  num) {

        int a = 0,    b =0,    c= num;

        while(num>0){

            a = num% 10;
            num /= 10;
            b= b + (a*a*a);
        }

        if(c == b) {
            return true;
        }
        return false;
    }





}
