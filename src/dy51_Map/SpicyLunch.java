package dy51_Map;


import java.util.LinkedHashMap;
import java.util.Map;

public class SpicyLunch {
    /*
    1. Given the following map that contains the employee name and thier salary:
     Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);


    1.1 who has the maximum salary?
    1.2 who has the minimum salary?
    1.3 how many employees has the salary between 120k ~ 150K?
    1.4 display the names of the employees who are making less than 118k?
    1.5 increase the salary of each employee by 10K

     */
    public static void main(String[] args) {


Map <String,Integer> map = new LinkedHashMap<>();

        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);


int maxSalary = 0;
int minSalary = Integer.MAX_VALUE;
int count =0;

        // 1.1 who has the maximum salary?
     for ( Map.Entry<String,Integer> each: map.entrySet()) {
         if (each.getValue()> maxSalary){
            maxSalary = each.getValue();
         }

        } System.out.println(maxSalary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


      //  1.2 who has the minimum salary?

        for (Map.Entry<String,Integer> each1: map.entrySet()) {

            if (each1.getValue() < minSalary){
                minSalary = each1.getValue();
            }
        }
        System.out.println(minSalary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");




       // 1.3 how many employees has the salary between 120k ~ 150K?

        for(Map.Entry<String,Integer> each2 : map.entrySet()) {

            if (each2.getValue() >= 120000 && each2.getValue() <= 150000){
                count ++;
            }
        }
        System.out.println(count);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


       // 1.4 display the names of the employees who are making less than 118k?
        for (Map.Entry<String,Integer> each3 : map.entrySet()) {

           if (each3.getValue() < 118000){
               System.out.println(each3.getKey());
           }
        }
// 1.5 increase the salary of each employee by 10K

        for (Map.Entry<String,Integer> each4 : map.entrySet()) {
            map.put(each4.getKey(), each4.getValue()+10000);

        }

        System.out.println(map);






























}













    }




































