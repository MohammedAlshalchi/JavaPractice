package day36_Inheritance.SportTask;

public class SportObject {
    public static void main(String[] args) {

AmericanFootball americanFootball1 = new AmericanFootball();
americanFootball1.setInfo("Wizared",10,2,5);
americanFootball1.sweep();
        System.out.println(americanFootball1);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");

BaseBall baseBall1 = new BaseBall();
baseBall1.setInfo("Leakers",15,6,10);
baseBall1.pitch();
        System.out.println(baseBall1);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");


BasketBall basketBall1 =new BasketBall();
basketBall1.setInfo("nonor",6,9,8);
basketBall1.dribble();
        System.out.println(basketBall1);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");

FootBall footBall1 = new FootBall();
footBall1.setInfo("Mohammed",11,4,15);
footBall1.pass();
        System.out.println(footBall1);

    }
}
