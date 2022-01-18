package day39_InheritanceEncapsulation.deviceTask;

public class Desktop extends Computer{
    /*
 5. Create the following sub classes of Computer and add any extra methods that are needed:
				2. Desktop
     */

    public Desktop(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

  public void monitor (){
      System.out.println(getBrand()+" "+getModel()+" has monitor");
  }

    @Override
    public String toString() {
        return super.toString();
    }


//    @Override
//    public String toString() {
//        return "Desktop{} " + super.toString();
//    }


//    @Override
//    public String toString() {
//        return "Desktop{} " +
//                "brand='" + getModel() + '\'' +
//                ", model='" + getBrand() + '\'' +
//                ", price=" + getPrice() +
//                ", hasBattery=" + isHasBattery() +
//                ", hasPowerButton=" + isHasPowerButton() ;
//    }
}
