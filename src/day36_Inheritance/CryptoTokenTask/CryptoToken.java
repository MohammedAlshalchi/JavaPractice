package day36_Inheritance.CryptoTokenTask;

public class CryptoToken {
    /*
  1. create a class called CryptoToken
			variables:
				price, quantity, marketCap, volume, circulatingSupply, isMineable (boolean)
			methods:
				setInfo()
				toString()
				totalPrice(): returns the total price of the cyrpto totek ( price * quantity)

     */

public double price,marketCap,volume,circulatingSupply;
public int quantity;
public boolean isMineable;

    public void setInfo (double price, double marketCap, double volume, double circulatingSupply,
                       int quantity, boolean isMineable) {
        this.price = price;
        this.marketCap = marketCap;
        this.volume = volume;
        this.circulatingSupply = circulatingSupply;
        this.quantity = quantity;
        this.isMineable = isMineable;
    }

    public String toString() {
        return "CryptoToken{" +
                "price=" + price +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", circulatingSupply=" + circulatingSupply +
                ", quantity=" + quantity +
                ", isMineable=" + isMineable +
                '}';
    }


    public void totalPrice(){
        System.out.println("Total price is: $"+price*quantity);
    }













}
