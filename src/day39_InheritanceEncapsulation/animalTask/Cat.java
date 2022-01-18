package day39_InheritanceEncapsulation.animalTask;

public class Cat extends FriendlyAnimal{
    /*

	4. Create the following sub classes of FriendlyAnimal and Override the eat method
			2. Cat:
					Extra methods:
						scratch()
						meow()
     */

    public Cat(String breed, String size, String color, char gender,
               int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super("Cat", breed, size, color, gender, age, isWild, isFriendly, isPlayable);
    }

public void scratch() {
    System.out.println(getName()+" is scratching");
}

public void meow() {
    System.out.println(getName()+" is meowing");
}

    @Override
    public void eat() {
//        super.eat();
        System.out.println(getName()+" is eating cat food");
    }

    @Override
    public String toString() {
        return "Cat{}"+
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
