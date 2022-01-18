package day38_inheritance1.animal;

public class Cat extends Animal{
    /*
    1. Cat
					eat(): eats cat food
     */

    public Cat(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(breed+" "+name+" eats cat food");
    }
}
