package day34_StaticBlock;

public class Iphone {
    /*
    1. Create a class named Iphone
            variables:
                brand, model, size, color, price, OS, isSmartPhone, madeIn, designedIn
            Add a constructor to initialized all the fields
            Add a static block to initialize all the statics
            Methods:
                printOperatingSystem(): displays the operating system of the iphone
                call(long phoneNumber)
                text(long phoneNumber)
                faceTime(long phoneNumber)
                faceTime(String email)
                toString()
     */
public String brand, model, size, color;
public double price;

public static String OS, madeIn, designedIn;
public static boolean isSmartPhone;


static {
    OS = "iso";
    madeIn ="Chine";
    designedIn = "USA";
}

    public Iphone(String brand, String model, String size, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }


    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

   public static void  printOperatingSystem(){
       System.out.println(OS+" is the operating system");
   }

  public static void  call(long phoneNumber){
      System.out.println(phoneNumber+" is calling");
  }

    public static void text(long phoneNumber){
        System.out.println(phoneNumber+"is texting");
    }

  public static void faceTime(long phoneNumber){
      System.out.println(phoneNumber+" is calling through facetime");
  }

  public static void faceTime(String email){
      System.out.println(email+" is calling");
  }












































}
