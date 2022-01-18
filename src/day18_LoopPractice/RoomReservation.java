package day18_LoopPractice;

import java.util.Locale;
import java.util.Scanner;  // =========> check the answer

public class RoomReservation {
    public static void main(String[] args) {
/*
Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
 the program asks the user which bedroom does he/she wants to reserve, and how many nights  he/she is staying.
        Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price
If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
 */
        Scanner input = new Scanner(System.in);

while (true) {
    System.out.println("Which bedroom does he/she wants to reserve, and how many nights he/she is staying?");
    String room = input.nextLine();
    int night = input.nextInt();

    input.nextLine();
    while (! (room.equals("King Bed") || room.equals("Queen Bed") || room.equals("single Bed"))){
        System.out.println("Which bedroom does he/she wants to reserve, and how many nights he/she is staying?");
         room = input.nextLine();
         night = input.nextInt();
    }

    System.out.println("would you like to reserve another room?");
    String answer = input.next().toLowerCase();

    while (! (answer.equals("yes") || answer.equals("no"))){
        System.out.println("would you like to reserve another room?");
        answer = input.next().toLowerCase();

    }if (room.equals("King Bed")){
        System.out.println("King Bed "+(night*120)+"$" );
    }else if ((room.equals("Queen Bed"))){
        System.out.println("Queen Bed"+(night*100)+"$");
    }else {
        System.out.println("single Bed" + (night * 80) + "$");
    }
    if (answer.equals("no")) {
        break;
    }


        }






































































    }
}
