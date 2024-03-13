package Homework.HW4;

/*
Carlo Munizza Cam7134@psu.edu.
I declare that what has been written in this work has been written by me and that
no part has been copied from scientific publications, the Internet or from other
online sources or was already presented in the academic field by me or by other
students.
*/

/*
	create private int attribute HoursWorked
	create private double attribute HourlyWage
	create constructor with parameters Name, EmployeeID, Address, PhoneNumber
	create a setter for HoursWorked
	create a setter for HourlyWage
	create a getter for HoursWorked
	create a getter for HourlyWage
	create a method wageCalculation that returns HoursWorked * HourlyWage
	create a toString method that returns the toString from the super class and HoursWorked and HourlyWage
*/

public class HourlyEmployee extends Employee{
	private int HoursWorked; // private int attribute HoursWorked
	private double HourlyWage; // private double attribute HourlyWage

	public HourlyEmployee(String Name, int EmployeeID, String Address, int PhoneNumber) { // create constructor with parameters Name, EmployeeID, Address, PhoneNumber
		super(Name, EmployeeID, Address, PhoneNumber); // calls the super constructor
	}

	public void setHoursWorked(int HoursWorked) { // create a setter for HoursWorked
		this.HoursWorked = HoursWorked; // sets the HoursWorked attribute to the parameter
	}

	public void setHourlyWage(double HourlyWage) { // create a setter for HourlyWage
		this.HourlyWage = HourlyWage; // sets the HourlyWage attribute to the parameter
	}

	public int getHoursWorked() { // create a getter for HoursWorked
		return HoursWorked; // returns the HoursWorked attribute
	}

	public double getHourlyWage() { // create a getter for HourlyWage
		return HourlyWage; // returns the HourlyWage attribute
	}

	public double wageCalculation() { // create a method wageCalculation that returns HoursWorked * HourlyWage
		return HoursWorked * HourlyWage; // returns the product of HoursWorked and HourlyWage
	}

	public String toString() { // create a toString method that returns the toString from the super class and HoursWorked and HourlyWage
		return super.toString() + "\nHours Worked: " + getHoursWorked() + "\nHourly Wage: " + getHourlyWage(); // returns the toString from the super class and HoursWorked and HourlyWage
	}
}
