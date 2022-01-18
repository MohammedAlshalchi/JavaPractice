package day12_Scanner;

import java.util.Scanner;

public class PlaceAnOrder {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


    System.out.println("the prodcut name");
    String productName = input.nextLine();

    System.out.println("the price");
    Double thePrice =input.nextDouble();

    System.out.println("the quantity");
    int theQuantity = input.nextInt();

    System.out.println("their first name");
    String name= input.next();

    System.out.println(name+", your order for "+ theQuantity+"" +""+productName+" has been places. Your total is "+thePrice);

input.close();




















  }






















}
