package day15;

import java.util.Scanner;

public class SumOfAnyNumber {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter your number");

        int num=input.nextInt();
int sum=0;
        for (int i = 0; i <= num; i++) {
           sum+=i;

        }

        System.out.println(sum);


input.close();




































    }
}
