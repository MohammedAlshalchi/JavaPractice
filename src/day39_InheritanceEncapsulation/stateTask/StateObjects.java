package day39_InheritanceEncapsulation.stateTask;

public class StateObjects {
    /*
    3. Create a class named StateObjects
					Create the objects of each sub classes
					test all the functions of each objects
            		Analyze the relationships between the classes
     */
    public static void main(String[] args) {


        California california = new California("CA", "Democrats", "Glen Youngkin", "Tim kenn",
                57778899, 5.78);
        Virginia virginia = new Virginia("VA", "Democrats", "Gavin Newsom", "Daine Feinstein"
                , 765567889, 2);
        Florida florida = new Florida("FL", "Democrats", "Ron DeSantis", "Rick Scott",
                676432, 2);
        Texas texas = new Texas("TX", "Rebuplican", "Greig Rebots", "Ted Crez", 654778, 7);


        System.out.println(california);
        System.out.println(virginia);
        System.out.println(texas);
        System.out.println(florida);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

california.price();
virginia.lover();























    }










}
