package day10;

public class GradeLevel {
    public static void main(String[] args) {

/*
Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */

byte number =50;
String gradeLvel = "";
if (number>=1 && number<=18){

    if (number>=1 && number<=5){
        gradeLvel="Elementary school";
    }else if (number>=6 && number<=8){
        gradeLvel="Middle school";
    }else if (number>=9 && number<=12){
        gradeLvel="College";
    }else {
        gradeLvel="Grad School";
    }



}else{
    gradeLvel="Invalied Grade Level";
}

        System.out.println(gradeLvel);

























    }









































}
