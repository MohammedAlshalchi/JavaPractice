package day44Abstract2.carTask;

public class Nio extends Car implements AutoPark,AutoPilot{

    public Nio(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }
}
