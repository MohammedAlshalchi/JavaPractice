package day25_Method2;

public class reverse {
    /*
   3. create a method named reverse that passes one string parameter,
   the method can return the reversed string
Ex:
					str = "Java";

					reverse(str) ==> avaJ
   */
    public static void main(String[] args) {

    String r1 = reverse("Java");

        System.out.println(r1);
    }
    public static String reverse (String str ){
        String reverse = "";

        for (int i = str.length()-1 ; i >= 0 ; i--) {
            reverse += str.charAt(i);
        }


      return reverse;
    }

















































}

























































































