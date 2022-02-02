package day43_abstraction.shapTask;

public class ShapeObject {

    public static void main(String[] args) {

      Circle circle = new Circle(5);
      Square square = new Square(2);
      Rectangle rectangle =new Rectangle(5,2);


        System.out.println(circle);
        System.out.println(square);
        System.out.println(rectangle);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        circle.area();
        circle.perimeter();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        rectangle.area();
        rectangle.perimeter();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        square.area();
        square.perimeter();





























    }
}

