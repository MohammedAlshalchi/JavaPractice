package day39_InheritanceEncapsulation.animalTask;

public class Bear extends WildAnimal{
    /*
   5. Create the following sub classes of WildAnimal and Override the hunt method,
   and add any extra methods that are needed:
				4. Bear
     */

    public Bear(String name,String breed, String size, String color, char gender,
                int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, size, color, gender, age, isWild, isFriendly, isPlayable);
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println(getName()+" is eating honey");
    }

    @Override
    public void hunt() {
//        super.hunt();
        System.out.println(getName()+" is hunting birds");
    }

    @Override
    public String toString() {
        return "Bear{"+
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() + '\'' +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                "isWild=" + isWild() + '\'' +
                ", isFriendly=" + isFriendly() + '\'' +
                ", isPlayable=" + isPlayable() +'\'' +
                " , sound = "+getSound()+'\'' +
                '}';
    }
}
