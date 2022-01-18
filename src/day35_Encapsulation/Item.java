package day35_Encapsulation;

public class Item {
    /*
   Item Task
		4.1create a class called Item
	            private variables:
	            	name, unitPrice, quantity
            	Encapsulate all the fields:
            		Conditions:
            			name can not be empty or blank
            			name can not contain any special characters other than space
            			name must start with letters
            			unit price can not be negative
            			quantity can not be negative
 if the Item name is toilet paper (case insensitive) then the quantity can not be more than 1
            Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)
            instance methods:
                calcCost(): returns the total cost
 toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
     */
private String name;
private double  unitPrice;
private int quantity;


    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }
    public String getName() {

        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            return;
        }
        for (int i = 0; i < name.length(); i++) {

            if (!(name.charAt(i) >= 'a' && name.charAt(i) <= 'z') || !(name.charAt(i) >= 'A' && name.charAt(i) <= 'Z'))

            return;
        }
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) >= 33 && name.charAt(i) <= 64) {
                return;
            }

        }
        for (int i = 0; i < name.length(); i++) {
            if (!(name.charAt(0) >= 'a' && name.charAt(0) <= 'z' || name.charAt(0) >= 'A' && name.charAt(0) <= 'Z')) ;
            return;
        }
        this.name = name;
    }





    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0){
            return;
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0){
            return;
        }
        if (name.equalsIgnoreCase("toilet paper")){
            quantity = 1;
        }
        this.quantity = quantity;
    }



    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", The total cost is = $ "+calcCost()+
                '}';
    }



    public double calcCost(){
        return unitPrice * quantity;
    }



    /*
    package day35_Encapsulation;
public class Item {
    private String name;
    private double unitPrice;
    private int quantity;
    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        for (int i = 0; i <name.length() ; i++) {
            if(!(Character.isLetterOrDigit(name.charAt(i))) || Character.isDigit(name.charAt(0)) || name.isEmpty()
                    || name.isBlank() )return;
        }
        this.name = name;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice) {
        if(unitPrice<=0)return;
        this.unitPrice = unitPrice;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        if(quantity<=0 || (name.equalsIgnoreCase("toilet paper") && quantity !=1))return;

        this.quantity = quantity;
    }
    public double calCost(){
        return unitPrice*quantity;
    }
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", Total Cost=" + calCost() +
                '}';
    }
}
     */























}
