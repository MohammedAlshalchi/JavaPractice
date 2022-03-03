package dy51_Map;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Dinner2 {
    /*
  2. Given the following arrays that contains the names of the students from each group:
         String[] group1 = {"Duygu","Magda","Farangez","Edison","Kerem","Farangis"};
        String[] group2 = {"Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat"};
        String[] group3 = {"Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina","Muharrem"};
        String[] group4= {"Maria","Kristina","Amin","George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin","Doughlas"};
        String[] group5 = {"Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene"};

    Create a map that contains group id and names of group members

            Map<Integer, String[]> groups = new LinkedHashMap();

        add all the group 1d and group members into the map named groups

    display the names of each student with group id of 1

    display the names of each student from each groups
     */


    public static void main(String[] args) {
String[] group1 = {"Duygu","Magda","Farangez","Edison","Kerem","Farangis"};
String[] group2 = {"Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat"};
String[] group3 = {"Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina","Muharrem"};
String[] group4= {"Maria","Kristina","Amin","George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin","Doughlas"};
String[] group5 = {"Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene"};

   // Create a map that contains group id and names of group members
        Map<Integer,String[]> Class = new LinkedHashMap<>();
        Class.put(1,group1);
        Class.put(2,group2);
        Class.put(3,group3);
        Class.put(4,group4);
        Class.put(5,group5);

    // display the names of each student with group id of 1
        for (String eachClass: Class.get(1)) {
            System.out.println(eachClass);

        }



// display the names of each student from each groups
        for (Map.Entry<Integer,String[]> allClass: Class.entrySet()) {
          int key = allClass.getKey();
           String names = Arrays.toString(allClass.getValue());
            System.out.println("The group is "+key+" and student names are: "+names);

        }
















    }






















}
