/*
Carlo Munizza Cam7134@psu.edu.
I declare that what has been written in this work has been written by me and that
no part has been copied from scientific publications, the Internet or from other
online sources or was already presented in the academic field by me or by other
students.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//sammoud said i am good on this lab since i did it the better way
//apparently this was going to be a seperate lab later

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


public class Lab5 {
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

		dealership.sellCar(gasCar1);

		dealership.sellCar(dieselCar1);
		System.out.print("\n");

		// Print dealership inventory
		dealership.printInventory();
	}
}

/*
	dealership class has a private list of cars to hold it's inventory of cars
	holds total cars sold, contructor dealership initilizes new list and totalCarsSold
	has fucntion sell car that increments total sold cars and removes selected car form inventory
	has function add car that adds a car to inventory
	has function car type that returns the type of car form enumeration
	has function validateVin to check to make sure vin is numbers or letters that is 16 characters long
	has function validate year to turn year into a int the length of 4
	has function to print inventory of dealership
*/
class Dealership {
	private List<Car> cars;	// List of cars in the dealership
	private int totalCarsSold = 0; // Total cars sold

	public Dealership() { // Constructor
		this.cars = new ArrayList<>(); // Initialize the list of cars
		this.totalCarsSold = 0; // Initialize the total cars sold
	}

	public int getTotalCarsSold(){ // Getter for totalCarsSold
		return totalCarsSold; // Return totalCarsSold
	}

	public void addCar(Car car) { // Add a car to the dealership
		if (validateVin(car.getVinNumber()) && validateModelYear(car.getYear())) { // Validate the VIN and year
			cars.add(car);
		} else {
			System.out.println("Invalid Car details for VIN: " + car.getVinNumber()); // Print error message
		}
	}

	public void sellCar(Car car){ // Sell a car from the dealership
		System.out.print("\n");
		System.out.print("Car sold: \n");
		System.out.println(car);
		cars.remove(car); // Remove the car from the list
		totalCarsSold = getTotalCarsSold(); // get the total cars sold
		totalCarsSold += 1; // Increment the total cars sold
		System.out.printf("Total Cars Sold: %d", totalCarsSold);
		System.out.print("\n");
	}

	public int countCarType(CarType type) { // Count the number of cars of a certain type
		return (int) cars.stream().filter(car -> car.getEngineType() == type).count(); // Return the number of cars of the specified type
	}

	private boolean validateVin(String vin) { // Validate the VIN
		Pattern pattern = Pattern.compile("^[A-Za-z0-9]{16}$"); // Create a pattern for the VIN
		Matcher matcher = pattern.matcher(vin); // Create a matcher for the VIN
		return matcher.matches(); // Return whether the VIN matches the pattern
	}

	private boolean validateModelYear(int year) { // Validate the model year
		return Integer.toString(year).length() == 4; // Return whether the year is 4 digits long
	}

	public void printInventory() { // Print the inventory of the dealership
		if (cars.isEmpty()) { // If the inventory is empty
			System.out.println("The inventory is currently empty."); // Print a message
		} else { // If the inventory is not empty
			System.out.println("Current Inventory:"); // Print a message
			for (Car car : cars) { // For each car in the inventory
				System.out.println(car); // Print the car
			}
		}
	}
}

enum CarType { // holds type of cars in an enumeration called CarType
	GAS,
	DIESEL,
	ELECTRIC
}

/*
	is the abstract class car that specific car types inherit
	has attributes Vin, engin type, number of passengers, model name, and year
	has getters for vin, enginetype, and year
	has function toString that prints car info
*/
abstract class Car { // Abstract class for car
	private String vinNumber;
	private CarType engineType; // Using Enum for engine types
	private int numPassengers;
	private String modelName;
	private int year;

