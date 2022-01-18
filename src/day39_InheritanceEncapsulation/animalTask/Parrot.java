package day39_InheritanceEncapsulation.animalTask;

public class Parrot extends FriendlyAnimal{
    /*
    4. Create the following sub classes of FriendlyAnimal and Override the eat method
			4. Parrot:
					Extra methods:
						fly()
						sing()
     */

    public Parrot(String breed, String size, String color, char gender,
                  int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super("Parrot", breed, size, color, gender, age, isWild, isFriendly, isPlayable);
    }

    public void fly() {
        System.out.println(getName()+" is flying");
    }


    public void sing() {
        System.out.println(getName()+" is singing");
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println(getName()+" is eating seeds");
    }

    @Override
    public String toString() {
        return "Parrot{}"+
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                "isWild=" + isWild() +             // why can not use grtIswiled ?????
                ", isFriendly=" + isFriendly() +
                ", isPlayable=" + isPlayable() +
                '}';
    }
}
