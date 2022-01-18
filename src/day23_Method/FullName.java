package day23_Method;

import java.util.Locale;

public class FullName {
    /*
  write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYdEo", "SCHOOL");

                output:
                    "Cydeo School"
     */

    public static void main(String[] args) {

   FullName("cYdEo","SCHOOL" );


    }

   public static void FullName (String firstName , String LastName) {

       System.out.println(firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase()
       +" " +LastName.substring(0,1).toUpperCase() + LastName.substring(1).toLowerCase() );

   }



























































































































}
