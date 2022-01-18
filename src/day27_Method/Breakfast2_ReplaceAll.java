package day27_Method;

import java.util.Arrays;

public class Breakfast2_ReplaceAll {
    /*
    RecplaceAll Task:
        2.1 Create a method named replace that passes three parameters: integer array, integer oldElement,
        integer newElement. The method replaces all the element of the array that matching with
        the given old element with the given new element, and returns the new array.
            Ex:
                arr = // replace the of array of given index with the new element

                replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}


        2.2 Create the same functions for double arrays, char arrays, and String arrays

     */
    public static void main(String[] args) {
        int[] arr = {10, 10, 20, 300, 40, 300, 300, 300};

        arr = replaceAll(arr, 30, 300);

        System.out.println(Arrays.toString(arr));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        arr = replaceAll(arr, 30, 300);
        System.out.println(Arrays.toString(arr));
    }




    // replace all the matching old values of the array with the new value
    public static int[] replaceAll(int[] array, int oldValue, int newValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }

        }
        return array;
    }























































}
