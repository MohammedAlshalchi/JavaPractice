package InterviewQuestions;

public class StringReverse {
    /*
    String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
     */

    public static void main(String[] args) {
        String str = "ABCD";

        System.out.println("The reverse of the string is: "+reverse(str));
    }


   public static String reverse (String str){
       String reverseStr = "";

       for (int i = str.length()-1; i >= 0; i--) {
           reverseStr += str.toCharArray()[i];
       }



       return reverseStr;
   }
}
