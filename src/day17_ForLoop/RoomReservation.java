package day17_ForLoop;

import java.util.Locale;
import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
   /*
   Create a class called RommReservation, write a program for the room reservation,
   your program asks the user wants to reserve a room.
   if user entered yes, then ask which type of room the user wants to reserve.
   if user entered no, print "have a nice day"
   (if user entered any invalid answer (other than yes/no) ask user to reenter until
    user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

   (if the user selected an invalid room, ask the user to reselect the room until
  user provides a valid entry)

    */
        Scanner input = new Scanner(System.in);

        System.out.println("Do want to have a room");
        String a =input.next().toLowerCase();

        int night =0;

        while (! (a.equals("yes") || a.equals("no"))){
            System.out.println("Enter valid response");
            a =input.next().toLowerCase();
        }




        if (a.equals("no")){
            System.out.println("Have a nice day");
        }else
            if (a.equals("yes")){

            System.out.println("which type of room the user wants to reserve?");
                input.nextLine();
           String room= input.nextLine();

            while (! (room.equals("King Bed") || room.equals("Queen Bed") || room.equals("single Bed"))){
                System.out.println("Enter valid room type");
                room= input.nextLine();
            }
                System.out.println(" how many nights?");
            night=input.nextInt();

            if (room.equals("King Bed")){
                System.out.println("King Bed $ " + night * 120);
            }else if (room.equals("Queen Bed")){
                System.out.println("Queen Bed $ " + night * 100);
            }else if (room.equals("single Bed")){
                System.out.println("Single Bed $ " + night * 80);
            }
        }















    }
}
