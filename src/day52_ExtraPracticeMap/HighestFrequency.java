package day52_ExtraPracticeMap;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class HighestFrequency {
    /*
    write a program that can find the character that has the highest
frequency in a String
Note: Must use a map
Ex:
str = "eeeeeaaabbbbccccdd"
Output:
{e=5, a=3, b=4, c=4, d=2 }
character e has the highest frequency
     */

    public static void main(String[] args) {


  String str = "eeeeeaaabbbbccccdd";

   String [] array = str.split("");

       // System.out.println(Arrays.toString(array));   check

        Map<String,Integer> characterAndFrequency = new LinkedHashMap<>();

        for (String each: array) {
         int frequency = Collections.frequency(Arrays.asList(array),each);
            characterAndFrequency.put(each,frequency);
        }
        System.out.println(characterAndFrequency);

int highestFrequencyOfCharacter = 0;
       // int HighestFrequency=Integer.MIN_VALUE;
String characterHighestFrequency= "";
        for (Map.Entry<String,Integer> pair : characterAndFrequency.entrySet()) {
          if (pair.getValue() > highestFrequencyOfCharacter) {
              highestFrequencyOfCharacter = pair.getValue();
              characterHighestFrequency = pair.getKey();
          }

        }
        System.out.println(characterAndFrequency);
        System.out.println("Character with highest frequency is: "+characterHighestFrequency+
                " and the number of frequency is: "+highestFrequencyOfCharacter);























    }






















}
