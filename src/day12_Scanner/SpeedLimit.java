package day12_Scanner;

import java.util.Scanner;

public class SpeedLimit {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        String result ="";

        System.out.println("Enter current speed:");
        int speedLimit =input.nextInt();

        if (speedLimit>55){
            result="You're driving 50 mph over the limit. Slow down!";
        }

        System.out.println(result);

input.close();





























    }




















}
