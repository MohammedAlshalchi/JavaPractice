package day15;

public class SumOddNumbers {
    public static void main(String[] args) {
/*
        int num =0;

        for (int i = 1; i <=100 ; i++) {

            if (i%2 !=0){
                num+=i;
            }

        }

        System.out.println(num);
*/

        double sumOfOdd = 0;// other solution

        for (int i = 1; i < 101; i++) {
            if ( i % 2 == 1){
                sumOfOdd += i;
            }

        }
        System.out.println(sumOfOdd);

















































    }
}
