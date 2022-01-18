package day38_inheritance1.shape;

public class Shape {
/*
variable:
		name
	Add A constructor to set the filed
	Methods:
		area(){return 0}
		perimeter{return 0}
		toString(): name, area, perimeter
 */

   public String name;

    public Shape (String name) {
        this.name = name;
    }

    public double area() {
        return 0;
    }
   public double perimeter(){
        return 0;
   }

    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                "area ="+area()+'\'' +
                "'\\'' +"+perimeter()+'\'' +
                '}';
    }
}
