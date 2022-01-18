package day33_ConstructorOverLoading;

public class CydeoStudentObject {
    public static void main(String[] args) {

    CydeoStudent Student1 = new CydeoStudent("Mohammed",45,'M',25,'A',25,32);
    CydeoStudent Student2 =new CydeoStudent("Ali",25,'M',20,'B',20,30);

        System.out.println(Student1);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(Student2);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
Student1.study();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
Student2.attendClass();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

Student1.SchoolName();
Student1.ProgLanguage();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println(CydeoStudent.programmingLanguage);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


















    }
}
