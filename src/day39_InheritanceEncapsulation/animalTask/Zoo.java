package day39_InheritanceEncapsulation.animalTask;

public class Zoo {
    /*
    6. Create a class named Zoo:
			Create the objects of each sub classes and
			test all the functions of each objects
            Analyze the relationships between the classe
     */

    public static void main(String[] args) {

    Lion lion1 = new Lion("ABC","large","brown",'M',15,true,false,false);
    Dog dog1 = new Dog("Pug","Small","Black",'F',2,false,true,true);
    Dolphin dolphin2 = new Dolphin("vvv","KLG","gray",'M',50,true,true,true);
Tiger tiger1 =new Tiger("zzz","xSMALL","yellow",'M',25,true,false,false);

        System.out.println(lion1);
        System.out.println(dog1);
        System.out.println(dolphin2);
        System.out.println(tiger1);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println(dog1.isPlayable());
        System.out.println(dolphin2.getBreed());
        System.out.println(lion1.getAge());
        System.out.println(tiger1.getColor());

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

dog1.play();
dolphin2.swim();
lion1.hunt();
















    }







}
