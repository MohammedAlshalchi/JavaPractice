package day39_InheritanceEncapsulation.animalTask;

public class WildAnimal extends Animal{
    /*
    3. Create a sub class of Animal named WildAnimal:
				Variable:
						isWild, isFriendly, isPlayable
				Extra Methods:
					hunt()
     */
    private boolean isWild, isFriendly, isPlayable;

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    public boolean isPlayable() {
        return isPlayable;
    }

    public void setPlayable(boolean playable) {
        isPlayable = playable;
    }

    public WildAnimal(String name, String breed, String size, String color, char gender, int age, boolean isWild,
                      boolean isFriendly, boolean isPlayable) {
        super(name, breed, size, color, gender, age);
//        this.isWild = isWild;
//        this.isFriendly = isFriendly;
//        this.isPlayable = isPlayable;
        setWild(isWild);
        setFriendly(isFriendly);
        setPlayable(isPlayable);
    }


    public void hunt() {
        System.out.println(getName()+" is hunting");
    }

    @Override
    public String toString() {
        return "WildAnimal{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                "isWild=" + isWild +
                ", isFriendly=" + isFriendly +
                ", isPlayable=" + isPlayable +
                '}';
    }
}
