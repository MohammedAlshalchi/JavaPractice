package day38_inheritance1.shape;

public class Rectangle extends Shape{
    /*
    Rectangle
	l
	w
	toString(): name, l, w, area, perimeter
     */

public double length , width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public double area () {
        return width * length;
    }

    @Override
    public double perimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + name + '\'' +
                "length=" + length +'\'' +
                ", width=" + width +'\'' +
                ", area=" + width +'\'' +
                ",  perimeter=" + width +'\'' +
                '}';
    }
}
