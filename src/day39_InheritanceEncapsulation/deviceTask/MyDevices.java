package day39_InheritanceEncapsulation.deviceTask;

public class MyDevices {
    /*
	6. Create a class named MyDevices:
			Create the objects of each sub classes and
			test all the functions of each objects
            Analyze the relationships between the classes
     */
    public static void main(String[] args) {

 Iphone iphone1 = new Iphone("Apple","pro 13 max",1200,true,true);
BlackBerry blackBerry1 = new BlackBerry("New","W100",800,true,true);
Google google1 = new Google("Pixal","Logo",1000,true,true);
Samsung samsung1 =new Samsung("Galaxy","S20",500,true,true);
Desktop desktop1 = new Desktop("hp","Windows",900,true,true);
TV tv1 = new TV("Samsung", "X80J", 700, true, true);
Laptop laptop1 = new Laptop("Dell", "Alienware", 1500, true, true);
Nokia nokia1 = new Nokia("Nokia", "N96", 600, true, true);
PersonalComputer pc1 = new PersonalComputer("HP", "ENVY", 1200, true, true);

        System.out.println(samsung1);
        System.out.println(desktop1);
        System.out.println(tv1);
        System.out.println(iphone1);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


iphone1.faceTime(571778225);
google1.call(455631556);
laptop1.carry();
desktop1.monitor();


        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(desktop1);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(desktop1);













    }
}
