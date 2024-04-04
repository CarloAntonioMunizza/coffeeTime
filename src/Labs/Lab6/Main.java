package Labs.Lab6;

/*
	Carlo Munizza cam71342psu.edu.

	I declare that what has been written in this work has been written by me and that no part has been copied from scientific publications,
	the Internet or from other online sources or was already presented in the academic field by me or by other students.
*/

/*
	main creates a new dealership object
	then we create 2 new gasCars
	2 new  diesel cars
	and 2 new electric cars
	then we add all the cars to a dealsership with the add car method
	next we print the inventory of the dealership to show it has every car added
	then we print out the number of cars in each type
	we sell gasCar1
	then reprint the inventory to show it was removed from the dealership's inventory
*/

public class Main {
	public static void main(String[] args) {
		Dealership dealership = new Dealership();

		// Create car objects
		GasCar gasCar1 = new GasCar("GAS1234567891234", 5, "Toyota Camry", 2020, 30, "Regular", "10W-40");
		GasCar gasCar2 = new GasCar("GAS2345678901234", 4, "Honda Civic", 2019, 35, "Premium", "5W-30");

		DieselCar dieselCar1 = new DieselCar("DSL1234567890124", 2, "Ford F-150", 2021, 20, 250, 5000);
		DieselCar dieselCar2 = new DieselCar("DSL2345678901235", 3, "Chevrolet Silverado", 2022, 22, 300, 6000);

		ElectricCar electricCar1 = new ElectricCar("ELE1234567890124", 5, "Tesla Model S", 2021, 0.28, 2, "Type2");
		ElectricCar electricCar2 = new ElectricCar("ELE2345678901234", 4, "Nissan Leaf", 2020, 0.3, 1, "CCS");

		// Add cars to the dealership
		dealership.addCar(gasCar1);
		dealership.addCar(gasCar2);
		dealership.addCar(dieselCar1);
		dealership.addCar(dieselCar2);
		dealership.addCar(electricCar1);
		dealership.addCar(electricCar2);

		// Print dealership inventory
		dealership.printInventory();

		// Demonstrate other methods
		System.out.println("\nCounting car types:");
		System.out.println("Gas Cars: " + dealership.countCarType(CarType.valueOf(CarType.GAS.name())));
		System.out.println("Diesel Cars: " + dealership.countCarType(CarType.valueOf(CarType.DIESEL.name())));
		System.out.println("Electric Cars: " + dealership.countCarType(CarType.valueOf(CarType.ELECTRIC.name())));

		// Remove a car from the lot and print inventory again
		dealership.sellCar(gasCar1);

		System.out.print("\n");
		dealership.printInventory();
	}
}

