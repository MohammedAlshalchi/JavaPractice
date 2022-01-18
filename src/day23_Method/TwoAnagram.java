package day23_Method;

import java.util.Arrays;

public class TwoAnagram {
    /*
 create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")


			output:
				silent and listen are anagram
     */
    public static void main(String[] args) {


        TwoAnagram  ("silent" , "listen");


    }

public static void TwoAnagram ( String word1 , String word2 ){
      String [] arr1 = word1.split("");
      String [] arr2 = word2.split("");
    Arrays.sort(arr1);
    Arrays.sort(arr2);

    if (Arrays.equals(arr1,arr2)){
        System.out.println("Is anagram");

    }else {
        System.out.println("Is not anagram");
    }
}
































}

