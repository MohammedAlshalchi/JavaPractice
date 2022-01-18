package day31_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
    public static void main(String[] args) {



    String [] arr = {"Tunc","Yasamen","Azamat"};  // create array
        ArrayList<String> names = new ArrayList<>(Arrays.asList(arr)); //Array to arrayList
        names.add("Mohammed");
        System.out.println(names);// arrayList print


/* // another way to add
 for (String each : arr){
     names.add(each);
 }
*/


String [] arrNames =new String[names.size()]; // create new String array
arrNames = names.toArray(arrNames); // arrayList to array
        System.out.println(Arrays.toString(arrNames));// print array


        /*
        for (int i = 0; i < arrNames.length; i++) {
            arrNames[i] = names.get(i);
        }
*/



































    }
}
