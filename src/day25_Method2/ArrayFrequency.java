package day25_Method2;

public class ArrayFrequency {
    /*
    create method that accepts one integer array and one integer number and returns
    the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5

     */

    public static void main(String[] args) {

int [] arr = {1,1,1,2,2,2,4,4};
       int r = frequencyOfNumber(arr,1);

        System.out.println(r);
    }


    public static int frequencyOfNumber (int [] arr , int element ){

        int count =0;

        for (int each : arr) {
            if ( each == element ){
                count++;
            }

        }



        return count;
    }













}
