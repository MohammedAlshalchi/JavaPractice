package day39_InheritanceEncapsulation.deviceTask;

public class Laptop extends Computer{
    /*
  5. Create the following sub classes of Computer and add any extra methods that are needed:
				2. Laptop

     */

    public Laptop(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void carry(){
        System.out.println(getBrand() + " " + getModel() + " is convenient to be carried.");
    }



}
