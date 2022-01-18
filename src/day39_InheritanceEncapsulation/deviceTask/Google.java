package day39_InheritanceEncapsulation.deviceTask;

public class Google extends Phone{
    /*
5. Create the following sub classes of Phone and add any extra methods that are needed:
				4. Google
     */

    public Google(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

   public void navigate(){
       System.out.println(getBrand()+" "+getModel()+" have a navigation system");
   }




}
