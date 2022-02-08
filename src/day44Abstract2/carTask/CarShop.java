package day44Abstract2.carTask;

public class CarShop {
    /*
    11. Create a class named CarShop:
			Create an object from each concrete class
			Test all the functions of each objects
            Analyze the relationships between the classes

     */
    public static void main(String[] args) {

     Audi audi = new Audi("q7",2019,20000,"wHITE");
     audi.autoPark();

     Mercedes mercedes = new Mercedes("BEbz","300S",2020,200000,"Red");
     mercedes.drive();

     CydeoCar cydeoCar = new CydeoCar("Cydeo","B25",2022,12000,"PURPLE");
     cydeoCar.autoPark();
     cydeoCar.selfDrive();























    }
}
