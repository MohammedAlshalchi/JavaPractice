package day39_InheritanceEncapsulation.animalTask;

public class Dolphin extends FriendlyAnimal{
    /*
    4. Create the following sub classes of FriendlyAnimal and Override the eat method
			3. Dolphin:
					Extra methods:
						swim()
     */

    public Dolphin(String breed, String size, String color, char gender, int age,
                   boolean isWild, boolean isFriendly, boolean isPlayable) {
        super("Dolphin", breed, size, color, gender, age, isWild, isFriendly, isPlayable);
    }


    @Override
    public void eat() {
//        super.eat();
        System.out.println(getName()+" is eating small fish");
    }

    public void swim() {
        System.out.println(getName()+" is swimming");
    }

    @Override
    public String toString() {
        return "Dolphin{}"+
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() ;
    }
}
