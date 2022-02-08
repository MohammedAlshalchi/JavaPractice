package day44Abstract2.deviceTask;

public class Phone extends Device{
    /*
    2. Create a child abstract class of Device named Phone:
				Extra Methods (none Abstract):
						call(long phoneNum)
						text(long phoneNum)
						toString()

     */

    public Phone(String brand, String model, String size, double price, String color,
                 boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

   public void call(long phoneNum){
       System.out.println(phoneNum+" is calling");
   }

    public void text(long phoneNum){
        System.out.println(phoneNum+" is texting");
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand()+" is turning on");
    }

    @Override
    public void turnoff() {
        System.out.println(getBrand()+" is turning off");
    }
}
