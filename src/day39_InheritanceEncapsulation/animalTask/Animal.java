package day39_InheritanceEncapsulation.animalTask;

public class Animal {
    /*
    1. Create a class named Animal:
			variables:
				name, breed, gender, age, size, color
			Encapsulate all the fields
			Add a constructor to set all the fields
					Conditions:
1. name, breed and color can not be null (if obj == null means it's error)
2. name, breed and color can not be empty or can not be blank
3. gender should only be set to either 'M' or 'F'
4. age can not be set to negative
			Methods:
				eat()
				drink()
				sleep()
				move()
				toString()
     */
    private String name,breed,size,color;
    private char gender;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ( name == null ){
            System.err.println("Invalid name");
        }
        if (name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name");
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if ( breed ==null){
            System.err.println("Invalid breed");
        }
        if (breed.isEmpty() || breed.isBlank()){
            System.err.println("Invalid breed");
        }
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if ( color ==null){
            System.err.println("Invalid color");
        }
        if (color.isEmpty() || color.isBlank()){
            System.err.println("Invalid color");
        }
        this.color = color;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (! (gender == 'M' || gender == 'F')){
            System.err.println("Invalid gender");
           // System.exit(1); ==> to exit the program
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if ( age <= 0 ){
            System.err.println("Invalid age");
        }
        this.age = age;
    }





    public Animal(String name, String breed, String size, String color, char gender, int age) {
//        this.name = name;
//        this.breed = breed;
//        this.size = size;
//        this.color = color;
//        this.gender = gender;
//        this.age = age;
        setName(name);
        setBreed(breed);
        setSize(size);
        setColor(color);
        setGender(gender);
        setAge(age);
    }


  public void eat() {
      System.out.println(name+" "+getBreed()+" is eating");
  }

    public void drink () {
        System.out.println(name+" "+getBreed()+" is drinking");
    }
    public void  sleep() {
        System.out.println(name+" "+getBreed()+" is sleeping");
    }

    public void  move () {
        System.out.println(name+" "+getBreed()+" is moving");
    }
    // what is the different between getBreed() AND breed ??????


    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
