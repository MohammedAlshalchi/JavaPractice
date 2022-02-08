package day44Abstract2.deviceTask;

public class Laptop extends Computer{
    /*
    8. Create the following sub classes of Computer and add any extra methods that are needed:
				1. PersonalComputer:
				1. Desktop
				2. Laptop
     */

    public Laptop(String brand, String model, String size, double price, String color,
                  boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }


    @Override
    public void turnOn() {
        System.out.println("iT IS on");
    }

    @Override
    public void turnoff() {
        System.out.println("iT IS off");
    }
}
