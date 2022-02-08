package day44Abstract2.carTask;

public class Audi extends Car implements AutoPark{


    public Audi(String model, int year, double price, String color) {
        super("Audi", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getModel() + " has auto park option");
    }

    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() + " starts easy");
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " is driving fast");
    }
}
