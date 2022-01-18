package day35_Encapsulation;

import java.util.ArrayList;

public class CandyFactory {
    /*
    1.2 Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each candy
     */

    public static void main(String[] args) {
        Candy candy1 = new Candy("Oreo", 0, 10.5, false);
        Candy candy2 = new Candy("Mars", 3, 10.5, true);
        Candy candy3 = new Candy("KitKat", 5, 2, false);
        Candy candy4 = new Candy("Bounty", 5, 0, false);
        Candy candy5 = new Candy("Bueno", 1, 8, true);

        ArrayList <Candy> candies = new ArrayList<>() ;

candies.add(candy1);
candies.add(candy2);
candies.add(candy3);
candies.add(candy4);
candies.add(candy5);


        for (Candy esch: candies ) {
            System.out.println(esch.getBrand() + " : "+ esch.getPrice());

        }


















    }







































}
