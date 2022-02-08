package day44Abstract2.deviceTask;

public class DeviceShop {
    /*
	9. Create a class named CarShop:
			Create an object from each concrete class

			Test all the functions of each objects

            Analyze the relationships between the classes
     */
    public static void main(String[] args) {


      Iphone iphone = new Iphone("7+","LARGE",100,"sILVER",true,false);
        System.out.println(iphone);
        iphone.call(571778225);
        iphone.text(5717789);
        iphone.downloadApp();
iphone.turnoff();
























    }
}
