package day43_abstraction.shapTask;

public class Rectangle extends Shape{
    /*
    Rectangle:
area(): w * l
perimeter(): 2 * (w+l)
     */

 private double length;
 private double width ;

    public Rectangle(double length, double width) {
        super("Rectangle");
//        this.length = length;
//        this.width = width;
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <0 ){
           throw new RuntimeException("Invalid length");
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            throw new RuntimeException("Invalid width");
        }
        this.width = width;
    }

//    public Rectangle(String name) {
//        super(name);
//    }

    @Override
    public void area() {
        System.out.println("Area of rectangle= "+width*length);
    }

    @Override
    public void perimeter() {
        System.out.println("Area of rectangle= "+ (2*(width*length)));

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "Name="+getName()+"\n"+
                "length=" + length +"\n"+
                ", width=" + width +
                "} " ;
    }
}
