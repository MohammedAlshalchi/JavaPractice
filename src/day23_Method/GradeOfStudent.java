package day23_Method;

public class GradeOfStudent {
    /*
    create a method that can calculate the grade of the student based on the score
     */
    public static void main(String[] args) {

        GradeReport(82);



    }

    public static void GradeReport (int score ){
        if  (score >= 90 &&   score <= 100){
            System.out.println("Score is A");
        }else if (score >=80){
            System.out.println("Score is B");
        }else if (score >= 70){
            System.out.println("Score is C");
        }else if (score >= 60){
            System.out.println("Score is D");
        }else {
            System.out.println(" Score is F");
        }


    }
















































}
