package day38_inheritance1.employee;

public class Driver extends Employee{

    public Driver(String name, String jobTitle, String comapnyName, int age, int id, char gender, double salaryName) {
        super(name, jobTitle, comapnyName, age, id, gender, salaryName);
    }

    @Override
    public void work() {// if we change work WEHAVE TO remove @Override
        System.out.println(jobTitle + " " + name + " is driving a truck");

    }
}
