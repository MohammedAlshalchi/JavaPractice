package day39_InheritanceEncapsulation.deviceTask;

public class Samsung extends Phone{
    /*
    5. Create the following sub classes of Phone and add any extra methods that are needed:
				2. Samsung
     */

    public Samsung(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }


    public void freeze(){
        System.out.println(getBrand() + " " + getModel() + " keeps freezing.");
    }































}
