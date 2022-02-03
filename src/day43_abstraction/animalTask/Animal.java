package day43_abstraction.animalTask;

public abstract class Animal {
    /*
    abstract Animal
eat();
     */

  private String name,color;
  private int age;


    public Animal(String name, String color, int age) {
//        this.name = name;
//        this.color = color;
//        this.age = age;
        setName(name);
        setColor(color);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name.isEmpty() || name.isBlank()) {
            throw new RuntimeException("Name cannot be empty or blank");
        }
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        if (color.isEmpty() || color.isBlank()) {
            throw new RuntimeException("Color cannot be empty or blank");

        }
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 ){
            throw new RuntimeException("Invalid age");
        }
        this.age = age;
    }

    public abstract void eat ();

    public void sleep (){
        System.out.println(name+" is sleeping");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }





}
