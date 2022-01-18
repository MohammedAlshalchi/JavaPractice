package day27_Method;

public class TotalNumber {
    public static void main(String[] args) {
  /*
      Write program that returns true if the total number of upper case characters are equal to total number of
      Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true
			*/

String str = "JAVA java";
int count1 = 0,
        count2 =0;


        for (int i = 0; i < str.length(); i++) {

          if (Character.isUpperCase(str.charAt(i))) {
              count1++;
          }
          else if ((Character.isLowerCase(str.charAt(i)))){
              count2++;
          }

           }

        if (count1 == count2){
            System.out.println("true");
        }else {
            System.out.println("false");
        }





























    }































































}
