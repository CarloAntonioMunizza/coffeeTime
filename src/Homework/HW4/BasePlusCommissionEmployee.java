package Homework.HW4;

/*
Carlo Munizza Cam7134@psu.edu.
I declare that what has been written in this work has been written by me and that
no part has been copied from scientific publications, the Internet or from other
online sources or was already presented in the academic field by me or by other
students.
*/

/*
	initialize a private double attribute BaseSalary
	create a constructor that takes in 4 parameters and calls the super constructor
	create a setter for BaseSalary
	create a getter for BaseSalary
	create a method wageCalculation that returns the sum of the wageCalculation from the super class and BaseSalary
	create a toString method that returns the toString from the super class and the BaseSalary
*/

public class BasePlusCommissionEmployee extends CommissionEmployee{
	private double BaseSalary; // private double attribute BaseSalary

	public BasePlusCommissionEmployee(String Name, int EmployeeID, String Address, int PhoneNumber) { // create a constructor that takes in 4 parameters and calls the super constructor
		super(Name, EmployeeID, Address, PhoneNumber); // calls the super constructor
	}

	public void setBaseSalary(double BaseSalary) { // create a setter for BaseSalary
		this.BaseSalary = BaseSalary; // set the BaseSalary to the parameter
	}

	public double getBaseSalary() { // create a getter for BaseSalary
		return BaseSalary; // return the BaseSalary
	}

	public double wageCalculation() { // create a method wageCalculation that returns the sum of the wageCalculation from the super class and BaseSalary
		return super.wageCalculation() + BaseSalary; // return the sum of the wageCalculation from the super class and BaseSalary
	}

	public String toString() { // create a toString method that returns the toString from the super class and the BaseSalary
		return super.toString() + "\nBase Salary: " + getBaseSalary(); // return the toString from the super class and the BaseSalary
	}
}
