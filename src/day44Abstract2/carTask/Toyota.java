package day44Abstract2.carTask;

public class Toyota extends Car{

    public Toyota(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }



    @Override
    public void start() {
        System.out.println("getMake()+\" \"+getModel()+\" \"+getYear()+\" is stopping\" = " + getMake() + " " +
                getModel() + " " + getYear() + " is stopping");
    }

    @Override
    public void drive() {
        System.out.println("getMake()+\" \"+getMake()+\" is nice in driving\" = " +
                getMake() + " " + getMake() + " is nice in driving");
    }
}
