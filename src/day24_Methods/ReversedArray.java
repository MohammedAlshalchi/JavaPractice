package day24_Methods;

public class ReversedArray {
    public static void main(String[] args) {
/*
create a method that return the reversed array
 */
String sum= reversedArray(new int[] { 2,7,3,9});

        System.out.println(sum);
    }
public static String reversedArray ( int [] arr){
    String reverse = ""  ;
    for (int i = arr.length - 1; i >= 0; i--) {
        reverse += arr[i]+" ";

    }
  return reverse;
}




















































}
