package day31_Constructor.Restaurant;

import java.util.Arrays;

public class LocalRestaurant {
    /*
   6.4. Create a class LocalRestaurant that has a main method with the following:
- Make a Restaurant object
- Create an array of servers with their information set. Add those initial servers to
the ArrayList of Servers in the Restaurant object
- Create an array of chefs with their information set. Add those initial chefs to
the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information
	              */

    public static void main(String[] args) {
     Server S1 = new Server("Mohammed",20,15,true);
     Server S2 = new Server("Ali",30,16,false);
     Server S3 = new Server("Ahmed",40,10,true);
     Server S4 = new Server("Rayan",90,30,false);

     Chef C1 = new Chef("Mariam",40,35,false);
     Chef C2 = new Chef("Reem",90,25,true);
     Chef C3 = new Chef("Dalya",100,19,false);
     Chef C4 = new Chef("Hanaa",200,55,true);

     Server [] servers = {S1,S2,S3,S4};
     Chef []   chefs = {C1,C2,C3,C4};

     System.out.println(Arrays.toString(servers));

     System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

     System.out.println(Arrays.toString(chefs));

     System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

Restaurant myresturant = new Restaurant("Saba","Fredrsiburg",5);
        System.out.println(myresturant);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


//myresturant.hireServer(S1);
//myresturant.hireChef(C1);
       // System.out.println(myresturant);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

myresturant.hireChef(chefs);
myresturant.hireServer(servers);

        System.out.println(myresturant);























    }




























}
