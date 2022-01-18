package day25_Method2;

import java.util.Arrays;

public class IsAngram {
   /*
    2. create a method named isAnagram that passes two String parameters,
    the method returns true if the given two strings are anagram, otherwise returns false
    			Ex:
    				str1 = "cba"
    				str2 = "bac";

    				isAnagram(str1, str2) ====> true

    */

    public static void main(String[] args) {

boolean isAnagram = isAnagram("abc" , "cba");

        System.out.println(isAnagram);

    }

    public static boolean isAnagram(String str1, String str2) {
        boolean isAnagram;

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            isAnagram = true;
        } else {
            isAnagram = false;
        }
        return isAnagram;
    }



































}
