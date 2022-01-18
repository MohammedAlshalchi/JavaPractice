package day36_Inheritance.ScrumTeamTask;

public class Person {
    /*
    1. Create a class named Person
			variables:
				name, age, gender
			methods:
				setInfo(): sets the name, age, gender of person
				 eat(String eat)
				drink(String drink)
				toString()
     */

  public String name;
  public int age;
  public char gender;

    public void setInfo (String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

   public void eat () {
       System.out.println(name+" is eating");
   }

   public void drink(String drink){
       System.out.println(name+" is drinking");
   }
















}
