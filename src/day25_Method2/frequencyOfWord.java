package day25_Method2;

public class frequencyOfWord {
    /*
    create a method named frequencyOfWord that passes two parameters: string sentence and String word, then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3


     */
    public static void main(String[] args) {

int r  = frequencyOfWord("Java java java python python", "Java");
        System.out.println("Frequency of word : " + r);

    }

    public static int frequencyOfWord (String str , String word){

        int count = 0;

        for (int i = 0; i <= str.length() - word.length(); i++) {

            if ( str.substring(i,i+word.length()).equalsIgnoreCase(word)){
                count++;
            }

        }
        return count;
    }












}
