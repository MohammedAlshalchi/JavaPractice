package day39_InheritanceEncapsulation.deviceTask;

public class Computer extends Device{
    /*
    3. Create a subclass of Device named Computer:
				Add the extra methods if needed
     */

    public Computer(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

  public void reSet () {
      System.out.println(getBrand()+" "+getModel()+" is reset");
  }







}
