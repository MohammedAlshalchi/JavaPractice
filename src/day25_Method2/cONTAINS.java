package day25_Method2;

public class cONTAINS {
    /*
    Create a method named contains that passes one integer array and one integer parameters,
     the method returns true if the given integer is contained in the given array, otherwise returns false
Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;

					contains(arr, num) ===> false
     */

    public static void main(String[] args) {



int [] array = {1,2,3,4};
boolean r    = contains(array,3);
        System.out.println(r);



    }

public static boolean contains (int [] array , int element){
     boolean result = false;
    for (int each : array) {
        if ( each == element){
            result = true;
        }
    }


  return result;
}















































            }









































































































