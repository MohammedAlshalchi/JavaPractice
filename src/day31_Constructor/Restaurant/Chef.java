package day31_Constructor.Restaurant;

public class Chef {
    /*
  6.2 Create a class called Chef
		   Attributes:
           name (String), employeeID (int), hourlyRate (double), fullTime (boolean)
		   Actions: (all void methods)

 setInfo(): sets all of the instance variables with some values taken from the parameters.
 makeOrder(): chef's name + "is making an order"
 washDishes(): chef's name + "is washing the dishes"
 toString(): Returns (String) all the information of a Chef
 -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"
*/

    public String       name;
    public int     employeeID;
    public double hourlyRate;
    public boolean  fullTime;

    public Chef(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name       = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime   = fullTime;
    }

    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                " " + fullTime +
                '}';
    }

   public void   makeOrder(){
       System.out.println(name + "is making an order");
   }

    public void washDishes()  {
        System.out.println(name + "is washing the dishes");
    }

    public void fullTime () {
        if (fullTime == true){
            System.out.println("full-time");
        }else {
            System.out.println("part-time");
        }
    }



}
