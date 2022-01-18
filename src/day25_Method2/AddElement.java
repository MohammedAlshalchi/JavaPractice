package day25_Method2;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {

        int [] arrary = {1,2,3};
      int [] r =  addElement(arrary,5);

        System.out.println(Arrays.toString(r));


    }
    /*
   6. create a method named addElement that takes one integer array and one integer,
 the method can add the Integer number after the  last index of the integer array and returns the new array
Ex:
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4}
     */


public static int [] addElement (int [] array , int element ){
    int [] arr1 = new int[array.length+1];
    int i =0;
    for (int each : array) {
        arr1[i++] = each;
    }
    arr1[i] = element;

    return arr1;
}










}
