package dy51_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class BeforeLunch {
    /*
     create a map that can contain names of countries and their capitals
                use for each loop to print out all the capitals
     */

    public static void main(String[] args) {

        Map<String,String> countriesAndCapitals = new LinkedHashMap<>();// to keep the order
        countriesAndCapitals.put("Iraq","Baghdad");
        countriesAndCapitals.put("UAE","AbuDabi");
        countriesAndCapitals.put("USA","DC");
        countriesAndCapitals.put("Turky","Istambul");
        countriesAndCapitals.put("Jordan","Amman");
String capitals ="";
        for (String capital : countriesAndCapitals.values()) {
            capitals += capital+" ";
        }
 System.out.println("The capitals are: " + capitals);



  // other way
//        for (Map.Entry<String,String> capital: countriesAndCapitals.entrySet()) {
//
//            System.out.println(capital.getValue());
//        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

Map<String,Integer> studentsAndScore = new HashMap<>();
        studentsAndScore.put("Tunc",90) ;
        studentsAndScore.put("Temarlan",99);
        studentsAndScore.put("Kati",89);
        studentsAndScore.put("Olsia",95);
        studentsAndScore.put("Mohammed",70);

        for (Map.Entry<String,Integer> grade : studentsAndScore.entrySet()) {

            if (grade.getValue() < 80){
                System.out.println("Name of student get less than 80 " + grade.getKey());


            }
        }


















    }









}
