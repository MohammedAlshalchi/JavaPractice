package day44Abstract2.carTask;

public class CydeoCar extends Car implements AutoPilot,AutoPark,Flyable{

    public CydeoCar(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }


    @Override
    public void selfDrive() {

    }

    @Override
    public void autoPark() {

    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }

    @Override
    public void fly() {

    }
}
