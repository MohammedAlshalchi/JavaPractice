package day34_StaticBlock;

public class CydeoStudent {
    /*
    2. create a class named CydeoStudent
            Variables:
name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode
            Add a constructor to initialize all the fields
            Add a static block to initialize all the statics
            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()
     */

    public String name;
    public int age, batchNumber, groupNumber;
    public char gender;
    public String fieldOfStudy;

    public static String schoolName,  programmingLanguage, secretCode;

    public CydeoStudent (String name, int age, int batchNumber, int groupNumber, char gender) {
        this.name = name;
        this.age = age;
        this.fieldOfStudy = fieldOfStudy;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.gender = gender;
    }


    static {
        schoolName = "Cydeo";
        programmingLanguage = "Java";
        secretCode = "Wooden Spoon";
    }

    public static void  printSchoolName(){
        System.out.println("Shcool name is: "+schoolName);
    }

    public static void printSecretCode(){
        System.out.println("Secret code is: "+secretCode);
    }

    public  void attendClass(){
        System.out.println(name+"is attending the class");
    }

  public void  study(){
      System.out.println(name+" is studying "+programmingLanguage);
  }




















}
