package Labs.Lab3;

/*
Carlo Munizza Cam7134@psu.edu.
I declare that what has been written in this work has been written by me and that
no part has been copied from scientific publications, the Internet or from other
online sources or was already presented in the academic field by me or by other
students.
*/

/*
	class for dealership which will double as a main
	should have total number of cars
	should have total cars sold
	constructor should take in total number of cars and total cars sold
	getters and setters for total number of cars and total cars sold
	main should create a dealership object
	print the total number of cars
	print the total cars sold
	create a car object
	print the car object
	repeat
*/

public class Dealership {
	private int totalCars; // Initialize the total number of cars
	private int totalCarsSold; // Initialize the total number of cars sold

	public Dealership(int totalCars, int totalCarsSold) { // Constructor for the Dealership class
		this.totalCars = totalCars; // Set the total number of cars
		this.totalCarsSold = totalCarsSold; // Set the total number of cars sold
	}

	public void sellCar(Car car) { // Method to sell a car
		totalCarsSold++; // Increment the total number of cars sold
		totalCars--; // Decrement the total number of cars
		System.out.println("Car: " + car.getModelName() + " " + car.getVinNumber() + " " + car.getEngineType() + " " + car.getNumPassangers() + " " + car.getYear() + " has been sold");
	}

	public void printAllCars() { // Method to print the total number of cars and the total number of cars sold
		System.out.println("Total Cars: " + totalCars);
		System.out.println("Total Cars Sold: " + totalCarsSold);
	}

	public static void main(String[] args) {
		Dealership dealership = new Dealership(10, 0); // Create a dealership object
		dealership.printAllCars(); // Print the total number of cars and the total number of cars sold
		Car car = new Car("123456789", "Gas", 5, "Toyoda", 2020); // Create a car object
		System.out.print("Car: " + car.getModelName() + " " + car.getVinNumber() + " " + car.getEngineType() + " " + car.getNumPassangers() + " " + car.getYear() + "\n");
		Car car2 = new Car("987654321", "Electric", 4, "Model S", 2021); // Create a car object
		System.out.print("Car: " + car2.getModelName() + " " + car2.getVinNumber() + " " + car2.getEngineType() + " " + car2.getNumPassangers() + " " + car2.getYear() + "\n");
		Car car3 = new Car("123456789", "Gas", 5, "BMW", 2020); // Create a car object
		System.out.println("Car: " + car3.getModelName() + " " + car3.getVinNumber() + " " + car3.getEngineType() + " " + car3.getNumPassangers() + " " + car3.getYear());
		Car car4 = new Car("987654321", "Electric", 4, "Model S", 2021); // Create a car object
		System.out.println("Car: " + car4.getModelName() + " " + car4.getVinNumber() + " " + car4.getEngineType() + " " + car4.getNumPassangers() + " " + car4.getYear());
		Car car5 = new Car("123456789", "Gas", 5, "Jeep", 2020); // Create a car object
		System.out.println("Car: " + car5.getModelName() + " " + car5.getVinNumber() + " " + car5.getEngineType() + " " + car5.getNumPassangers() + " " + car5.getYear());

		dealership.sellCar(car);
		dealership.sellCar(car3);
		dealership.printAllCars();
	}
}
