package day43_abstraction.shapTask;

public abstract class Shape {
    /*
    Shape:
name
Encapsulate the fields
Add constructor to set the fields
area()
perimeter()
toString(): name, area, perimeter
     */

  private String name;


    public Shape(String name) {
//        this.name = name;
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()){
            throw new RuntimeException("Invalid enter: name should not be empty or blank");
        }
        this.name = name;
    }

    public abstract void area ();
    public abstract void perimeter();


    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }
}
