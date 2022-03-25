package InterviewQuestions;

public class SumOfDigitsInA_String {
    /*
    Write a method that can return the sum of the digits in a string
     */

    public static void main(String[] args) {
        System.out.println(sumOfDigits("moha45ed78"));
    }



public static int sumOfDigits ( String str){

    int count = 0;
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) >= 48 && str.charAt(i) <= 57){
            count+= (str.charAt(i)-48);
        }

    }



return count;
}



}
