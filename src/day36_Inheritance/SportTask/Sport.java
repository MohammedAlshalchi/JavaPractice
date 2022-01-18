package day36_Inheritance.SportTask;

public class Sport {
    /*
    1. Create a class named Sport
			variables:
				name, numberOfPlayers, numberOfRefere, rules
			methods:
				setInfo()
				play()
				toString()
     */

public String name;
public int numberOfPlayers, numberOfRefere, rules;

    public void setInfo(String name, int numberOfPlayers, int numberOfRefere, int rules) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfRefere = numberOfRefere;
        this.rules = rules;
    }

    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfRefere=" + numberOfRefere +
                ", rules=" + rules +
                '}';
    }

    public void play(){
        System.out.println(name+" is playing");
    }























}
