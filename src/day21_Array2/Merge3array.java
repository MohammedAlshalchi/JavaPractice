package day21_Array2;

import java.util.Arrays;

public class Merge3array {
    public static void main(String[] args) {

  /*
   Write a program that can merge 3 arrays of integers

    		Ex:
    			arr1 = {30, 10, 20};
    			arr2 = {15, 40, 25, 35};
    			arr3 = {8, 9, 17, 5, 4, 1}

			Output:
				{30,10,20,15,40,25,35,8,9,17,5,4,1}

   */
int [] arr1  = {30, 10, 20},
        arr2 = {15, 40, 25, 35},
        arr3 = {8, 9, 17, 5, 4, 1};

int [] arr4 = new int[arr1.length + arr2.length + arr3.length];
int j = 0;
        for (int each : arr1) {

           arr4[j++] +=each;
        }
        for (int each : arr2) {
            arr4 [j++] +=each;
        }
        for (int each : arr3) {
            arr4 [j++] += each;
        }

        System.out.println(Arrays.toString(arr4));












    }
}
