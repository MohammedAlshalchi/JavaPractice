package day38_inheritance1.employee;

public class ProductOwner extends Employee{

    public ProductOwner(String name, String jobTitle, String comapnyName, int age, int id, char gender, double salaryName) {
        super(name, jobTitle, comapnyName, age, id, gender, salaryName);
    }


    @Override
    public void work() {
        System.out.println(jobTitle + " " + name + " is writing a user story");
    }
}
