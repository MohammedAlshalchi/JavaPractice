package day39_InheritanceEncapsulation.stateTask;

public class Virginia extends State{
    public Virginia(String abbreviation, String politicalParty, String governor, String senator,
                    double population, double stateTax) {
        super("Virginia", abbreviation, politicalParty, governor, senator, population, stateTax);
    }
    public void lover (){
        System.out.println(getName()+" is for lover");
    }



    public String toString() {
        return "Virginia{} " +
                ", abbreviation='" + getAbbreviation() + '\'' +
                ", politicalParty='" + getPoliticalParty() + '\'' +
                ", Governor='" + getGovernor() + '\'' +
                ", senator='" + getSenator() + '\'' +
                ", population=" + getPopulation() +
                ", stateTax=" + getStateTax() +
                '}';
    }




}
