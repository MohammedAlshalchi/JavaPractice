package day39_InheritanceEncapsulation.animalTask;

public class Dog extends FriendlyAnimal{
    /*
    4. Create the following sub classes of FriendlyAnimal and Override the eat method
			1. Dog:
					Extra methods:
						bark()

     */

    public Dog(String breed, String size, String color, char gender,
               int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super("Dog", breed, size, color, gender, age, isWild, isFriendly, isPlayable);
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println(getName()+" is eating dog food");
    }

    public void bark() {
     System.out.println(getName()+" is barking");
 }

    @Override
    public String toString() {
        return "Dog{}"+
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                "isWild=" + isWild() +
                ", isFriendly=" + isFriendly() +
                ", isPlayable=" + isPlayable() +
                '}';
    }
}
