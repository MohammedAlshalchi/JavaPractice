package day43_abstraction.animalTask;

public class AnimalObject {
    public static void main(String[] args) {
        Dog dog1 =new Dog("Mohammed","White",15) ;
        Cat cat1 = new Cat("Mariam","Gray",10);
        Parrot parrot1 = new Parrot("Reem","Yellow",5) ;
        Tiger tiger1 = new Tiger("Rayan","Light Brown",20) ;


        System.out.println(dog1);
        System.out.println(cat1);
        System.out.println(parrot1);
        System.out.println(tiger1);


        dog1.sleep();
        dog1.eat();



        cat1.eat();
        cat1.sleep();



        parrot1.eat();
        parrot1.sleep();


        tiger1.eat();
        tiger1.sleep();

    }
}
