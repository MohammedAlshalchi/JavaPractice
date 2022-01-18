package day35_Encapsulation;

public class Pizza {
    /*
    Pizza Task:
		5.1 Create class named Pizza:
				private variables:
					size, numberOfCheeseTopping, numberOfPepperoniTopping
				Encapsulate all the fields
						Conditions:
							size of the pizza can only be small, medium, large. case insensitive
Number of cheese topping can not be negative, the maximum number of cheese topping is:
										small: 3
										medium: 4
										large: 5
Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:
										small: 4
										medium: 5
										large: 6
				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments not valid it should not be set to the instances)
				Methods:
					calcCost(): returns the totalCost of the pizza
toString():returns a String containing the pizza size, quantity of each topping,
and the pizza cost as calculated by calcCost()
		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping
     */

    private String size;
    private int numberOfCheeseTopping;
    private int numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (!(size.toLowerCase().equals("small") || size.toLowerCase().equals("medium") ||
                size.toLowerCase().equals("large"))) {
            System.out.println("Invalid size " + size);
            System.exit(0);
        }
        this.size = size;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if (numberOfCheeseTopping < 0) {
            System.out.println("Invalid number of cheese topping " + numberOfCheeseTopping);
            System.exit(0);
        }
        if (size.toLowerCase().equals("small") && numberOfCheeseTopping > 3) {
            System.out.println("Invalid number of cheese topping " + numberOfCheeseTopping);
            System.exit(0);

        }
        if (size.toLowerCase().equals("medium") && numberOfCheeseTopping > 4) {
            System.out.println("Invalid number of cheese topping " + numberOfCheeseTopping);
            System.exit(0);
        }
        if (size.toLowerCase().equals("large") && numberOfCheeseTopping > 5) {
            System.out.println("Invalid number of cheese topping " + numberOfCheeseTopping);
            System.exit(0);
        }
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfCheeseTopping(int numberOfCheeseTopping) {
        return numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if (numberOfPepperoniTopping < 0) {
            System.out.println("Invalid number of pepperoni topping " + numberOfPepperoniTopping);
            System.exit(0);
        }
        if (size.toLowerCase().equals("small") && numberOfPepperoniTopping > 4) {
            System.out.println("Invalid number of pepperoni topping " + numberOfPepperoniTopping);
            System.exit(0);

        }
        if (size.toLowerCase().equals("medium") && numberOfPepperoniTopping > 5) {
            System.out.println("Invalid number of pepperoni topping" + numberOfPepperoniTopping);
            System.exit(0);
        }
        if (size.toLowerCase().equals("large") && numberOfPepperoniTopping > 6) {
            System.out.println("Invalid number of  pepperoni topping" + numberOfPepperoniTopping);
            System.exit(0);
        }

        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost() {
        double totalPrice=0;
        if (size.toLowerCase().equals("small")) {
            totalPrice = 10 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
        }
        if (size.toLowerCase().equals("medium")) {
            totalPrice = 12 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);

        }
        if (size.toLowerCase().equals("large")) {
            totalPrice = 14 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
        }
        return totalPrice;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price=" + calcCost() +
                '}';
    }


}
