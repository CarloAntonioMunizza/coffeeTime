package Labs.Lab6;

/*
	class gas car inherits Car
	has specifc attributes relevent to gas car like gallonsPerMile, recommendedFuelGrade, and motorOilGrade
	constuctor uses super to populate attributes shared among all cars
	for type specifc attributes uses this
	override car's toString to print type specific information
*/
class GasCar extends Car {
	private double gallonsPerMile;
	private String recommendedFuelGrade;
	private String motorOilGrade;

	public GasCar(String vinNumber, int numPassengers, String modelName, int year, double gallonsPerMile, String recommendedFuelGrade, String motorOilGrade) {
		super(vinNumber, CarType.GAS, numPassengers, modelName, year);
		this.gallonsPerMile = gallonsPerMile;
		this.recommendedFuelGrade = recommendedFuelGrade;
		this.motorOilGrade = motorOilGrade;
	}

	public double getGallonsPerMile() {
		return gallonsPerMile;
	}

	public String getRecommendedFuelGrade() {
		return recommendedFuelGrade;
	}

	public String getMotorOilGrade() {
		return motorOilGrade;
	}

	public void setGallonsPerMile(double gallonsPerMile) {
		this.gallonsPerMile = gallonsPerMile;
	}

	public void setRecommendedFuelGrade(String recommendedFuelGrade) {
		this.recommendedFuelGrade = recommendedFuelGrade;
	}

	public void setMotorOilGrade(String motorOilGrade) {
		this.motorOilGrade = motorOilGrade;
	}

	@Override
	public String DriveTrain() {
		return String.format("Vin: %s, Model: %s, Year: %d, Gallons/Mile: %.2f, Recommended Fuel Grade: %s, Motor Oil Grade: %s", getVinNumber(), getModelName(), getYear(), gallonsPerMile, recommendedFuelGrade, motorOilGrade);
	}

	@Override
	public String toString() {
		return DriveTrain();
	}
}
