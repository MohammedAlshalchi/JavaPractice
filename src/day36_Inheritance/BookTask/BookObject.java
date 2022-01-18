package day36_Inheritance.BookTask;

public class BookObject {

    public static void main(String[] args) {

 EBook eBook1 = new EBook();
 eBook1.setInfo("jjhg","jjk","Mohammed",100);
   eBook1.setInfo("Large",23);
      eBook1.readBook();
        System.out.println(eBook1);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");

AudioBook audioBook1 =new AudioBook();
audioBook1.setInfo("kkkjh","jsjsjhs","Dalya",1300);
audioBook1.setInfo(300,"Reem");
audioBook1.toString();
        System.out.println(audioBook1);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");





























    }
}
