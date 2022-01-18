package day18_LoopPractice;

public class FrequencyOfTheCharacters {
    public static void main(String[] args) {
  /*
Write a program that can find the frequency of the characters from a string
 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1
Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters
 */
/*
        String str = "aabcccd";
        String result = ""; //a2b1c3d1
        String each = "";
        String ch = "";
        for (int j = 0; j < str.length(); j++) {

            // char ch = str.charAt(j); // each character from string
            int count = 0;

            for (int i = 0; i < str.length(); i++) { //to find the frequency of each character

                //char each = str.charAt(i); // each character of str
                //if(ch == each){
                if (str.charAt(i) == str.charAt(j)) ;
                count++;
            }

            if (result.contains("" + str.charAt(j))) { // ====> to check if the character is already check
                continue;               // ""+ch ===> to convert charAt to string  because CONTAINS take string
            }

            result += str.charAt(j);
            result += count;
        }
        System.out.println(result);
        */

        String str = "aabcccd";
        String result = ""; //a2b1c3d1


        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // each character from string
            int count = 0;

            for (int i = 0; i < str.length(); i++) { //to find the frequency of each character

                char each = str.charAt(i); // each character of str
                if(ch == each){
                    count++;
                }
            }

            if(result.contains(""+ch)){ // will skip what ??????==>WILL SKIP 61-----65
                continue;
            }

            result += ch;
            result += count;
        }
        System.out.println(result);


















    }

}









































































































