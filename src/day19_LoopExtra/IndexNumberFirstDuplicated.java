package day19_LoopExtra;
import java.util.Scanner;
public class IndexNumberFirstDuplicated {
    public static void main(String[] args) {
        /*
 2. Write a program that cna return the index number of the first duplicated character from a string
         */

/*
Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                System.out.println(i+" "+(i+1));
                break;
            }

        }
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your String");
        String str = input.nextLine();


        for (int i = 0; i < str.length(); i++) {
            int count =0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)){
                    count++;
                }


            }

            if (!(count == 1)){
                System.out.print(i);
                break;
            }
        }



input.close();

    }
}
