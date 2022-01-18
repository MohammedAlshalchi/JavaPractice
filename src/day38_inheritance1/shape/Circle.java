package day38_inheritance1.shape;
/*
    Circle
	r
	pi
	toString(): name, r, pi, area, perimeter
     */

public class Circle extends Shape{

   public double raduis;
   public static double pi = 3.14;

    public Circle ( double raduis) {
        super(" Circle");
        this.raduis = raduis;
    }

    @Override
    public double area() {
        return raduis * raduis *pi;
    }

    @Override
    public double perimeter() {// It is NOT good because anyone can get access to the method
        // SO it is better to make it privet
        return raduis * 2 * pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name ='" + name + '\'' +
                "radius =" + raduis +'\'' +
                "pi =" + raduis +'\'' +
                "area =" + raduis +'\'' +
                "perimeter =" + raduis +'\'' +
                '}';
    }
}
