package day44Abstract2;

import day38_inheritance1.employee.Developer;
import day38_inheritance1.employee.Employee;
import day38_inheritance1.employee.Tester;

import java.util.ArrayList;
import java.util.List;

public class EmployeePolymorphism {
    public static void main(String[] args) {

        /*
        2. Given the following array that contains Employee objects:
			Employee[] employees = {
                new Tester("Sherali", 32, 'M',1, "QA", 110000),
                new Developer("Zuhal", 27, 'F', 2, "Java Developer", 128000),
                new Tester("George", 28,'M', 3, "SDET", 120000),
                new Developer("Cristina", 23, 'F',4, "Software Developer", 135000),
                new Tester("Cihad", 30, 'M',5, "SDET", 105000),
                new Developer("Gulistan",  26, 'F',6, "Web Developer", 130000),
                new Tester("Yuliya",  28, 'F',7, "QE", 120000),
                new Developer("Cassendra",  29, 'F',8, "Front-end Developer", 140000),
                new Tester("Aygu",  25, 'F',9, "SDET", 130000),
                new Developer("Sophie",  26, 'F',10, "Back-end Developer", 150000),
                new Tester("Timur",  29, 'M',11, "SDET", 115000),
                new Developer("Fady",  26, 'F',12, "Full Stack Developer", 142000),
                new Tester("Iryna",  24, 'F',13, "QE", 125000),
                new Developer("Enes",  26, 'M',14, "Full Stack Developer", 142000),
                new Tester("Mikael",  30, 'M',15, "SDET", 105000),};
(import them from day43 package)
	   	2.1 store all the developers & testers into the following List of employees
        		List<Employee> scrumMembers = new ArrayList<>();
        2.2 store all the testers into the following List of testers:
        		List<Tester> testers = new ArrayList<>();
        2.3 store all the developers into the following List of developers:
        		List<Developer> developers = new ArrayList<>();
        2.4 which tester has the maximum salary?

        2.5 which developer has the maximum salary?
 */
        Employee [] employees = {
            new Tester("Sherali","QA","cydeo",32,1,'M',110000),
            new Developer("Zuhal","SDET","Cybertek",45,2,'F',200000),
            new Tester("George","qa","BWA",28,15,'M',15000),
            new Developer("Cristina","Software Developer","MMKK",23,4,'F',135000),
            new Tester("Cihad","SDET","jjuu",30,5,'M',10500),
            new Developer("Gulistan","Web Developer","QQWW",26,6,'F',130000),
            new Tester("Yuliya","QE","nnWW",28,7,'f',45000),
            new Developer("Cassendra","Front-end Developer","lloo",29,8,'F',14000),
            new Tester("Aygu","SDET","WWEE",25,9,'F',130000),
            new Developer("Sophie","Back-end Developer","PPWW",26,10,'F',150000),
            new Tester("Timur","SDET","FFRR",29,11,'M',115000),
            new Developer("Fady","Full Stack Developer","YYIUIU",26,12,'F',142000),
            new Tester("Iryna", "QE","hhhgg",24,13,'F',125000),
            new Developer("Enes","Full Stack Developer","jjjnn",26,14,'M',142000),
            new Tester("Mikael", "SDET","wwqq",30,15,'M',105000)
        };



        List<Employee> scrumMembers = new ArrayList<>();

        for (Employee employee: employees ) {
            if (employee instanceof Tester || employee instanceof Developer){
                scrumMembers.add(employee);
            }


        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");



        List<Tester> testers = new ArrayList<>();
        List<Developer> developers = new ArrayList<>();

        for (Employee scrumMember : scrumMembers)  {

         if (scrumMember instanceof Tester ) {
             testers.add ((Tester) scrumMember);
         }
         if (scrumMember instanceof Developer){
             developers.add ( (Developer)scrumMember);
         }


        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");




        Tester  testerWithMaxSalary = testers.get(0);
        Developer developerWithMaxSalary = developers.get(0);

        for (Employee eachEmployee : employees  ) {

            if (eachEmployee instanceof Tester){
                if (eachEmployee.salaryName > testerWithMaxSalary.salaryName){
                   // testerWithMaxSalary = eachEmployee.salaryName;
                }
            }
        }

    }









}
