package day25_Method2;

import java.util.Arrays;

public class Merge {
    /*
    Create a method named merge that passes two integer array parameters,
     the method can merge two integer arrays and return the new array

				Ex:
					arr1 = {1,2,3}
					arr2 = {4,5,6}

					merge(arr1, arr2) ====> {1,2,3,4,5,6}

     */

    public static void main(String[] args) {
int[] arr3 = {1,2,3}; // int[] arr1 = {1,2,3}; ===> same
int[] arr4 = {4,5,6}; // int[] arr2 = {4,5,6};
    int [] r   = merge(arr3,arr4);

        System.out.println(Arrays.toString(r));

    }


    public static int [] merge ( int [] arr1 , int [] arr2){
        int [] arr = new int[arr1.length + arr2.length];
        int j= 0;

        for (int i = 0; i <arr1.length ; i++) {
            arr[j++] = arr1[i];

        }
        for (int i = 0; i < arr2.length; i++) {
            arr[j++]= arr2[i];

        }
        return arr;
    }














































}
