package day39_InheritanceEncapsulation.deviceTask;

public class Device {
    /*
 Create a class named Device:
			Variables:
brand, model, price, hasBattery, hasPowerButton
			Encapsulate all the fields
			Add a constructor to set all the fields
						Condition:
1. brand, model can not be null (if obj == null means it's error)
2. brand, model can not be empty or can not be blank
3. price can not be set to negative or zero
			Methods:
				turnOn(), turnOff(), toString()
     */

   private String brand, model;
   private double price;
   private boolean  hasBattery, hasPowerButton;

    public Device(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
//        this.brand = brand;
////        this.model = model;
////        this.price = price;
////        this.hasBattery = hasBattery;
////        this.hasPowerButton = hasPowerButton;
        setBrand(brand);
        setModel(model);
        setPrice(price);
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null ) {
            System.err.println("Invalid brand");

        } if (brand.isEmpty()){
                System.err.println("Invalid brand");
            }

        if (brand.isBlank()){
            System.err.println("Invalid brand");
        }

        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null ) {
            System.err.println("Invalid model");

        } if (model.isEmpty()){
            System.err.println("Invalid model");

        }
        if (model.isBlank()){
            System.err.println("Invalid model");

        }
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0){
            System.err.println("Invalid price");
        }
        this.price = price;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public void turnOn() {
        System.out.println(brand+" "+model+" Can be turn on");
    }
   public void turnOff() {
       System.out.println(brand+" "+model+" Can be turn off");
   }

    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
