package day39_InheritanceEncapsulation.studentTask;

public class CydeoStudent extends Student{
    /*
  3. CydeoStudent:
						Extra Variables:
							batchNumber, groupNumber, programmingLanguage
						Encapsulate all the fields
						Add a constructor that can set all the fields
								Condition:
1. batchNumber and groupNumber should not be set to zero or negative
2. programmingLanguage should not be set to null
3. programmingLanguage should not empty
Override the eat, drink and sleep methods (programmingLanguage need to be included)
						Override the toString method:
name, age, gender, studentId, fieldOfStudy, grade, schoolName, batchNumber, groupNumber, programmingLanguage should be included

     */
private int batchNumber, groupNumber;
private String  programmingLanguage;

    public CydeoStudent(String name, int age, char gender, String fieldOfStudy, String schoolName, int studentId, char grade, int batchNumber, int groupNumber, String programmingLanguage) {

        super(name, age, gender, fieldOfStudy, schoolName, studentId, grade);
//        this.batchNumber = batchNumber;
//        this.groupNumber = groupNumber;
//        this.programmingLanguage = programmingLanguage;
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgrammingLanguage(programmingLanguage);
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber <= 0){
            System.err.println("Invalid entry");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if (groupNumber <= 0){
            System.err.println("Invalid entry");
            System.exit(1);
        }
        this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage == null || programmingLanguage.isEmpty()){
            System.err.println("Invalid entry");
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }


    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void drink() {
        super.drink();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

 public void programmingLanguage (){
     System.out.println(getName()+" "+" is studying "+getProgrammingLanguage());
 }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                "} " + super.toString();
    }
}
