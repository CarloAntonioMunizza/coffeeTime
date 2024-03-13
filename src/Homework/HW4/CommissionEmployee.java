package Homework.HW4;

/*
Carlo Munizza Cam7134@psu.edu.
I declare that what has been written in this work has been written by me and that
no part has been copied from scientific publications, the Internet or from other
online sources or was already presented in the academic field by me or by other
students.
*/

/*
	This class is a subclass of Employee
	private double attribute Commission
	private int attribute Sales
	Constructor with parameters Name, EmployeeID, Address, PhoneNumber
	setCommission method
	setSales method
	getCommission method
	getSales method
	wageCalculation method
	toString method
*/

public class CommissionEmployee extends Employee{
	private double Commission; //Commission rate
	private int Sales; //Number of sales

	public CommissionEmployee(String Name, int EmployeeID, String Address, int PhoneNumber) { //Constructor
		super(Name, EmployeeID, Address, PhoneNumber); //Calls the constructor of the superclass
	}

	public void setCommission(double Commission) { //Setter for Commission
		this.Commission = Commission; //Sets the Commission to the parameter
	}

	public void setSales(int Sales) { //Setter for Sales
		this.Sales = Sales; //Sets the Sales to the parameter
	}

	public double getCommission() { //Getter for Commission
		return Commission; //Returns the Commission
	}

	public int getSales() { //Getter for Sales
		return Sales; //Returns the Sales
	}

	public double wageCalculation() { //Calculates the wage
		return Commission * Sales; //Returns the wage
	}

	public String toString() { //Returns the string representation of the object
		return super.toString() + "\nCommission: " + getCommission() + "\nSales: " + getSales(); //Returns the string representation of the object
	}
}
