package day31_Constructor;

public class SalaryCalculator {
    /*
   1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

	            Add a constructor to set all the fields

		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): claculates the totalstateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object

     */


public double hourlyRate ;
public double stateTaxRate;
public double federalTaxRate;
public double weeklyHours;

    public SalaryCalculator (double hourlyRate, double stateTaxRate, double federalTaxRate, double weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary (){

       return   52 * hourlyRate *weeklyHours;
    }

public double stateTax  (){

      return stateTaxRate/100;
}


public double federalTax (){

       return federalTaxRate/100;
}

public double salaryAfterTax(){

       return salary() - salary() * federalTax() - ( stateTax () *salary () ) ;
}


    public String toString() {
        return "SalaryCalculator{" +
                "Salary = $" + salary() +
                ", State Tax =" + stateTax  () +
                ", Federal Tax =" + federalTax ()  +
                ", Salary After Tax= $" + salaryAfterTax() +
                '}';
    }
}
