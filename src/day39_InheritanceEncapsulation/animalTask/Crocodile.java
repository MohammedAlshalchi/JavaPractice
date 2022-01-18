package day39_InheritanceEncapsulation.animalTask;

public class Crocodile extends WildAnimal{
    /*

	5. Create the following sub classes of WildAnimal and Override the hunt method, and add any extra methods that are needed:
				6. Crocodile
     */

    public Crocodile(String breed, String size, String color, char gender,
                     int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super("Crocodile", breed, size, color, gender, age, isWild, isFriendly, isPlayable);
    }


    @Override
    public void hunt() {
//        super.hunt();
        System.out.println(getName()+" is hunting  fish");
    }

    @Override
    public String toString() {
        return "Crocodile{}"+
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
