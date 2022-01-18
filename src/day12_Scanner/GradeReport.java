package day12_Scanner;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        /*
        2. GradeReport:
2.1 Ask the user to enter the his/her score
2.2 Print the grade of the student (A, B, C, D, F)
2.3 If user enter invalid score (negative or more than 100)
print invalid score
         */

        Scanner input =new Scanner(System.in);
String result ="";
        System.out.println("Enter your score");
        int score =input.nextInt();

        if (score>=1 && score<=100){
           if (score<=100 && score<=90){
               result="A";
           }if (score<=89 && score>=80){
               result="B";
            }if (score<=79 && score>= 70){
               result="C";
            }if (score<=69 && score>= 60){
               result="D";
           }if (score<=59){
               result="F";
            }






        }else {
            result="In valid";
        }


        System.out.println(result);

input.close();














    }















}
