package day31_Constructor;

public class CarpetTask {

  /*
    5.1 create a custom class for the Carpet class that should contain the following:
                instance variables:
                        width, length, unitPrice, isPersian (boolean)

                instance methods:
customOrder(): sets the carpet' width, length, unitprice, & isParsian
calcCost(): should be able to caculate the total cost of the carpet and return it as double
toString(): should be able to display all the info of the carpet including the total cost of the carpet as
calculated by calcCost()

            total price of carpet = (width*length)*unitprice

            if the carpet is persian  carpet, add 200$ to the totalPrice


   */

public double  width , length , unitPrice; // instances variable
public boolean isPersian;
          // constructor
    public CarpetTask(double width, double length, double unitPrice, boolean isPersian){ // local variable
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public String toString() {
        return "CarpetTask{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalPrice= $" + calcCost() +
                '}';
    }

    public double calcCost() {
        double totalPrice= (width * length *unitPrice);
       if (isPersian){
           totalPrice += 200;
       }
       return totalPrice;
    }












}
