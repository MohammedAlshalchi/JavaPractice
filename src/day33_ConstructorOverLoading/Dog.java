package day33_ConstructorOverLoading;

public class Dog {
    /*
     Attributes:
	            	instance: breed, size, gender, age, color
	            	statics: i, numberOfEyes, numberOfWings, isFriendly
	            Add a constructor to initialized all the fields (instances)
	            Methods:
	            	eat()
	            	sleep()
	            	play()
	                toString()
     */

    public String name,breed, size,color;
public char gender;

public static int numberOfLegs = 4;
public static int numberOfWings = 0;
public static int numberOfEyes = 2;
public static boolean isFriendly = true;


    public Dog(String name, String breed, String size, String color, char gender) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.gender = gender;
    }


   public void  eat(){
       System.out.println(name+" is eating");
   }

    public void sleep (){
        System.out.println(name+" is sleeping");
    }
    public void play (){
        System.out.println(name+" is playing");
    }



























}
