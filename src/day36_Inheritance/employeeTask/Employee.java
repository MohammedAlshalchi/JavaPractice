package day36_Inheritance.employeeTask;

public class Employee {

   /*
Employee:
        name, gender, age, jobTitle, id, salary, companyName
        setInfo(), work(), toString()
    Tester
    Developer
    Driver
    Teacher
    */

public String name,jobTitle,companyName;
public int age,id;
public char gender;
public double salary;


    public void setInfo (String name, String jobTitle, String companyName, int age, int id, char gender, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.age = age;
        this.id = id;
        this.gender = gender;
        this.salary = salary;
    }

/*
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
*/
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }

public void work() {
    System.out.println(name+" is working");
}






}
