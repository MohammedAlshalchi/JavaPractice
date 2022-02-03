package day43_abstraction.animalTask;

public class Cat extends Animal{

    public Cat(String name,String color, int age) {
        super(name, color, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating cat food");
    }
}
