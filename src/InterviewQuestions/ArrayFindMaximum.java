package InterviewQuestions;

public class ArrayFindMaximum {
    /*
    Write a method that can find the maximum number from an int Array
     */

    public static void main(String[] args) {
        int [] numberArray  = {1,9,10,4,5};
     int number  = maxNumber(numberArray);
        System.out.println("Maximum number of the array is: "+number);
    }

//   public static int maxNumber (int[] numberArray){
//
//     int max =Integer.MIN_VALUE;
//       for (int each : numberArray) {
//           if (each > max){
//              max = each;
//           }
//
//       }
//       return max;


    public static int maxNumber (int[] numberArray) {

       int max =  numberArray[0];

       for (int i=0 ; i <numberArray.length ; i++){

           if (numberArray[i] > max){
               max = numberArray[i];
           }
       }

        return max;
    }







}
