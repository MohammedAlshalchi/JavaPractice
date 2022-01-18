package day39_InheritanceEncapsulation.stateTask;

public class Florida extends State{
    public Florida(String abbreviation, String politicalParty, String governor, String senator,
                   double population, double stateTax) {
        super("Florida", abbreviation, politicalParty, governor, senator, population, stateTax);
    }



    public void beach(){
        System.out.println(getName()+" has Maiami beach");
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }



    public String toString() {
        return "Florida{} " + super.toString();
    }
}
