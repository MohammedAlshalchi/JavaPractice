package day12_Scanner;

import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("how many total shares they have already?");
        int shares =input.nextInt();

        System.out.println("how much their total value in the stock market is");
        double value = input.nextDouble();

        System.out.println(" the name of the company they have the most shares in");
        input.nextLine();
        String name =input.nextLine();

        if (shares>0){
            System.out.println("Your total stock market holding is $"+value+" which is made up of "+shares+" shares. "
            +name+" is your company holdings");
        }else System.out.println("");
































    }






















}
