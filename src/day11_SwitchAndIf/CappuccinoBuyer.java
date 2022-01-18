package day11_SwitchAndIf;

public class CappuccinoBuyer {
    public static void main(String[] args) {
     /*
      1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display
      the price and calories of cappuccino

			Valid sizes are tall, grande, venti and thier price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output shoud be "Invalid Size"


			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed

      */

String size="grand";
String result ="";
/*
if (size=="tall" || size=="grand" || size=="Venti"){
   if (size=="tall"){
       result="price is $3.69\n"+"90 calories";
   }else if (size=="grand"){
     result="price is $3.99;\n"+"120 calories";
   }else {
       result="price is $4.29\n"+"150 calories";
   }


}else {
    result="In Valid";
}

        System.out.println(result);

*/
/*
switch (size){
    case"tall":
        result="price is $3.69\n"+"90 calories";
        break;
    case "grand":
        result="price is $3.99;\n"+"120 calories";
        break;
    case"venti":
        result="price is $4.29\n"+"150 calories";
    default:result="In Valid";


        System.out.println(result);

}

        System.out.println(result);

*/

if (size=="tall" || size=="grand" || size=="venti"){
    switch (size){
        case "tall":
            result="price is $3.69\n"+"90 calories";
            break;
        case "grand":
            result="price is $3.99;\n"+"120 calories";
            break;
              case"venti":
            result="price is $4.29\n"+"150 calories";
            break;
    }
}else {
    result = "In valid";
}


        System.out.println(result);























    }

}
