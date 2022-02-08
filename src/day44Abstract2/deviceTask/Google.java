package day44Abstract2.deviceTask;

public class Google extends Phone implements Downloadable,AndroidApps{

    /*
    4. Google:
						extends Phone class and implements Downloadable & AndroidApps interfaces
     */

    public Google(String brand, String model, String size, double price, String color,
                  boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApp() {
        System.out.println("I want to finish");
    }
}
