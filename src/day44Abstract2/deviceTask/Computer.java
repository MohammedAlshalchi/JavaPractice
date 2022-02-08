package day44Abstract2.deviceTask;

public class Computer extends Device{
    /*
   3. Create a child abstract class of Device named Computer:

					Add any extra methods if needed
     */

    public Computer(String brand, String model, String size, double price, String color,
                    boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnoff() {

    }
}
