package Labs.Lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	private List<Car> cars;
	private int totalCarsSold = 0;

	public Dealership() {
		this.cars = new ArrayList<>();
		this.totalCarsSold = totalCarsSold;
	}

	public int getTotalCarsSold(){
		return totalCarsSold;
	}

	public void addCar(Car car) {
		if (validateVin(car.getVinNumber()) && validateModelYear(car.getYear())) {
			cars.add(car);
		} else {
			System.out.println("Invalid Car details for VIN: " + car.getVinNumber());
		}
	}

	public void sellCar(Car car)
	{
		System.out.print("\n");
		System.out.print("Car sold: \n");
		System.out.println(car);
		cars.remove(car);
		totalCarsSold = getTotalCarsSold();
		totalCarsSold = + 1;
		System.out.printf("Total Cars Sold: %d", totalCarsSold);
		System.out.print("\n");
	}

	public int countCarType(CarType type) {
		return (int) cars.stream().filter(car -> car.getEngineType() == type).count();
	}


	private boolean validateVin(String vin) {
		Pattern pattern = Pattern.compile("^[A-Za-z0-9]{16}$");
		Matcher matcher = pattern.matcher(vin);
		return matcher.matches();
	}

	private boolean validateModelYear(int year) {
		return Integer.toString(year).length() == 4;
	}

	public void printInventory() {
		if (cars.isEmpty()) {
			System.out.println("The inventory is currently empty.");
		} else {
			System.out.println("Current Inventory:");
			for (Car car : cars) {
				System.out.println(car); // This will call the toString() method of each Car object
			}
		}
	}
}