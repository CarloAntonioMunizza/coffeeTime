package Homework.HW4;

/*
Carlo Munizza Cam7134@psu.edu.
I declare that what has been written in this work has been written by me and that
no part has been copied from scientific publications, the Internet or from other
online sources or was already presented in the academic field by me or by other
students.
*/

/*
	private double attribute Salary
	create constructor with parameters Name, EmployeeID, Address, PhoneNumber
	create a setter for Salary
	create a getter for Salary
	create a method wageCalculation that returns Salary
	create a toString method that returns the Name, EmployeeID, Address, PhoneNumber, and Salary
*/

public class SalariedEmployee extends Employee{
	private double Salary; // private double attribute Salary

	public SalariedEmployee(String Name, int EmployeeID, String Address, int PhoneNumber) { // create constructor with parameters Name, EmployeeID, Address, PhoneNumber
		super(Name, EmployeeID, Address, PhoneNumber); // calls the super constructor
	}

	public double wageCalculation() { // create a method wageCalculation that returns Salary
		return Salary; // return Salary
	}

	public void setSalary(double Salary) { // create a setter for Salary
		this.Salary = Salary; // set the Salary to the parameter
	}

	public double getSalary() { // create a getter for Salary
		return Salary; // return the Salary
	}

	public String toString() { // create a toString method that returns the Name, EmployeeID, Address, PhoneNumber, and Salary
		return super.toString() + "\nSalary: " + getSalary(); // return the Name, EmployeeID, Address, PhoneNumber, and Salary
	}
}
