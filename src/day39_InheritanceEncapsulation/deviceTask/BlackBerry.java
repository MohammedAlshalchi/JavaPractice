package day39_InheritanceEncapsulation.deviceTask;

public class BlackBerry extends Phone{
    /*
   5. Create the following sub classes of Phone and add any extra methods that are needed:
				3. BlackBerry
     */


    public BlackBerry(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }
        public void ring(){
            System.out.println(getBrand()+" "+getModel()+" is ringing");
        }
}
