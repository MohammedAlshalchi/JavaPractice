package day21_Array2;

public class EvenOdd {
    public static void main(String[] args) {

/*
Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop

 */
        int[] numbers = {5, 10, 23, 45, 8, 21, 16};

        int evenNumbers = 0, oddNumbers = 0;


        for (int each : numbers) {
            if (each%2 == 0) {
                evenNumbers++;
            }
            if(each%2!=0){
                oddNumbers++;
            }


        }

        //System.out.println("Odd numbers are: " + oddNumbers + ", Even numbers are: " + evenNumbers);

        System.out.println(oddNumbers);
        System.out.println(evenNumbers);

































    }
}
