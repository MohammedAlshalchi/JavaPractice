package day39_InheritanceEncapsulation.deviceTask;

public class Iphone extends Phone{
    /*
    5. Create the following sub classes of Phone and add any extra methods that are needed:
				1. Iphone
     */

    public Iphone(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void faceTime(long phoneNumber){
        System.out.println(getBrand() + " " + getModel() + " " + phoneNumber+" is call facetime");
    }

    @Override
    public String toString() {
        return "Iphone{} " +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price=" + getPrice() +
                ", hasBattery=" + isHasBattery() +
                ", hasPowerButton=" + isHasPowerButton() +
                '}' ;
    }
}
