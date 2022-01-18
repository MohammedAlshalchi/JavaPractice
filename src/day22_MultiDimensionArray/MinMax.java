package day22_MultiDimensionArray;

public class MinMax {
    public static void main(String[] args) {
    /*
   Write a program that can find the minimum and maximum numbers from a two dimensional array
     */
int [] [] arr = { {-1,4},{3,7,8},{1,9,11,10} };
              //    0      1         2

        int max = arr [0] [0];
        int min = arr [0] [0];

        for (int[] each : arr) {

            for (int each1 : each) {
                
                if (each1 > max){
                    max = each1;
                }

            }
            for (int each2 : each) {
                if ( each2 < min ){
                    min = each2;
                }

            }
        }

        System.out.println("The minimum number is: "+min);
        System.out.println("The maximum number is: "+max);


























    }
}
