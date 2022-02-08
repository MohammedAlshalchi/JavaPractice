package day44Abstract2.deviceTask;

public class Samaung extends Phone implements AndroidApps,Downloadable{
    /*
    2. Samsung:
						extends Phone class and implements Downloadable & AndroidApps interfaces

     */

    public Samaung(String brand, String model, String size, double price, String color,
                   boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" is downloading apps");
    }


}
