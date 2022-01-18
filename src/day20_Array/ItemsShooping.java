package day20_Array;

public class ItemsShooping {
    public static void main(String[] args) {
       /*
        3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID
        */




String [] items =  {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case"};
double [] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
int [] itemIDs  =  {12345 ,     12346,  12347,    12348,     12349,    12350};


        int GloveIndex =-1;
        boolean HasIpad = false;
        String report = "";

        for (int i = 0; i < items.length; i++) {

            String ItemName = items[i];
            double ItemPrice = prices[i];
            int Itemid = itemIDs[i];


            if (ItemName.equals("Gloves")){
                GloveIndex = i;
            }

            if (ItemName.equals("iPad")){
                HasIpad = true;
            }


            report += ItemName + " - "+ItemPrice+" - "+Itemid+"\n";
        }
        System.out.println(GloveIndex);
        System.out.println(HasIpad);
        System.out.println(report);




    }
}
