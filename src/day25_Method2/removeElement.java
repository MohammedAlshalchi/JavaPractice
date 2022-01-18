package day25_Method2;

import java.util.Arrays;

public class removeElement {
    /*
    create a method named removeElement that passes one integer array and one integer,
    the method removes the integer index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2


				removeElement(array, index) ==== {10, 20, 40, 50, 60}


     */
    public static void main(String[] args) {
        int [] arr2 = {10, 20, 30, 40, 50, 60};
      int [] r  = removeElement(arr2,2);

        System.out.println(Arrays.toString(r));
    }

    public static int [] removeElement (int [] arr , int index ) {

        int [] arr1 = new int[arr.length-1];

        int j =0;

        for (int i = 0; i < arr.length; i++) {
            if ( i == index){
                continue;
            }else {
                arr1[j++] = arr[i];
            }
        }

        return arr1;
    }










































}
