package day38_inheritance1.shape;

public class Square extends Shape{
    /*
   Square
	s
	toString(): name, s, area, perimeter
     */
public double Side;

    public Square(double side) {
        super("Square");
        Side = side;
    }

    @Override
    public double area() {
        return Side * Side;
    }

    @Override
    public double perimeter() {
        return Side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "Side=" + Side +'\'' +
                "area=" + area() +'\'' +
                "perimeter=" + perimeter() +'\'' +
                '}';
    }
}
