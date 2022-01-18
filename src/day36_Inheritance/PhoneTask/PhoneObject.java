package day36_Inheritance.PhoneTask;

public class PhoneObject {
    /*
  1.5 Create a class named Phone Objects and test of the sub class' objects
     */
    public static void main(String[] args) {
        IPhone iPhone1 = new IPhone();

        iPhone1.setInfo("Iphone13+","ProMax","Small","Black",800.95);
iPhone1.call(1234567890);
iPhone1.text(1234567892);
iPhone1.faceTime("usergcv");
iPhone1.faceTime(1233765409);
        System.out.println(iPhone1);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

Samsung samsung1 = new Samsung();
samsung1.setInfo("Galaxy", "X300", "Large", "Gray", 999);
samsung1.call(234345661);
samsung1.text(546783289);
samsung1.freeze();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


Nokia nokia1 =new Nokia();
nokia1.call(654747847);
nokia1.text(849374879);
nokia1.selfDefense();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

















    }




}
