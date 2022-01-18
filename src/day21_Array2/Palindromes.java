package day21_Array2;

public class Palindromes {
    public static void main(String[] args) {
/*
write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */

String [] name = {"anna", "level", "Java"};

        int palindromes = 0;

        for (String each : name) {
            String reverse = "";
            for (int i = each.length()-1; i>=0 ;i--){
                reverse += each.charAt(i);

                if (each.equals(reverse)){
                    palindromes++;
                }
            }

        }
        System.out.println(palindromes);













    }
}
