package day43_abstraction.shapTask;

public class Circle extends Shape{
    /*
    Circle:
area(): r * r * pi
perimeter(): 2 * r * pi
     */


    private double raduis;
    public final static double pi=3.14;

    public Circle(double raduis) {
        super("Circle");
//        this.raduis = raduis;
        setRaduis(raduis);
    }


    @Override
    public void area() {
        System.out.println("Area of circle= "+pi*raduis*raduis);
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of circle= "+pi*raduis*2);
    }

    public double getRaduis() {
        return raduis;
    }

    public void setRaduis(double raduis) {
        if (raduis < 0){
            throw new RuntimeException("Invalid radius");
        }
        this.raduis = raduis;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Name="+getName()+"\n"+
                "raduis=" + raduis +
                "} " ;
    }
}
