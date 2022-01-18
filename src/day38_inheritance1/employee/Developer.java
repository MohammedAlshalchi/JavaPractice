package day38_inheritance1.employee;

public class Developer extends Employee{


    public Developer(String name, String jobTitle, String comapnyName, int age, int id, char gender, double salaryName) {
        super(name, jobTitle, comapnyName, age, id, gender, salaryName);
    }

    @Override
    public void work() {
        System.out.println(jobTitle + " " + name + " is coding");
    }
}
