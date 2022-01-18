package day36_Inheritance.employeeTask;

public class EmployeeTeam {
    public static void main(String[] args) {
    Developer developer1 = new Developer();
    developer1.setInfo("Mohammed","Developer","Apple",45,100,'M',100000);
     developer1.work();
     developer1.developer();
        System.out.println(developer1);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
Tester tester1 = new Tester();

tester1.setInfo("Ahmed","Tester","Capital one",35,50,'f',125000);
tester1.work();
tester1.test();
        System.out.println(tester1);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Teacher teacher = new Teacher();
        teacher.setInfo("Reem","Teacher","PWCS",30,80,'f',85000);
        teacher.work();
        teacher.teach();
        System.out.println(teacher);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Driver driver = new Driver();
        driver.setInfo("Dalya","Driver","Bank of America",55,150,'f',105000);
        driver.work();
        driver.drive();
        System.out.println(driver);
























    }
}
