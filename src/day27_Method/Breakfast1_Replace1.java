package day27_Method;

import java.util.Arrays;

public class Breakfast1_Replace1 {
    /*
    Replace Task:
      1.1 Create a method named replace that passes three parameters: integer array, integer index,
      integer newElement. The method replaces the element of the array at given index with the new element,
      and returns the new array.
                    Ex:
                        arr = {1,2,3,4,5};

                        replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}
    1.2 Create the same functions for double arrays, char arrays, and String arrays

     */
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
    arr   = replace(arr,2,30);

        System.out.println(Arrays.toString(arr));
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
String [] arr2 = {"Java", "Python","C++","Ruby"};
arr2 = replace(arr2,2,"C+");
        System.out.println(Arrays.toString(arr2));



    }








// replace the of array of given index with the new element
    public static int[] replace(int[] arrary, int index, int newElement) {
        if (index < 0 || index > arrary.length-1){
            System.err.println();
            System.exit(0);
        }

arrary [index] = newElement;

        return arrary;

    }



  public static double[] replace(double[] arrary, int index, int newElement) {
        if (index < 0 || index > arrary.length-1){
            System.err.println();
            System.exit(0);
        }

arrary [index] = newElement;

        return arrary;

    }

    public static char [] replace(char [] arrary, int index, char newElement) {
        if (index < 0 || index > arrary.length-1){
            System.err.println();
            System.exit(0);
        }

        arrary [index] = newElement;

        return arrary;

    }






    public static String [] replace(String [] arrary, int index, String newElement) {
        if (index < 0 || index > arrary.length-1){
            System.err.println();
            System.exit(0);
        }




        arrary [index] = newElement;

        return arrary;

    }















































}




























































