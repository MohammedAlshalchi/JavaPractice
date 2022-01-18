package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
 public static void main(String[] args) {
 /*
 3. SalaryCalculator:
3.1 Ask the user to enter his/her hourlyRate
3.2 Ask the user how many hours he/she works in a week
3.3 Ask the user to enter state tax (in percentage)
3.4 Ask the user to enter federal tax (in percentage)
3.5 Calculate the:
3.4.1 salary
3.4.2 stateTax
3.4.3 federalTax
3.4.4 totalTax
3.4.5 netIncome
  */
  Scanner input =new Scanner(System.in);

  System.out.println("hourlyRate");
  double hourlyRate =input.nextDouble();

  System.out.println("how many hours works in a week");
  double hoursWeek = input.nextDouble();

  System.out.println("state tax");
  double stateTax = input.nextDouble();

  System.out.println("federal tax");
  double federalTax = input.nextDouble();

  double salary= hourlyRate*hoursWeek*52;
  double totaltax =stateTax+federalTax;
  double netIncome =salary-(salary*totaltax/100);

  System.out.println("salary " +salary);
  System.out.println("state Tax "+stateTax);
  System.out.println("federal Tax "+federalTax);
  System.out.println("total Tax "+totaltax);
  System.out.println("net Income "+netIncome);


  input.close();

























 }






















}
