package day22_MultiDimensionArray;

public class BetweenTowWords {
    public static void main(String[] args) {
        /*
        Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado

         */

        String[][] items = {{"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}};
        for (String[] item : items) {
            for (String each : item) {
                System.out.print(each+"\t");
            }
        }
        System.out.println();
        for (String[] item : items) { // grabbiing each array in order from index 0 to end
            for (int i = item.length - 1; i >= 0; i--) { // printing element in 1d array in reverse from end to index 0
                System.out.print(item[i]+"\t");
            }
        }
        System.out.println();
        for (int i = items.length - 1; i >= 0; i--) { // reverse the order of 1d array first
            for (String each : items[i]) { // printing each element in 1d array in order from index 0 to end
                System.out.print(each+"\t");
            }
        }























    }
}
