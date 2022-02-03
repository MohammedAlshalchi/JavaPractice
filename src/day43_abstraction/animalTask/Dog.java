package day43_abstraction.animalTask;

public class Dog extends Animal{

    public Dog(String name,String color, int age) {
        super(name, color, age);
    }


    @Override
    public void eat() {
        System.out.println(getName()+" is eating dog food");
    }
}
