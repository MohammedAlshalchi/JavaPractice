package day44Abstract2.carTask;

public class BMW extends Car{


    public BMW(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }


    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() + " is push bottom option");
    }

    @Override
    public void drive() {
        System.out.println("My father is driving " + getMake() + " " + getModel() );
    }
}
