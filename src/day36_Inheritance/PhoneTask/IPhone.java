package day36_Inheritance.PhoneTask;

public class IPhone extends Phone{
    /*
    1.2 Create a sub class of Phone named IPhone:
				Variables:
					brand, model, size, price, color
				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()
     */


public void faceTime(long phoneNumber){
    System.out.println(brand+" "+model+" is calling FaceTime "+phoneNumber);
}


public void faceTime(String email){
    System.out.println(brand+" "+model+" is calling FaceTime "+email);
}


















}
