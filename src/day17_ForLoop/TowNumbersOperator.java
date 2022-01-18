package day17_ForLoop;

import java.util.Scanner;
/*
 write a program to ask user to enter two number and math operator, and return the result.
if the operator is invalid operator, ask user to re-enter the operator until
user provides a valid operator (+, -, *, /)
 */
public class TowNumbersOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = input.nextInt();

        System.out.println("Enter second number");
        int num2 = input.nextInt();

        System.out.println("Enter the operator");
        char operator =input.next().charAt(0);

        int result =0;


        while (! (operator == ('+') || operator == ('-') || operator == ('*') ||
                operator == ('/'))){
            System.out.println("Re enter the operator");
            operator =input.next().charAt(0);

        }
        if (operator== ('+') ){
            result=num1+num2;
        }else if (operator== ('-')){
            result=num1-num1;
        }else if (operator ==('*')){
            result=num1*num2;
        }else {
            result=num1/num2;
        }

        System.out.println(result);



































    }
}
