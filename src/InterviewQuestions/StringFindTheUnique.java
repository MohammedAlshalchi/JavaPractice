package InterviewQuestions;

public class StringFindTheUnique {
    /*
   String -- Find the unique
Write a return method that can find the unique characters
from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF"
     */

    public static void main(String[] args) {
        String str = "AAABBBCCCDEF";

      //String uniqueCharactor   = uniqueCharactors(str);
        System.out.println("The unique charactors are: "+uniqueCharactors(str));
    }





    public static String uniqueCharactors (String str){

        String[] arr = str.split("");
        String unique = "";


        for (int i = 0; i < arr.length; i++) {
            int frequency = 0;

            for (int i1 = 0; i1 < arr.length; i1++) {
                if (arr[i1].equals(arr[i])){
                    frequency++;
                }
            }
            if (frequency == 1){
                unique += arr[i];
            }
        }
        
        
        
        return unique;
    }
    
    
    
    
    
    
    
    
}
