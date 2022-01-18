package day19_LoopExtra;


import java.util.Scanner;

public class AreaParimeterSquare {
    public static void main(String[] args) {
        /*
   2. Write a program that can calculate the area and perimeter of a Square:
			1. Ask the user "Enter the side of the square:"
	if user enters 0 or negative numbers, terminate the program after displaying the error message
				"Invalid Entry for the side of the square"

			2. Display:
					1. Area of square
					2. Perimeter of square

			3. Ask the user "Would you like to calculate another Square?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

		If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

			Hint: Ones Uzun knows all the formulas you need for this task

         */

        Scanner input = new Scanner(System.in);



        while (true){
            System.out.println( "Enter the side of the square:");
            double side = input.nextDouble();
            double area = 0;
            double perimeter = 0;

            if (side < 0){
                System.err.println();
                System.exit(0);

            }
if ( side >= 0){

    area =side * side;
    perimeter = side*4;

    System.out.println("area =" +area);
    System.out.println("perimeter = "+ perimeter);

}
            System.out.println("Would you like to calculate another Square?");
String a =input.next().toLowerCase();

while ( ! (a.equals("yes") || a.equals("no"))){
    System.out.println("Please Re enter");
    a =input.next().toLowerCase();
}
if (a.equals("no")){
    System.out.println("Thank you for using Cydeo Square Calculator APP");
    break;



}



        }















































    }
}
