package day13_stringMethod;

import java.util.Scanner;

public class calledTravel {
    public static void main(String[] args) {
/*
3. Create a class calledTravel. Make a cost variable to calculate how much the person will owe after everything.
		Ask the user if they have a valid passport (yes or no)
			If the user enters yes:
					The base cost of the ticket should be set to: 1000
            		Ask the user the country they to travel to (String, multiple word)
            		Ask the user how many bags they will take with them (byte)
                			> Each bag will add 50 to the cost
            		Ask the user how many people they will travel with (short)
                			> For each person the cost is reduced by 100. Up to a limit of 300.
            		Ask the user to Enter the name of the people they will travel with in one line,
            		separating each name with a comma (String, multiple word)

            		Print: "Your ticket is booked to $countryName. We have charged extra for the $numberOfBags
            		bags but you are traveling with $peopleYouTravelWith so we are giving a discount.
            		Your total cost is $costAmount"


    		If the user enters no:
    				The base cost of the passport renewal is: 200
		            Ask the user when their passport expired(int)
		                > Each year it was expired adds 75 to the cost
        			Ask the user which country they plan to travel
		            Ask the user if they will be traveling in the next year (String - yes or no)
		                > If yes: add 100 to the cost
		                > If no: subtract 50 from the cost

        			Print: "Looks like your password has been expired for $years, but not to worry
        			we will get it ready for you to travel to $allCountries.
        			Your total cost has come out to $costAmount."



 */

        Scanner input =new Scanner(System.in);
        System.out.println("You have a valid passport");
        String passport =input.next();
        if (passport.equals("yes")) {
            int cost = 1000;
            System.out.println("The country you want travel to");
            input.nextLine();
            String country = input.nextLine();
            System.out.println("How many bags you will take with you");
            byte bags = input.nextByte();
            System.out.println("How many people they will travel with you");
            short people = input.nextShort();
            System.out.println("Enter the names of the people they will travel with in one line");
            input.nextLine();
            String namePoeple = input.nextLine();

            int discount =people*100;// ask why
           int maxDiscount =300;
           if (discount<=maxDiscount){
               discount=people*100;// ask why
           }else {
                discount=maxDiscount;
            }
            int cost2=bags*50;
            System.out.println("Your ticket is booked to "+ country+". We have charged extra for the "+bags+
                   " bags but you are traveling with "+people+" so we are giving a discount.Your total cost is "+
                    (cost+cost2+discount) );}


            /*
            if (people>3){
               int cost1=300;
            }else {
                int cost1=people*100;
            }
            System.out.println("Your ticket is booked to "+ country+". We have charged extra for the "
                    +bags+
                    " bags but you are traveling with "+people+" so we are giving a discount.Your total cost is "+
                    (cost+cost1+bags*50)) ;

*/


        else if (passport.equals("no")){
            System.out.println("when your passport expired");
            int year =input.nextInt();
            int cost3= 2021-year;
            input.nextLine();
            System.out.println("which country they plan to travel");
            String Ccountry =input.nextLine();
            System.out.println("Will you be traveling in the next year");
            String travel =input.next();
            if (travel.equals("yes")){
                System.out.println("Looks like your password has been expired for "+year+"but not to worry\n" +
                        "        \t\t\twe will get it ready for you to travel to allCountries.\n"+
                        "Your total cost has come out to "+(200+cost3*75+100));
            }else {
                System.out.println("Looks like your password has been expired for "+year+"but not to worry\n" +
                        "        \t\t\twe will get it ready for you to travel to allCountries.\n"+
                        "Your total cost has come out to "+(200+cost3*75-50));
            }


        }

















































































    }































































































}
