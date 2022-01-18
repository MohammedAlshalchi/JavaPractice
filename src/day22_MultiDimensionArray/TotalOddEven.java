package day22_MultiDimensionArray;

public class TotalOddEven {
    public static void main(String[] args) {

     /*
       Write a program that can count the total odd and even numbers from a two dimensional array
      */

int [] [] arr = {  {8,4},{3,7,8},{1,9,11,10}  };

int odd = 0,
        even =0;

        for (int[] each : arr) {

            for (int each1 : each) {

                if ( each1 %2 == 0){
                    even++;
                }
                if (each1 %2 != 0){
                    odd++;
                }
            }

        }
        System.out.println(" The even numbers: "+even);
        System.out.println("The odd numbers: "+odd);















    }
}
