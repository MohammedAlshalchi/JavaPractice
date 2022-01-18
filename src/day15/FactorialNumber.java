package day15;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number");

        int num =input.nextInt();
int Facturial =1;
        for (int i = num; i >=1 ; i--) {
         Facturial =num*num;


        }
        System.out.println(Facturial);


input.close();




















































    }
}
