package day33_ConstructorOverLoading;

public class Circle {
    /*
    Attributes:
					instance: radius, diameter
					static: pi
				Add a constructor that can set All the fields (instances)
					HINT: we only need to know the radius to set the radius & diameter
				Actions:
					calcArea(): returns the area of Circle
					calcPerimeter(): returns the perimeter of Circle
					printPi(): displays PI value
toString(): displays the radius, diameter, pi, area and perimeter of the circle when
the object of circle is passed in the print statement

     */


  public double  radius, diameter;

    public static double PI = 3.14;

    public Circle(double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }

    public double calcArea(){
        double Area = radius * radius * PI;
        return Area;
    }


    public double calcPerimeter(){
        double Perimeter = radius * 2 * PI;
        return Perimeter;
    }

    public static double PIvalue (){
       return PI;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", PI value=" + PI +
                ", Area =" + calcArea() +
                ",  Perimeter=" + calcPerimeter() +
                '}';
    }
}
