public class DivisibleByFiveThreeFifteen {
    public static void main(String[] args) {

      String  DivisibleBy15  =" ",
              DivisibleBy3   =" ",
              DivisibleBy5   ="";


        for (int i = 0; i < 100; i++) {

          if (  i%15 ==0) {
           DivisibleBy15 +=i+" ";

          }else if (i%5 ==0 ){
              DivisibleBy5 +=i+" ";

          }else if (i%3 ==0 ) {
              DivisibleBy3 +=i+" ";
          }


        }
        System.out.println("Divisible by 15 "+DivisibleBy15);
        System.out.println("Divisible by 5 "+DivisibleBy5);
        System.out.println("Divisible by 3 "+DivisibleBy3);























    }
}
