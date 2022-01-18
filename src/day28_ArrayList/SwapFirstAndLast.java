package day28_ArrayList;

import java.util.ArrayList;

public class SwapFirstAndLast {
    public static void main(String[] args) {
    /*
        2. write a program that can swap the first and last elements of an integer arraylist
	            ex:
	                list = [ 1,2,3,4,5 ];
	                output: [ 5,2,3,4,1 ];
 */

        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        list.set(list.indexOf(list.size()), list.get(0)); // replace last with first
        list.set(0,list.size()); // replace first with last

        System.out.println(list);













    }
}
