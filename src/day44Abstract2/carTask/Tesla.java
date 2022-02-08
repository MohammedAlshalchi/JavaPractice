package day44Abstract2.carTask;

public class Tesla extends Car implements AutoPark,AutoPilot{

    public Tesla(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " has its own parking lot!");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " " + getModel() + " has a full self-driving !");
    }

    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() + " starts with a face ID!");
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " can drive per se!");
    }
}
