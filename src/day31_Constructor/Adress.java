package day31_Constructor;

public class Adress {
    /*
    2.1 Create a class named Address
		    Attributes:
		         buildingNumber, street, city, state, zipCode;
		   	Add a constructor to set all the fields
		    Actions
		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012
     */
      // instant variable
public int  buildingNumber;
public String street;
public String  city;
public String state;
public int zipCode;

                  // local variable
    public Adress (int buildingNumber, String street, String city, String state, int zipCode) {
        this.buildingNumber = buildingNumber;// this. ==> to call instant variable
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }


    public String toString() {
        return  buildingNumber +" "+ street +'\n'+ city +" "+state + ", " + zipCode ;
    }

}
