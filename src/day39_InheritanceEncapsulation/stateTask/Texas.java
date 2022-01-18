package day39_InheritanceEncapsulation.stateTask;

public class Texas extends State {

    public Texas(String abbreviation, String politicalParty, String governor, String senator,
                 double population, double stateTax) {
        super("Texas", abbreviation, politicalParty, governor, senator, population, stateTax);
    }


    public void climatic() {
        System.out.println(getName() + " is dry weather");
    }


    @Override
    public String toString() {
        return super.toString();
    }
}