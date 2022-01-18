package day33_ConstructorOverLoading;

public class Iphone {
   /*
 Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn
				Add a constructor that can set All the fields (instances)
				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
    */

    public String model, color, size;
    public double price;

    public static String brand = "Apple",  madeIn = "Chine",OperationSystem = "OS";


    public Iphone(String model, String color, String size, double price) {
        this.model = model;
        this.color = color;
        this.size = size;
        this.price = price;
    }


   public void faceTime(long phoneNumber){
       System.out.println(phoneNumber+" is calling FaceTime call");
   }

    public void  faceTime (String email){
        System.out.println(email+" is calling FaceTime call");
    }

    public void call (long phoneNumber){
        System.out.println(phoneNumber+" is calling regular call");
    }


    public void text(long phoneNumber){
        System.out.println(phoneNumber+" is texting");
    }


    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
