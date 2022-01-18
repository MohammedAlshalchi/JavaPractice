package day19_LoopExtra;

import java.util.Locale;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        /*
   5. Write a program for the salary calculator
			1. Ask the user "How much you make an hour?"
			If user entered hourlyRate is 0 or negative, terminate the program after displaying
			the error message "Invalid Entry for Hourly Rate"

			2. Ask the user  "How many hours do you work per week?"
			if user entered weeklyHour is less than 1 or greater than 144, terminate the program
			after displaying the error message "Invalid Entry for Weekly Hours"

			3. Ask the user  "Enter your state tax rate"
			if the state tax rate is less than 0% or greater than 10%, terminate the program
			after displaying the error message "Invalid Entry for state tax Rate"


			4. Display:
					1. Gross Salary
					2. Federal Tax (assume that federal tax rate is 26%)
					3. State Tax
					4. Total Tax
					5. Net Income

			5. Ask the user "Would you like to continue?"
			If "yes" --> repeat all the previous steps
			If "no" --> print "Thank you for using Cydeo Salary Calculator APP"

If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"


			Hint: Ones Uzun knows all the formulas you need for this task


         */
        Scanner input = new Scanner(System.in);
        while (true) {
        System.out.println("How much you make an hour?");
        double hourlyRate =input.nextDouble();

            if (hourlyRate <= 0) {
                System.err.println("Invalid Entry for Hourly Rate");
                System.exit(0);
            }
            System.out.println("How many hours do you work per week?");
            double weeklyHour = input.nextDouble();

            if (weeklyHour < 1 || weeklyHour > 144) {
                System.err.println("Invalid Entry for Weekly Hours");
                System.exit(0);
            }

            System.out.println("Enter your state tax rate");
            double taxRate = input.nextDouble();

            if (taxRate < 0 || taxRate > 0.1) {
                System.err.println("Invalid Entry for state tax Rate");
                System.exit(0);
            }
            System.out.println("Gross Salary = " + hourlyRate * weeklyHour);
            System.out.println(" Federal Tax = " + 0.26);
            System.out.println("State Tax = " + taxRate);
            System.out.println("Total Tax = " + (taxRate + 0.26));
            System.out.println("Net Income = " + ((hourlyRate * weeklyHour) - (taxRate + 0.26)));


            System.out.println("Would you like to continue?");

            String a = input.next().toLowerCase();


            if (!(a.equals("yes") || a.equals("no"))) {
                System.err.println("Invalid Entry");
                System.exit(0);
            }


if (a.equals("no")){
    System.out.println("Thank you for using Cydeo Salary Calculator APP");
    break;
}

        }





















    }
}
