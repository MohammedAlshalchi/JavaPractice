package day23_Method;

public class EliibleToVote {
    /*
   create a method that can check if a person is eligible to vote
			Ex:
				eligibleToVote(19, "USA");

			output:
				You are not eligible to vote!
 */

    public static void main(String[] args) {

       EliibleToVote(20 ,"USA");


    }
    public static void EliibleToVote (int age , String citizen){

      if ( age >= 19 && citizen.equals("USA")){
          System.out.println("Eligible to vote");
      }else {
          System.out.println("Not erligible to vote");
      }

    }










































}
