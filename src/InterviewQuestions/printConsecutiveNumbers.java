package InterviewQuestions;

import java.util.Scanner;

public class printConsecutiveNumbers {
    public static void main(String[] args) {
  /* numbers from 1 to N
       if number divided by 2 ==>   Codility
       if number divided by 3 ==>   Test
       if number divided by 5   ==> Coders
       if number divided by 2,3 ==> CodilityTest
       if number divided by 2,5 ==> CodilityCoders
       if number divided by 5,3 ==> TestCoders
  */
        Scanner input = new Scanner(System.in);
        System.out.println("Eneter number");
        int num = input.nextInt();

        for (int i = 1; i <num ; i++) {
if ( i%6 ==0 ){//2,3
    System.out.println("CodilityTest");
}else if (i%10 ==0 ){//2,5
    System.out.println("CodilityCoders");
}else if ( i%15 ==0){//3,5
    System.out.println("TestCoders");
}else if (i%2 ==0){
    System.out.println("Codility");
}else if (i%3 ==0){
    System.out.println("Test");
}else if (i%5 ==0){
    System.out.println("Coders");
}else {
    System.out.println(i);
}


        }






    }
}
