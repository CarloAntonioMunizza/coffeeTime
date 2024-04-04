package Labs.Lab6;

/*
	class Diesel car inherits Car
	has specifc attributes relevent to gas car like gallonsperMile, powerRating, and towingRating
	constuctor uses super to populate attributes shared among all cars
	for type specifc attributes uses this
	override car's toString to print type specific information
*/

class DieselCar extends Car {
	private double gallonsPerMile;
	private int powerRating;
	private int towingRating;

	public DieselCar(String vinNumber, int numPassengers, String modelName, int year, double gallonsPerMile, int powerRating, int towingRating) {
		super(vinNumber, CarType.DIESEL, numPassengers, modelName, year);
		this.gallonsPerMile = gallonsPerMile;
		this.powerRating = powerRating;
		this.towingRating = towingRating;
	}

	public double getGallonsPerMile() {
		return gallonsPerMile;
	}

	public int getPowerRating() {
		return powerRating;
	}

	public int getTowingRating() {
		return towingRating;
	}

	public void setGallonsPerMile(double gallonsPerMile) {
		this.gallonsPerMile = gallonsPerMile;
	}

	public void setPowerRating(int powerRating) {
		this.powerRating = powerRating;
	}

	public void setTowingRating(int towingRating) {
		this.towingRating = towingRating;
	}

	@Override
	public String DriveTrain() {
		return String.format("Vin: %s, Model: %s, Year: %d, Gallons/Mile: %.2f, Power Rating: %d, Towing Rating: %d", getVinNumber(), getModelName(), getYear(), gallonsPerMile, powerRating, towingRating);
	}

	@Override
	public String toString() {
		return DriveTrain();
	}
}

