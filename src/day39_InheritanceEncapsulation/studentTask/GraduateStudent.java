package day39_InheritanceEncapsulation.studentTask;

public class GraduateStudent extends Student{
    /*
    1. GraduateStudent:
Override the study method
add any additional fields and methods if necessary
     */

    public GraduateStudent(String name, int age, char gender, String fieldOfStudy, String schoolName,
                           int studentId, char grade) {
        super(name, age, gender, fieldOfStudy, schoolName, studentId, grade);
    }

    @Override
    public void study() {
//        super.study();
        System.out.println(getName()+" is studying"+getFieldOfStudy());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
