package day44Abstract2.deviceTask;

public class Iphone extends Phone implements Downloadable,AppleApps{
    /*
    7. Create the following sub classes of Phone and add any extra methods that are needed:
				1. Iphone :
						extends Phone class and implements Downloadable & AppleApps interfaces
     */

    public Iphone(String model, String size, double price, String color,
                  boolean hasBattery, boolean hasPowerButton) {
        super("IPhone", model, size, price, color, hasBattery, hasPowerButton);
    }


    @Override
    public void downloadApp() {

    }


}
