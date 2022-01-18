package day38_inheritance1.employee;

public class Employee {
    /*
    1. Create a class named Employee
			Variables:
				name, age, gender, id, jobTitle, salaryName, comapnyName
			Add a constructor to set all the fields
			Methods:
				work()
				toString()
     */
public String name,jobTitle, comapnyName;
public int age, id;
public char gender;
public double salaryName;


    public Employee(String name, String jobTitle, String comapnyName, int age, int id, char gender, double salaryName) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.comapnyName = comapnyName;
        this.age = age;
        this.id = id;
        this.gender = gender;
        this.salaryName = salaryName;
    }


    public void work() {
        System.out.println(name+" is working"+" "+jobTitle);
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", comapnyName='" + comapnyName + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", gender=" + gender +
                ", salaryName=" + salaryName +
                '}';
    }




}
