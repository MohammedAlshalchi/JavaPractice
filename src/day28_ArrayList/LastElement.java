package day28_ArrayList;

import java.util.ArrayList;

public class LastElement {
    public static void main(String[] args) {
      /*
        1. write a program that can set the last element of the Integer arraylist to zero
	            ex:
	                list = [1,2,3,4,5];
	                output: [1,2,3,4,0];
       */
/*
        ArrayList <Integer> list = new ArrayList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
*/
/*
list.addAll(Arrays.asList(1,2,3,4,5));
        //System.out.println(list); ==> to check

list.remove(4);

        //System.out.println(list); ====> to check

list.add(list.size(),0 );

        System.out.println(list);


*/

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        list.set(list.size()-1, 0);
        System.out.println("list = " + list);





































    }
}
