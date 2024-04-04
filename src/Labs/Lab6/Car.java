package Labs.Lab6;

/*
	is the abstract class car that specidic car types inherit
	has attributes Vin, engin type, number of passengers, model name, and year
	has getters for vin, enginetype, and year
	has function toString that prints car info
*/
abstract class Car {
	private String vinNumber;
	private CarType engineType; // Using Enum for engine types
	private int numPassengers;
	private String modelName;
	private int year;

	public Car(String vinNumber, CarType engineType, int numPassengers, String modelName, int year) {
		this.vinNumber = vinNumber;
		this.engineType = engineType;
		this.numPassengers = numPassengers;
		this.modelName = modelName;
		this.year = year;
	}

	public String getVinNumber() {
		return vinNumber;
	}

	public CarType getEngineType() {
		return engineType;
	}

	public int getNumPassengers() {
		return numPassengers;
	}

	public String getModelName() {
		return modelName;
	}

	public int getYear() {
		return year;
	}

	public void setVinNumber(String vinNumber) {
		this.vinNumber = vinNumber;
	}

	public void setEngineType(CarType engineType) {
		this.engineType = engineType;
	}

	public void setNumPassengers(int numPassengers) {
		this.numPassengers = numPassengers;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Vin: " + vinNumber + ", Engine Type: " + engineType + ", Number of Passengers: " + numPassengers + ", Model Name: " + modelName + ", Year: " + year;
	}

	public abstract String DriveTrain();
}

