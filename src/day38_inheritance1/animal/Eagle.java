package day38_inheritance1.animal;

public class Eagle extends Animal{
    /*
    4. Eagle
					eat(): eats snake
     */

    public Eagle(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(breed+" "+name+" eats snake");
    }
}
