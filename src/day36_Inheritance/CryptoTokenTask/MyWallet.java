package day36_Inheritance.CryptoTokenTask;

public class MyWallet {
    /*
	3. create a class named MyWallet
		create one object of each CryptoToken
		calculate the total Asset
     */
    public static void main(String[] args) {

   Bitcoin bitcoin1 = new Bitcoin();
   bitcoin1.setInfo(20,25,50,2,100,true);
     bitcoin1.cheap();
     bitcoin1.totalPrice();
        System.out.println(bitcoin1);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");




























    }






}
