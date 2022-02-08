package day44Abstract2.carTask;

public class Mercedes extends Car implements AutoPark{

    public Mercedes(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() + " starts with a card!");
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " is driven by a tester");
    }

    @Override
    public void autoPark() {
        System.out.println(getModel() + " is in the parking lot");
    }
}
