package day27_Method;

import java.util.Arrays;

public class InsertTask {
/*
1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element.
the method inserts the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}
1.2 Create the same function for double array, char array and string array

 */
    public static void main(String[] args) {

      int []  array = {10, 20, 30, 40, 50};
array= insert(array,2,100);
        System.out.println(Arrays.toString(array));

    }







// insert element to the given index of the array
public static int [] insert (int [] array , int index , int element){
int [] array1 = new int[array.length+1];


    for (int i = 0; i < index; i++) {
       array1 [i] = array [i];
    }
array1 [index] = element;

    for (int i = index+1 ; i < array1.length; i++) {
        array1 [i] = array [index++];
    }

return array1;
}






















































}
