package InterviewQuestions;

public class InerviewQA {
    public static void main(String[] args) {

/* (MirrorEnds)
Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
In other words, zero or more characters at the very begining of the given string, and at the very end of the
string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".

                            mirrorEnds("abXYZba") → "ab"
                            mirrorEnds("abca") → "a"
                            mirrorEnds("aba") → "aba"
 */


        String name = "abcdefgeXYZegfedcba";// bug with this solution

        String result ="";


        String r1="";
        for (int i = 0; i < name.length(); i++) {
            r1+= name.substring(i,i+1);

            String r2="";
            for (int j = name.length()-1; j >=0 ; j--) {
                r2+=name.substring(j,j+1);

                if (r1.equals(r2)) {
                    result=r1;
                }

            }

        }

        System.out.println(result);

































































    }
}
