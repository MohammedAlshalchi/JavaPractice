package day11_SwitchAndIf;

public class CydoBatches {
    public static void main(String[] args) {
/*
4. Create a class named Cydeo batches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed

 */
        String CydeoBatches = "US evening";
        String result =" ";
        /*

        if (CydeoBatches=="US morning" || CydeoBatches=="US evening" || CydeoBatches=="EU"){

if (CydeoBatches=="US morning"){
    result="Class times are 10-5 EST. M, T, Th, F.";
}else if (CydeoBatches=="US evening"){
result="Class times are 7-10 EST. M, T, W, Th, S, S";
}else if (CydeoBatches=="EU"){
    result="Class times are  10-5 EST. M, T, W, Th, F.";
}

        }else {
            result="Invalid Btach";
        }

        System.out.println(result);
*/
/*
switch (CydeoBatches){
    case ("US morning"):
        result="Class times are 10-5 EST. M, T, Th, F.";
        break;
    case ("US evening"):
        result="Class times are 7-10 EST. M, T, W, Th, S, S";
        break;
    case ("EU"):
        result="Class times are  10-5 EST. M, T, W, Th, F.";
        break;
    default:result="Invalid Btach";
}

        System.out.println(result);

*/

if (CydeoBatches=="US morning" || CydeoBatches=="US evening" || CydeoBatches=="EU"){
switch (CydeoBatches){
    case ("US morning"):
        result="Class times are 10-5 EST. M, T, Th, F.";
        break;
    case ("US evening"):
        result="Class times are 7-10 EST. M, T, W, Th, S, S";
        break;
    default:result=" 10-5 EST. M, T, W, Th, F.\"";
    break;
}


}else {
    result="Invalid Btach";
}

        System.out.println(result);









    }


}
