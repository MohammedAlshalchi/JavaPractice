package InterviewQuestions;

public class RemoveDuplicates {
    /*
    String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC
     */

    public static void main(String[] args) {
        String str = "AAABBBCCC";
       String newString  = removeDup(str);
        System.out.println(newString);
    }


    public static  String  removeDup( String  str) {

        String result = "";

        for (int i = 0; i < str.length(); i++)

            if (!result.contains("" + str.charAt(i)))

                result += "" + str.charAt(i);



        return result;

    }







}
