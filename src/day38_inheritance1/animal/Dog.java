package day38_inheritance1.animal;

public class Dog extends Animal{
    /*
    2. Dog
					eat(): eats dog food
     */

    public Dog(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(breed+" eats dog food");
    }
}
