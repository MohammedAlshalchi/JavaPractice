package day39_InheritanceEncapsulation.deviceTask;

public class Nokia extends Phone{
    /*
	5. Create the following sub classes of Phone and add any extra methods that are needed:
				5. Nokia
     */

    public Nokia(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void selfDefense(){
        System.out.println(getBrand() +" " + getModel() + " is good for self defense.");
    }

}
