package day44Abstract2.deviceTask;

public class Desktop extends Computer{
    /*
	8. Create the following sub classes of Computer and add any extra methods that are needed:
				2. Desktop
     */

    public Desktop(String brand, String model, String size, double price, String color,
                   boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("It is ON");
    }

    @Override
    public void turnoff() {
        System.out.println("It is Off");
    }
}
