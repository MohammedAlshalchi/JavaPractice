package day43_abstraction.animalTask;

public class Tiger extends Animal{
    public Tiger(String name, String color, int age) {
        super(name, color, age);
    }



    @Override
    public void eat() {
        System.out.println(getName()+" is eating beef");
    }
}
