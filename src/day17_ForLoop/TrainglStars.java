package day17_ForLoop;

public class TrainglStars {
    public static void main(String[] args) {
        /*
        Use a nested loop to print the following shape
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *
  */

        for (int j = 1; j <= 10; j ++) {
            for (int i = 0; i < j; i++) {
                System.out.print("* ");
            }
            System.out.println(); // to print new line
        }



    }
}
