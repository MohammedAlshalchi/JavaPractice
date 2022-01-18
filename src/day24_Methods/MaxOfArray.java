package day24_Methods;

public class MaxOfArray {
    public static void main(String[] args) {

/*
 create a method that can return the maximum number from an array of integers
 */
        //MaxNumber(new int[]{3, 4, 5, 6});
   int max1    = MaxNumber(new int[]{3, 4, 5, 6}); //===> if we want to use max
int sum = max1 * 2;
        System.out.println(sum);
    }

    public static int MaxNumber(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > i) {
                max = arr[i];
            }


        }
       // System.out.println(max);
        return max;

    }

























}