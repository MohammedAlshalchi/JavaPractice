package day39_InheritanceEncapsulation.stateTask;

public class State {
    /*
    1. Create a class named States:
			variables:
name, abbreviation, politicalParty, Governor, senator, population, stateTax
			Encapsulate all the fields
			Add a constructor that can set all the fields
						Conditions:
1. name, abbreviation, politicalParty, Governor, and senator can not be null
2. name, abbreviation, politicalParty, Governor, and senator can not be empty
3. taxRate can not be negative
4. Population can not be set to zero or negative
			Methods:
				toString()
     */

   private String name, abbreviation, politicalParty, Governor, senator;
   private double  population, stateTax;


    public State(String name, String abbreviation, String politicalParty, String governor, String senator,
                 double population, double stateTax) {
//        this.name = name;
//        this.abbreviation = abbreviation;
//        this.politicalParty = politicalParty;
//        Governor = governor;
//        this.senator = senator;
//        this.population = population;
//        this.stateTax = stateTax;
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()){
            System.err.println("Invalid entry "+ name);
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if(abbreviation == null || abbreviation.isEmpty()){
            System.err.println("Invalid entry "+ abbreviation);
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if(politicalParty == null || politicalParty.isEmpty()){
            System.err.println("Invalid entry "+ politicalParty);
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return Governor;
    }

    public void setGovernor(String governor) {
        if(governor == null || governor.isEmpty()){
            System.err.println("Invalid entry "+ governor);
            System.exit(1);
        }
        Governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if(senator == null || senator.isEmpty()){
            System.err.println("Invalid entry "+ senator);
            System.exit(1);
        }
        this.senator = senator;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        if (population <= 0){
            System.out.println("Invalid population "+population);
        }
        this.population = population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        if (stateTax < 0){
            System.out.println("Invalid state tax "+stateTax);
        }
        this.stateTax = stateTax;
    }

    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", Governor='" + Governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}
