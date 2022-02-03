package day43_abstraction.animalTask;

public class Parrot extends Animal{

    public Parrot(String name,String color, int age) {
        super(name, color, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating parrot food");
    }
}
