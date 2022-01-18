package day19_LoopExtra;

public class CharacterHighestFrequency {
    public static void main(String[] args) {
        /*
        6.  Write a program that can find the character that has the highest frequency from a string
*/
String str = "aaaabccdd";
int hi = 0;
String Chi ="";


        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            int count =0;

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);

                if ( each == ch ){
                    count++;
                }



            }
            if ( count >  hi){
                hi = count;
                  Chi = ""+each;
                }
        }

        System.out.println("Character highest frequency: "+Chi);
        System.out.println("Number of frequency = "+hi);

































    }
}
