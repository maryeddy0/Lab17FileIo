import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class CountryApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//
// -------------Pre-------------------------------
//
		String replay = "y";
//
//

		LinkedList<Country> country = new LinkedList<>();
		Country newCountry = new Country();
//
		//
		// Makes a file with a specified name
		TextFile.createOurFile("countries");
		//
		// LinkedList<Country> newCountry = new LinkedList<>();
		country.add(new Country("Ethiopia", 105 ));
		country.add(new Country("Egypt", 97.55));
		country.add(new Country("Germany", 82.79));
		country.add(new Country("Yugoslavia", 23.23));
		//
		// writes added linked lists to txt file
		
		TextFile.writeToFile(country);
		//
		do {
			System.out.println("\nWELCOME TO THE COUNTRIES MAINTENANTS APPLICATION\n");
			TextFile.writeToFile(country);
			System.out.println("1. Display List of Countries");
			System.out.println("2. Add a Country");
			System.out.println("3. Exit");
			System.out.println();
			int menu = Validator.getInt(scan, "Enter a menu number to continue.\n");
//			
			if (menu == 1) {
				TextFile.readFromFile();

			} else if (menu == 2) {
				String name = Validator.getString(scan, "Enter Country name.\n");
				newCountry.setName(name);
				//
				//
				int pop = Validator.getInt(scan, "Enter Country's population. (in millions)\n");
				newCountry.setPopulation(pop);
				//
				country.add(new Country(newCountry.getName(), newCountry.getPopulation()));
				TextFile.writeToFile(country);
				
				//
			} else if (menu == 3) {
				System.out.println("Goodbye!");
				replay.equalsIgnoreCase("quit");
			} else {
				System.out.println("invalid entry");
			
				//

			}

		} while (replay.equalsIgnoreCase("y"));
		scan.close();
	}
}
