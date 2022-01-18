package day24_Methods;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
/*
create a method that can merge two arrays and return
 the new array
 */

String [] arr1 = { "wooden" , "spoon"};
String [] arr2 = {"cydeo" , "school"};
String newArray = mergeTwoArray(arr1,arr2);
        System.out.println(newArray);



    }

public static String mergeTwoArray ( String [] arr1 , String [] arr2){
    String [] result = new String[arr1.length + arr2.length];
    int i =0;
    for (int j = 0; j < arr1.length; j++) {

        result[i++] =arr1[j];
    }
    for (int j = 0; j < arr2.length; j++) {
        result[i++] = arr2[j];
    }
    return Arrays.toString(result);
}



















































}






































