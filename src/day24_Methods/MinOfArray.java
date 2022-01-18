package day24_Methods;

public class MinOfArray {
    public static void main(String[] args) {
/*
create a method that can return the minimum number from an array of integers
 */
  //minNumber(new int[] {6,9,3,1});

int min1 = minNumber(new int[] {6,9,3,1});
int sum = min1 *2 ;
        System.out.println(sum);

    }

public static int minNumber (int [] arr ){
    int min = arr[0];

    for (int i = 0; i < arr.length; i++) {
        if ( arr[i] < i){
            min = arr [i];
        }

    }

   // System.out.println(min);
   return min;

}














































}
