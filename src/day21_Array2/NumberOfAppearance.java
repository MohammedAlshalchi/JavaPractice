package day21_Array2;

import java.util.Arrays;

public class NumberOfAppearance {
    public static void main(String[] args) {

/*
6.Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in replit, but this time you MUST use arrays and for each loop)

 */

String str  = "Java is good java is good Python is good python is good";

String [] str1 = str.split(" ");
       // System.out.println(Arrays.toString(str1)); ===> for check

 int java = 0,
         python = 0;

        for (String each : str1) {
          if (each.equalsIgnoreCase("java")){
              java++;
          } else if (each.equalsIgnoreCase("python")){
              python++;
          }

        }
        System.out.println("Numbers of times JAVA appears: "+java);
        System.out.println("Numbers of times PYTHON appears: "+python);





































    }
}
