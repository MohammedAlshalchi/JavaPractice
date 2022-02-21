import java.util.Scanner;

public class Fin_Ra_FinRa {




/*
FINRA :
Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of
3print "FIN" instead of the number and for numbers which are a multiple of 5,
print "RA" instead of the number. for numbers which are a multiple of both 3 and 5,
 print "FINRA" instead of the number.
 
 */

    public static void main(String[] args) {

        //  Scanner input = new Scanner(System.in);
       // int num1 = input.nextInt();
       // int num2 = input.nextInt();
        // FINRA(num1,num2);


        FINRA(1,30);
    }



       public static void FINRA (int num1 , int num2) {
        for (int i = 1; i <= 30 ; i++) {

            if (i %5 ==0 && i%3 ==0 ){
                System.out.print("FINRA ");

            }else if (i %3 == 0){
                System.out.print("FIN ");

            }else if (i %5 ==0){
                System.out.print("RA ");
            }else {
                System.out.print(i+" ");
            }

        }


    }
}
