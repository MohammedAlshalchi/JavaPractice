package day39_InheritanceEncapsulation.studentTask;

public class UndergraduateStudent extends Student{
    /*
  2. UndergraduateStudent
Override the study method
add any additional fields and methods if necessary
     */

    public UndergraduateStudent(String name, int age, char gender, String fieldOfStudy,
                                String schoolName, int studentId, char grade) {
        super(name, age, gender, fieldOfStudy, schoolName, studentId, grade);
    }
//
//    @Override
//    public void study() {
//        super.study();
//    }

    @Override
    public String toString() {
        return "UndergraduateStudent{} " + super.toString();
    }
}
