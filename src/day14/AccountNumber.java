package day14;
import java.util.Scanner;
public class AccountNumber {
    public static void main(String[] args) {
   /*
     Create a class called AccountNumber.
Ask the user enter an account number (String). Check if these
account number is valid.
> If the account number begins with a â2â the account
number should be 7 characters long
> If the account number begins with a â5â the account
number should be 10 characters long
â> If the account number does not begin with a 2 or a 5 OR
the account number lengths
do not meet the expected results print âInvalid
   account numberâ
    */
/*
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an account number");
        String account = scan.next();

        scan.close();

        String result = "Invalid";

        if(account.charAt(0) == '2'){
            if(account.length() == 7){
                result = "Valid";
            }
        }else if(account.charAt(0) == '5'){
            if(account.length() == 10){
                result = "Valid";
            }
        }

        System.out.println(result);

*/

Scanner scan =new Scanner(System.in);
        System.out.println("Enter your account number");
        String str =scan.next();

        if (str.charAt(0)=='2' && str.length()==7){
            System.out.println("Valid");
        }else if (str.charAt(0)=='5' && str.length()==10){
            System.out.println("Valid");
        }else {
            System.out.println("Invalid account number");
        }

scan.close();























































































    }
}
