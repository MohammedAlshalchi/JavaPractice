package day33_ConstructorOverLoading;

public class CydeoStudent {
    /*

Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, programmingLanguage

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()

     */

    public String    name ;
    public int         age;
    public char     gender;
    public  int         ID;
    public char      grade;
    public int batchNumber;
    public int groupNumber;

public static String schoolName = "Cydeo";
public static String programmingLanguage = "Java";


    public CydeoStudent(String name, int age, char gender, int ID, char grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ID = ID;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public void  study (){
        System.out.println(name+" :is studying");
    }

    public void attendClass(){
        System.out.println(name+" :is attend the class");
    }

    public static void SchoolName(){
        System.out.println("The school name is:  "+schoolName);
    }

 public static void   ProgLanguage(){
     System.out.println("The language programming is:  "+programmingLanguage);
 }

    public String toString() {
        return "CydeoStudent{" +
                "Student name=' " + name + '\'' +
                ", age= " + age +
                ", gender= " + gender +
                ", Student ID= " + ID +
                ", grade=" + grade +
                ", batchNumber= " + batchNumber +
                ", groupNumber= " + groupNumber +
                '}';
    }
}
