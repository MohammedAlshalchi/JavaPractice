package day38_inheritance1.animal;

public class Tiger extends Animal{
    /*
  3. Tiger
					eat(): eats deer
     */


    public Tiger(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(breed+" is eating deer");
    }








}
