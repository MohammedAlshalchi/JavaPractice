package day16_StringPractice;

import java.util.Scanner;
/*
Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative

 */
public class PositiveNegative {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter number");

int sum1 =0;
int sum2 =0;

        for (int i = 1; i <= 5 ; i++) {
            int number =input.nextInt();
          if (number>0){
              sum1+=1;
          }else if (number<0){
              sum2+=1;
          }


        }

        System.out.println(sum1+" positive and "+sum2+" negative");



input.close();




































    }
}
