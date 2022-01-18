package day39_InheritanceEncapsulation.studentTask;

public class StudentObjects {
    /*
 4. Create a class named StudentObjects:
Create the objects of each sub classes
test all the functions of each objects
Analyze the relationships between the classes
     */
    public static void main(String[] args) {


   Student student = new Student("Mohammed",45,'M',"JAVA",
           "CYDEO",15,'A');


    UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Dalya",40,'F',
            "HTML","NOVA",5,'A') ;


        System.out.println(student);

        System.out.println(undergraduateStudent);

CydeoStudent cydeoStudent = new CydeoStudent("Mariam",20,'F',"C++",
        "CyberTek",1,'A',25,32,"JAVA");
        System.out.println(cydeoStudent);

cydeoStudent.programmingLanguage();
student.drink();
undergraduateStudent.eat();
































    }










}
