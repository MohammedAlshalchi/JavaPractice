package day39_InheritanceEncapsulation.deviceTask;

public class Phone extends Device{
    /*
   2. Create a subclass of Device named Phone:
				Extra Methods:
						call(long phoneNum), text(long phoneNum)
     */

    public Phone(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }
  public void call(long phoneNum) {
      System.out.println(getBrand()+" "+getModel()+" "+phoneNum+" is calling");
  }

    public void  text(long phoneNum) {
        System.out.println(getBrand()+" "+getModel()+" "+phoneNum+" is texting");
    }


    @Override
    public String toString() {
        return "Phone{ " +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price=" + getPrice() +
                ", hasBattery=" + isHasBattery() +
                ", hasPowerButton=" + isHasPowerButton() +
                '}';
    }
}
