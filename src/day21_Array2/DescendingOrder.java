package day21_Array2;

import java.util.Arrays;

public class DescendingOrder {
    public static void main(String[] args) {

int [] arr = {40,42,100,39,50,10,70};
int [] arr1= new int[arr.length];

        Arrays.sort(arr);

       // System.out.println(Arrays.toString(arr)); //==> to check
        for (int i = arr.length - 1 , j=0 ; i >= 0;  i--, j++) {
              arr1[j] = arr[i];


        }

        System.out.println(Arrays.toString(arr1));


















    }
}
