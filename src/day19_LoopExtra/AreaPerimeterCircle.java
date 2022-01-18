package day19_LoopExtra;

import java.util.Scanner;

public class AreaPerimeterCircle {
    public static void main(String[] args) {
        /*
     1. Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
		if user enters 0 or negative numbers, terminate the program after displaying the error message
				"Invalid Entry for the radius of the circle"

			2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle

			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

			Hint: Ones Uzun knows all the formulas you need for this task
         */

        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("Enter the radius of the circle:");
            double radius = scan.nextDouble();
            double diameter = 0;
            double area = 0;
            double perimeter = 0;

            if (radius <= 0) {
                System.out.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            }
            if (radius >= 0) {
                area = radius * radius * 3.14;
                perimeter = 2 * radius * 3.14;
                diameter = radius * 2;
                System.out.println("area = " + area);
                System.out.println("diameter = " + diameter);
                System.out.println("perimeter = " + perimeter);
            }
            System.out.println("Would you like to calculate another circle?");
            String yesOrNo = scan.next().toLowerCase();

            while (!(yesOrNo.equals("yes") || yesOrNo.equals("no"))) {
                System.out.println("Invalid entry");
                yesOrNo = scan.next().toLowerCase();
            }
            if (yesOrNo.equals("no")) {
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                break;
            }


        }
        scan.close();
    }
}
