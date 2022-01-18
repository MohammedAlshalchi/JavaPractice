package day36_Inheritance.PhoneTask;

public class Phone {
    /*
   1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color
				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
     */

    public String brand, model, size, color;
public double price;



    public void setInfo(String brand, String model, String size, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }


    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public void call(long phoneNumber){
        System.out.println(brand+" is calling"+phoneNumber);
    }
  public void text(long phoneNumber){
      System.out.println(brand+" is texting "+phoneNumber);
  }














}
