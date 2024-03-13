package Homework.HW4;

/*
Carlo Munizza Cam7134@psu.edu.
I declare that what has been written in this work has been written by me and that
no part has been copied from scientific publications, the Internet or from other
online sources or was already presented in the academic field by me or by other
students.
*/

/*
	private string attribute Name
	private int attribute EmployeeID
	private string attribute Address
	private int attribute PhoneNumber
	create constructor with parameters Name, EmployeeID, Address, PhoneNumber
	create a setter for Name
	create a setter for EmployeeID
	create a setter for Address
	create a setter for PhoneNumber
	create a getter for Name
	create a getter for EmployeeID
	create a getter for Address
	create a getter for PhoneNumber
	create a method wageCalculation that returns 0
	create a toString method that returns the Name, EmployeeID, Address, and PhoneNumber
*/

public class Employee {
	private String Name;
	private int EmployeeID;
	private String Address;
	private int PhoneNumber;

	public Employee(String Name, int EmployeeID, String Address, int PhoneNumber) {
		setName(Name);
		setEmployeeID(EmployeeID);
		setAddress(Address);
		setPhoneNumber(PhoneNumber);
	}

	private void setName(String Name) {
		this.Name = Name;
	}

	private void setEmployeeID(int EmployeeID) {
		this.EmployeeID = EmployeeID;
	}

	private void setAddress(String Address) {
		this.Address = Address;
	}

	private void setPhoneNumber(int PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}

	private String getName() {
		return Name;
	}

	private int getEmployeeID() {
		return EmployeeID;
	}

	private String getAddress() {
		return Address;
	}

	private int getPhoneNumber() {
		return PhoneNumber;
	}

	public double wageCalculation() {
		return 0;
	}

	public String toString() {
		return "\nName: " + getName() + "\nEmployee ID: " + getEmployeeID() + "\nAddress: " + getAddress() + "\nPhone Number: " + getPhoneNumber();
	}
}
