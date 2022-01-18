package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ScoresGrades {
    public static void main(String[] args) {
     /*
   8. Given the following arraylists:
		ArrayList<Integer>  scores = new ArrayList<>();
  		scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59

        Write a program that can count the total numbers of grade A, B, C, D and F
*/


        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

       //  ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
      //   ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        // ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
       //  ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
       //  ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countF = 0;

        for (Integer each : scores) {
            if (each>=90 && each<=100){
                countA++;
            }else if (each>80){
                countB++;
            }else if (each>70){
                countC++;
            }else if (each>60){
                countD++;
            }else{
                countF++;
            }

        }
        System.out.println("A is "+ countA);
        System.out.println("B is "+ countB);
        System.out.println("C is "+ countC);
        System.out.println("D is "+ countD);
        System.out.println("F is "+ countF);




















    }
}














































