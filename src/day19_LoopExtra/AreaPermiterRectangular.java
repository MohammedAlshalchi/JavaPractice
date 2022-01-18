package day19_LoopExtra;

import java.util.Locale;
import java.util.Scanner;

public class AreaPermiterRectangular {
    public static void main(String[] args) {
        /*
 3. Write a program that can calculate the area and perimeter of a Rectangle:
			1. Ask the user "Enter the length of the Rectangle:"
	if user enters 0 or negative numbers, terminate the program after displaying the error message
				"Invalid Entry for the length of the rectangle"

			2. Ask the user "Enter the width of the Rectangle:"
	if user enters 0 or negative numbers, terminate the program after displaying the error message
				"Invalid Entry for the width of the rectangle"

			3. Display:
					1. Area of rectangle
					2. Perimeter of rectangle

			4. Ask the user "Would you like to calculate another Rectangle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Rectangle Calculator APP"

	If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

			Hint: Ones Uzun knows all the formulas you need for this
         */


        Scanner input = new Scanner(System.in);

        while (true){

            System.out.println( "Enter the length of the Rectangle:");
            double l = input.nextDouble();
            double area= 0;
            double perimeter = 0;
            if (l <= 0){
                System.err.println("Invalid Entry for the length of the rectangle");
                System.exit(0);
            }

            System.out.println( "Enter the width of the Rectangle:");
            double w = input.nextDouble();

            if (w <=0 ) {
                System.err.println("Invalid Entry for the width of the rectangle");
                System.exit(0);
            }

if ( w >0 && l >0 ){
     area =w*l;
     perimeter= (w+l)*2;
    System.out.println("Area = "+ area);
    System.out.println("perimeter = "+perimeter);
}
            System.out.println("Would you like to calculate another Rectangle?");
String a = input.next().toLowerCase();

while ( ! (a.equals("yes") || a.equals("no"))){
    System.out.println("Re enter");
    a = input.next().toLowerCase();
}
if ( a.equals("no")){
    System.out.println("Thank you for using Cydeo Rectangle Calculator APP");
    break;
}

        }











































    }
}
