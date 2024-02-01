package Labs.Lab3;

/*
Carlo Munizza Cam7134@psu.edu.
I declare that what has been written in this work has been written by me and that
no part has been copied from scientific publications, the Internet or from other
online sources or was already presented in the academic field by me or by other
students.
*/

/*
	class for object car
	each car should have its own VIN Number
	Engine type(gas diesel electric)
	Number of passangers
	Model Name
	and year

	constructor should take in all of these values
	getters for all of these values
*/

public class Car {
private String vinNumber; // Initialize the VIN number
	private String engineType; // Initialize the engine type
	private int numPassangers; // Initialize the number of passangers
	private String modelName; // Initialize the model name
	private int year; // Initialize the year

	public Car(String vinNumber, String engineType, int numPassangers, String modelName, int year) { // Constructor for the Car class
		this.vinNumber = vinNumber; // Set the VIN number
		this.engineType = engineType; // Set the engine type
		this.numPassangers = numPassangers; // Set the number of passangers
		this.modelName = modelName; // Set the model name
		this.year = year; // Set the year
	}

	public String getVinNumber() { // Method to get the VIN number
		return vinNumber;
	}

	public String getEngineType() { // Method to get the engine type
		return engineType;
	}

	public int getNumPassangers() { // Method to get the number of passangers
		return numPassangers;
	}

	public String getModelName() { // Method to get the model name
		return modelName;
	}

	public int getYear() { // Method to get the year
		return year;
	}
}
