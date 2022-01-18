package day39_InheritanceEncapsulation.animalTask;

public class Eagle extends WildAnimal {
    /*
    5. Create the following sub classes of WildAnimal and Override the hunt method, and add any extra methods that are needed:
				3. Eagle
     */

    public Eagle(String breed, String size, String color, char gender,
                 int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super("Eagle", breed, size, color, gender, age, isWild, isFriendly, isPlayable);
    }

    @Override
    public void hunt() {
//        super.hunt();
        System.out.println(getName()+" is hunting snake");
    }

    @Override
    public String toString() {
        return "Eagle{}"+
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


