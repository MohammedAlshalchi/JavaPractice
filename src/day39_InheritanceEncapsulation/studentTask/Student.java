package day39_InheritanceEncapsulation.studentTask;

public class Student extends Person{
    /*
    2. Create a subclass of Person named Student:
				Extra variables:
						studentId, fieldOfStudy, grade, schoolName
				Encapsulate all the fields
				Add a constructor that can set all the fields
							Condition:
1. filedOfStudy and schoolName should not be set to null
2. filedOfStudy and schoolName should not be empty
3. grade must be valid (A, B, C, D, F)
				Extra methods:
					study()
toString(): name, age, gender, studentId, fieldOfStudy, grade, schoolName should be included
     */
  private String  fieldOfStudy, schoolName ;
  private int studentId;
  private char grade;

    public Student(String name, int age, char gender, String fieldOfStudy, String schoolName,
                   int studentId, char grade) {
        super(name, age, gender);
//        this.fieldOfStudy = fieldOfStudy;
//        this.schoolName = schoolName;
//        this.studentId = studentId;
//        this.grade = grade;
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
       setGrade(grade);
       setSchoolName(schoolName);

    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if (fieldOfStudy == null || fieldOfStudy.isEmpty()){
            System.out.println("Invalid entry");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if (schoolName == null || schoolName.isEmpty()){
            System.out.println("Invalid entry");
            System.exit(1);
        }
        this.schoolName = schoolName;
    }

    public int getStudentId() {

        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (! (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F')){
            System.out.println("Invalid entry");
            System.exit(1);
        }
        this.grade = grade;
    }


    public void study() {
        System.out.println(getName()+" is studying");
    }

    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +'\'' +
                ", gender=" + getGender() +'\'' +
                "fieldOfStudy='" + fieldOfStudy + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", studentId=" + studentId +'\'' +
                "} " ;
    }
}
