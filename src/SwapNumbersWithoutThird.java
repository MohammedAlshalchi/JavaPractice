import java.util.Scanner;

public class SwapNumbersWithoutThird {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in) ;


        System.out.println("Input first number");
        int num1 = input.nextInt();

        System.out.println("Input second number");
        int num2 = input.nextInt();
        //num1=10 num2 =5

        num1 = num1*num2;  // num1=50
        num2 = num1/num2;  // num2=10
        num1 = num1/num2;  // num1=5

        System.out.println("First number "+num1+" Second number 10" +
                ""+num2);
















    }



}
