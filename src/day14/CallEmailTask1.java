package day14;
/*
Create a class called EmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.
        Write a program that can swap first name with last name in the email (Saperated by an underscore).
        If the email doesn't contain an underscore print the given input email.
            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
 */


public class CallEmailTask1 {
    public static void main(String[] args) {

String email ="mike_tyson@gmail.com";

String First =email.substring(0,email.indexOf("_"));// we must give number
String last =email.substring(email.indexOf("_")+1,email.indexOf("@"));
String rest =email.substring(email.indexOf("@"));
email=last+"_"+First+rest;

        System.out.println(email);















































    }
}
