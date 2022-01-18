package day17_ForLoop;
/*
Write a program that can divide two positive numbers without
using / (division) and * (multiplication) operators
 */
import java.util.Scanner;

public class TwoPositive {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Enter two numbers");
        int num1 =input.nextInt();
        int num2 =input.nextInt();
        int sum =0;
        while(num1 >= num2){
            num1 -= num2;
            sum++;

        }
        System.out.println("the division is: "+sum);
        input.close();
    }

    }