	public Car(String vinNumber, CarType engineType, int numPassengers, String modelName, int year) { // Constructor
		this.vinNumber = vinNumber;
		this.engineType = engineType;
		this.numPassengers = numPassengers;
		this.modelName = modelName;
		this.year = year;
	}

	public String getVinNumber() { // Getter for VIN
		return vinNumber;
	}

	public CarType getEngineType() { // Getter for engine type
		return engineType;
	}

	public int getYear() { // Getter for year
		return year;
	}

	@Override
	public String toString() { // Override toString method
		return String.format("Type: %s, VIN: %s, Model: %s, Year: %d, Passengers: %d", engineType, vinNumber, modelName, year, numPassengers);
	}
}

/*
	class gas car inherits Car
	has specifc attributes relevent to gas car like gallonsPerMile, recommendedFuelGrade, and motorOilGrade
	constuctor uses super to populate attributes shared among all cars
	for type specifc attributes uses this
	override car's toString to print type specific information
*/
class GasCar extends Car { // GasCar class inherits from Car
	private double gallonsPerMile;
	private String recommendedFuelGrade;
	private String motorOilGrade;

	public GasCar(String vinNumber, int numPassengers, String modelName, int year, double gallonsPerMile, String recommendedFuelGrade, String motorOilGrade) { // Constructor
		super(vinNumber, CarType.GAS, numPassengers, modelName, year); // Call the constructor of the superclass
		this.gallonsPerMile = gallonsPerMile;
		this.recommendedFuelGrade = recommendedFuelGrade;
		this.motorOilGrade = motorOilGrade;
	}

	@Override
	public String toString() { // Override toString method
		return super.toString() + String.format(", Gallons/Mile: %.2f, Fuel Grade: %s, Oil Grade: %s", gallonsPerMile, recommendedFuelGrade, motorOilGrade);
	}
}

/*
	class Diesel car inherits Car
	has specifc attributes relevent to gas car like gallonsperMile, powerRating, and towingRating
	constuctor uses super to populate attributes shared among all cars
	for type specifc attributes uses this
	override car's toString to print type specific information
*/

class DieselCar extends Car { // DieselCar class inherits from Car
	private double gallonsPerMile;
	private int powerRating;
	private int towingRating;

	public DieselCar(String vinNumber, int numPassengers, String modelName, int year, double gallonsPerMile, int powerRating, int towingRating) { // Constructor
		super(vinNumber, CarType.DIESEL, numPassengers, modelName, year); // Call the constructor of the superclass
		this.gallonsPerMile = gallonsPerMile;
		this.powerRating = powerRating;
		this.towingRating = towingRating;
	}

	@Override
	public String toString() { // Override toString method
		return super.toString() + String.format(", Gallons/Mile: %.2f, Power: %d HP, Towing: %d lbs", gallonsPerMile, powerRating, towingRating);
	}

}

/*
	class electric car inherits Car
	has specifc attributes relevent to gas car like kWhperMile, numberOfElectricEngines, and changeConnectorType
	constuctor uses super to populate attributes shared among all cars
	for type specifc attributes uses this
	override car's toString to print type specific information
*/

class ElectricCar extends Car { // ElectricCar class inherits from Car
	private double kWhPerMile;
	private int numberOfElectricEngines;
	private String chargeConnectorType;

	public ElectricCar(String vinNumber, int numPassengers, String modelName, int year, double kWhPerMile, int numberOfElectricEngines, String chargeConnectorType) { // Constructor
		super(vinNumber, CarType.ELECTRIC, numPassengers, modelName, year); // Call the constructor of the superclass
		this.kWhPerMile = kWhPerMile;
		this.numberOfElectricEngines = numberOfElectricEngines;
		this.chargeConnectorType = chargeConnectorType;
	}

	@Override
	public String toString() { // Override toString method
		return super.toString() + String.format(", kWh/Mile: %.2f, Electric Engines: %d, Connector: %s", kWhPerMile, numberOfElectricEngines, chargeConnectorType);
	}
}


