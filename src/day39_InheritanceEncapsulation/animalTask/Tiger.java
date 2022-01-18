package day39_InheritanceEncapsulation.animalTask;

public class Tiger extends WildAnimal{
    /*
    5. Create the following sub classes of WildAnimal and Override the hunt method, and add any extra methods that are needed:
				2. Tiger
     */

    public Tiger(String breed, String size, String color, char gender,
                 int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super("Tiger", breed, size, color, gender, age, isWild, isFriendly, isPlayable);
    }

    @Override
    public void hunt() {
//        super.hunt();
        System.out.println(getName()+"is hunting rabbet");
    }

    @Override
    public String toString() {
        return "Tiger{}"+
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
