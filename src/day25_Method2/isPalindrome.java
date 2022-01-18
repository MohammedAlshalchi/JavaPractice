package day25_Method2;

public class isPalindrome {
    /*
  By using the reverse method above to create another method named isPalindrome  that passes
  a String parameter, the method returns true if the string is palindrome, otherwise returns false
Ex:
					str = "Level"

					isPalindrome(str) ===> true
     */

    public static void main(String[] args) {

    boolean r    = isPalindrome("level");
        System.out.println(r);

    }


    public static boolean isPalindrome (String str ){
        String reversed = "";
boolean result = false ;

        for (int i = str.length()-1 ; i >= 0 ; i--) {
           reversed += str.charAt(i);
        }

        if (reversed.equalsIgnoreCase(str)){
            result = true;
        }

        return result;
    }

































}
