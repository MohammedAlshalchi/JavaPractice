package day23_Method;

public class Calculator {
    /*
  create a method named calculator that passes three arguments (num1, num2, mathOperator),
  prints the calculation result
     */
    public static void main(String[] args) {

Calculator(3, 5, '-');

    }

    public static void Calculator (int num1 , int num2 , char operator){
int result=0;
        if (operator == '*'){
             result = num1*num2;
        }
        else if (operator == '+'){
            result = num1 +num2;
        }
        else if( operator == '-'){

          result = num1 - num2;
        }

        else if (num1 > num2 && operator== '/'){
            result = num1 /num2 ;
        }


        System.out.println("result = " + result);

    }









}
