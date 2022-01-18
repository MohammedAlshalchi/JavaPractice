package day27_Method;

public class RevtrieveTheLetter {
    public static void main(String[] args) {

/*
 Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";
 */


    String str =  "Wooden Spoon!";
    String letters="";
    String Digits = "";
    String specialChars ="";

        for (int i = 0; i < str.length() ;i++) {

            char [] array = str.toCharArray();

            if (Character.isLetter(array[i])){
                letters += array[i];
            }else if (Character.isDigit(array[i])){
                Digits += array [i];
            }else {
                specialChars += array[i];
            }


        }
        System.out.println(" letters is: "+ "\""+letters+"\""+";");
        System.out.println("Digits is: "+"\""+Digits+"\""+";");
        System.out.println("specialChars is: "+"\""+specialChars+"\""+";");







































    }

















































































}
