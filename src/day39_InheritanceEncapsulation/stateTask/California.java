package day39_InheritanceEncapsulation.stateTask;

public class California extends State{

    public California(String abbreviation, String politicalParty, String governor, String senator,
                      double population, double stateTax) {
        super("California", abbreviation, politicalParty, governor, senator, population, stateTax);
    }

  public void weather () {
      System.out.println(getName()+" very nice");
  }


 public void price () {
     System.out.println(getName()+" is very expensiveness ");
 }


    public String toString() {
        return "California{} " + super.toString();
    }
}
