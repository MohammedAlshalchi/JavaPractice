import java.util.Scanner;

public class jjj2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input num1");
        int num1 =input.nextInt();

        System.out.println("Input num2");
        int num2 = input.nextInt();


        int count = DIVIDE(num1,num2);
        System.out.println("The result of division is = 10 "+count);

    }


    public static int DIVIDE (int num1 , int num2){
int count =0;
int A =0;
if (num1 < num2){
//    A = num1;
//    num1 = num2;
//    num2 = A;
    //System.out.println("Invalid");
    System.out.println("num1 must be greater or equal num2");
    System.exit(1);
}


while (num1 >= num2){
    num1 = num1-num2;
    count++;
}
return count;
    }



}
