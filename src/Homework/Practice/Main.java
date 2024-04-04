package Homework.Practice;

public class Main {
	public static void main(String[] Args){
		Car car1 = new Convertible("Nissan Altima", 4, 5, "Mesh");
		System.out.println(car1);

		Car car2 = new Convertible("Dodge Charger", 3, 1, "Metal");
		System.out.println(car2);

		Car car3 = new SuperCar("Hellcat",6, 4, "V8");
		System.out.println(car3);

		Aircraft air1 = new Helicopter("buzzard", true, 4, 3);
		System.out.println(air1);

		car1.Operate();
		air1.Operate();
	}

	public static abstract class Car implements Interface{
		private String name;
		private int wheels;
		private int doors;

		public Car(String name, int wheels, int doors){
			this.name = name;
			this.wheels = wheels;
			this.doors = doors;
		}

		public String getName(){
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getWheels(){
			return wheels;
		}

		public void setWheels(int wheels){
			this.wheels = wheels;
		}

		public int getDoors(){
			return doors;
		}

		public void setDoors(int doors){
			this.doors = doors;
		}

		public void Operate(){
			System.out.println("I am Driving ");
		}

		public String toString(){
			return "\nName : " + name +"\nWheels: " + wheels + "\nDoors: " + doors;
		}
	}

	public static class Convertible extends Car implements Interface{
		private String roofType;

		public Convertible(String name, int wheels, int doors, String roofType){
			super(name, wheels, doors);
			this.roofType = roofType;
		}

		public String getRoofType(){
			return roofType;
		}

		public void setRoofType(String roofType){
			this.roofType = roofType;
		}

		public void Operate(){
			super.Operate();
			System.out.println("a Convertible\n");
		}

		public String toString(){
			return super.toString() + "\nRoof Type: " + roofType;
		}
	}

	public static class SuperCar extends Car implements Interface{
		private String engine;

		public SuperCar(String name, int wheels, int doors, String engine) {
			super(name, wheels, doors);
			this.engine = engine;
		}

		public String getEngine() {
			return engine;
		}

		public void setEngine() {
			this.engine = engine;
		}

		public void Operate(){
			super.Operate();
			System.out.println("a Super Car\n");
		}

		public String toString() {
			return super.toString() + "\nEngine: " + engine;
		}
	}

	public static abstract class Aircraft{
		private String name;
		private boolean hasPropeller;
		private int passengers;

		public Aircraft(String name, boolean hasPropeller, int passengers){
			this.name = name;
			this.hasPropeller = hasPropeller;
			this.passengers = passengers;
		}

		public String getName(){
			return name;
		}

		public void setName(String name){
			this.name = name;
		}

		public boolean getHasPropeller(){
			return hasPropeller;
		}

		public void setHasPropeller(boolean hasPropeller){
			this.hasPropeller = hasPropeller;
		}

		public int getPassengers(){
			return passengers;
		}

		public void setPassengers(int passengers){
			this.passengers = passengers;
		}

		public void Operate(){
			System.out.println("I am Flying ");
		}

		public String toString(){
			return "\nName: " + name + "\nHas Propeller: " + hasPropeller + "\nPassengers: "+ passengers;
		}
	}

	public static class Helicopter extends Aircraft{
		private int rotors;

		public Helicopter(String name, boolean hasPropeller, int passengers, int rotors){
			super(name, hasPropeller, passengers);
			this.rotors = rotors;
		}

		public int getRotors(){
			return rotors;
		}

		public void setRotors(int rotors){
			this.rotors = rotors;
		}

		public void Operate(){
			super.Operate();
			System.out.println("a Helicopter\n");
		}

		public String toString(){
			return super.toString() + "\nRotors: " + rotors + "\n";
		}
	}

	public interface Interface{
		void Operate();
	}
}


