package day20_Array;

public class Classmates {
    public static void main(String[] args) {
     String [] classmate = {"Cydeo School", "Wooden Spoon", "Java Programming",
             "SQL Programming", "Selenium Automation",
             "API Testing", "Database Testing", "Manual Testing"};
        for (int i = 0; i < classmate.length; i++) {
       String initial = classmate[i].charAt(0)+"."+classmate[i].charAt(classmate[i].indexOf(" ")+1);
            System.out.println(initial);
        }









































    }
}
