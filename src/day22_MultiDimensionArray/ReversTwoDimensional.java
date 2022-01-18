package day22_MultiDimensionArray;

import java.util.Arrays;

public class ReversTwoDimensional {
    public static void main(String[] args) {
/*
Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};
output:
			reverse = { {6,5,4}, {3,2,1},};

 */
 int [] [] arr = { {1,2,3}, {4,5,6}};
 int [] [] reverse = new int[arr.length][arr[1].length];

        for (int i = arr.length - 1, i1 = 0; i >= 0 ; i--, i1++) {

            for (int j = arr[i1].length - 1, j1 = 0; j >= 0 ; j--, j1++) {
                reverse[i][j] = arr[i1][j1];

            }
        }
        System.out.println(Arrays.deepToString(reverse));



























    }
}
