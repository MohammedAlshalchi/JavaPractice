package day43_abstraction.shapTask;

public class Square extends Shape{
    /*
    Square:
    area(): s * s
    perimeter: 4 * s
      */

  private double side;

    public Square(double side) {
        super("Square");
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of square= "+ (4*side));
    }


    @Override
    public void area() {
        System.out.println("Area of square= "+ (side*side));
    }

    @Override
    public String toString() {
        return "Square{" +
                "Name= "+getName()+"\n"+
                "side=" + side +
                "} " ;
    }
}
