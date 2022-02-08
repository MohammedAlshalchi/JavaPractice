package day44Abstract2.carTask;

public abstract class Car {
    /*
    1. Create an Abstract class named Car:
				Variables:
					make (final), model (final), year (final), price, color
				Encapsulate all the fields
				Add a constructor that can set all the fields
				Condition for setting the fields:
						1. make, model, color can not be null
						2. make, model, color can not be empty
						2. year can not be less than 1886
						2. price can not be negative
If invalid arguments are given for setting the instances, then manually throw an exception
				abstract methods:
					start();
					drive();
				none abstract methods:
					stop()
					toString()
     */

    private final String make,model;
    //private final String model;
    private final int year;
    private double price;
    private String color;


    public Car(String make, String model, int year, double price, String color) {


        if ( make.isEmpty() || make == null ){
            throw new RuntimeException("Invalid Make" );
        }
        this.make = make;

        if (model.isEmpty()  || make == null){
            throw new RuntimeException("Invalid Model");
        }
        this.model = model;

        if (year<1886  ){
            throw new RuntimeException("Invalid Year cannot be less than 1886");
        }
        this.year = year;
       // this.price = price;
        setPrice(price);
       setColor(color);
    }


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if ( price <0 ){
            throw new RuntimeException("Invalid price");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isEmpty()  || make == null){
            throw new RuntimeException("Invalid Color");
        }
        this.color = color;
    }

public abstract void start();
 public abstract void drive();



 public void stop(){
     System.out.println("getMake()+\" \"+getModel()+\" \"+\" is stoped\" = " + getMake() + " " +
             getModel() + " " + " is stoped");
 }

    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
