package day11_SwitchAndIf;

public class AgeGroup {
    public static void main(String[] args) {
/*
 6. write a program that can define the age groups of a person
                 age groups are:
                        infant ( 1 - 2 year)
                        Toddler (3 - 5),
                        Kid (6 - 9),
                        Pre-Teen (10 - 12),
                        Teenager (13 - 17),
                        Young Adult (18 - 20),
                        Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),
                        Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),
                        Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)

                NOTE: MUST USE switch statement

 */

String ageGroup="Pre-Teen";
String result ="";

switch (ageGroup){
    case("infant"):
        result="1 - 2 year";
        break;
    case ("Toddler"):
        result="3 - 5";
        break;
    case ("Kid"):
        result="6 - 9";
        break;
    case ("Pre-Teen"):
        result="10 - 12";
        break;
    case ("Teenager"):
        result="13 - 17";
        break;
    case ("Young Adult"):
        result="18 - 20";
        break;
    case ("Adult"):
        result="21 - 39";
        break;
    case ("Young Middle-Aged Adult"):
        result="40 - 49";
        break;
    case ("Middle-Aged Adult"):
        result="50 - 54";
        break;
    case ("Very Young Senior Citizen"):
        result="55 - 64";
        break;
    case ("Young Senior Citizen"):
        result="65 - 74";
        break;
    case ("Senior Citizen"):
        result="75 - 84";
        break;
    case ("Old Senior Citizen"):
        result="85+";break;
    default:result="In valid";
}

        System.out.println(result);


























    }


}
