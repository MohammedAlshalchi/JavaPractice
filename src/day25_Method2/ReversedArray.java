package day25_Method2;

import java.util.Arrays;

public class ReversedArray {

    /*
   Create method named reverse that passes an integer array parameter,
   the method can return the reversed array

				Ex:
					arr = {10, 20, 30, 40};

					reverse(arr) ==> {40, 30, 20, 10}


     */
    public static void main(String[] args) {

int [] arr = {1,2,3,4,5};
int [] r = reverseArray(arr);
        System.out.println(Arrays.toString(r));

    }

public static int [] reverseArray (int [] arr){

     int [] arr1 = new int[arr.length];
     int j =0;
    for (int i = arr.length - 1; i >= 0; i--) {
        arr1[j++] = arr[i];
    }


 return arr1;
}













































}
