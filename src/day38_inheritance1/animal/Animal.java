package day38_inheritance1.animal;

public class Animal {
    /*
   1. Create a class named Animal:
			Variables:
				name, breed, age, gender, size, color
			Add a constructor to set all the fields
			methods:
				eat()
				toString()
     */

    public String name, breed, size, color;
    public char  gender;
    public int  age;


    public Animal(String name, String breed, String size, String color, char gender, int age) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.gender = gender;
        this.age = age;
    }

    public void eat() {
        System.out.println(breed+" is eating");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }



}
