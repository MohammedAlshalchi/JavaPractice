package day38_inheritance1.employee;

public class BusinessAnalyst extends Employee{

    public BusinessAnalyst(String name, String jobTitle, String comapnyName, int age, int id, char gender, double salaryName) {
        super(name, jobTitle, comapnyName, age, id, gender, salaryName);
    }
    public void documenting (){
        System.out.println(jobTitle + " " + name + " is documenting paperwork");
    }
}
