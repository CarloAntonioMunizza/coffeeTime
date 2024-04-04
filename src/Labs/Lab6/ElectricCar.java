package Labs.Lab6;

/*
	class electric car inherits Car
	has specifc attributes relevent to gas car like kWhperMile, numberOfElectricEngines, and changeConnectorType
	constuctor uses super to populate attributes shared among all cars
	for type specifc attributes uses this
	override car's toString to print type specific information
*/

class ElectricCar extends Car {
	private double kWhPerMile;
	private int numberOfElectricEngines;
	private String chargeConnectorType;

	public ElectricCar(String vinNumber, int numPassengers, String modelName, int year, double kWhPerMile, int numberOfElectricEngines, String chargeConnectorType) {
		super(vinNumber, CarType.ELECTRIC, numPassengers, modelName, year);
		this.kWhPerMile = kWhPerMile;
		this.numberOfElectricEngines = numberOfElectricEngines;
		this.chargeConnectorType = chargeConnectorType;
	}

	public double getKWhPerMile() {
		return kWhPerMile;
	}

	public int getNumberOfElectricEngines() {
		return numberOfElectricEngines;
	}

	public String getChargeConnectorType() {
		return chargeConnectorType;
	}

	public void setKWhPerMile(double kWhPerMile) {
		this.kWhPerMile = kWhPerMile;
	}

	public void setNumberOfElectricEngines(int numberOfElectricEngines) {
		this.numberOfElectricEngines = numberOfElectricEngines;
	}

	public void setChargeConnectorType(String chargeConnectorType) {
		this.chargeConnectorType = chargeConnectorType;
	}

	@Override
	public String DriveTrain() {
		return String.format("Vin: %s, Model: %s, Year: %d, kWh/Mile: %.2f, Number of Electric Engines: %d, Charge Connector Type: %s", getVinNumber(), getModelName(), getYear(), kWhPerMile, numberOfElectricEngines, chargeConnectorType);
	}

	@Override
	public String toString() {
		return DriveTrain();
	}
}
