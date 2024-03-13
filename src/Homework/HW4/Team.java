package Homework.HW4;

/*
Carlo Munizza Cam7134@psu.edu.
I declare that what has been written in this work has been written by me and that
no part has been copied from scientific publications, the Internet or from other
online sources or was already presented in the academic field by me or by other
students.
*/

/*
	private string attribute teamName
	private Employee[] attribute employees
	create constructor with parameters teamName, employees
	create a getter for teamName
	create a getter for employees
	create a setter for teamName
	create a setter for employees
	create a method getTeamPay that returns the total pay of all employees
	create a method addEmployee that adds an employee to the employees array
	create a method removeEmployee that removes an employee from the employees array
	create a toString method that returns the teamName and all employees
*/

public class Team {
	private String teamName; // private string attribute teamName
	private Employee[] employees; // private Employee[] attribute employees

	public Team(String teamName, Employee[] employees) { // create constructor with parameters teamName, employees
		this.teamName = teamName; // set the teamName to the parameter
		this.employees = employees; // set the employees to the parameter
	}

	public String getTeamName() { // create a getter for teamName
		return teamName; // return the teamName
	}

	public Employee[] getEmployees() { // create a getter for employees
		return employees; // return the employees
	}

	public void setTeamName(String teamName) { // create a setter for teamName
		this.teamName = teamName; // set the teamName to the parameter
	}

	public void setEmployees(Employee[] employees) { // create a setter for employees
		this.employees = employees; // set the employees to the parameter
	}

	public double getTeamPay() { // create a method getTeamPay that returns the total pay of all employees
		double totalPay = 0; // create a double variable totalPay and set it to 0
		for (Employee employee : employees) { // for each employee in the employees array
			totalPay += employee.wageCalculation(); // add the result of the wageCalculation method to totalPay
		}
		return totalPay; // return totalPay
	}

	public void addEmployee(Employee employee){ // create a method addEmployee that adds an employee to the employees array
		Employee[] newEmployees = new Employee[employees.length + 1]; // create a new Employee array with a length of employees.length + 1
		for (int i = 0; i < employees.length; i++) { // for each employee in the employees array
			newEmployees[i] = employees[i]; // set the newEmployees[i] to employees[i]
		}
		newEmployees[employees.length] = employee; // set the newEmployees[employees.length] to the parameter
		employees = newEmployees; // set the employees to the newEmployees
	}

	public void removeEmployee(Employee employee){ // create a method removeEmployee that removes an employee from the employees array
		Employee[] newEmployees = new Employee[employees.length - 1]; // create a new Employee array with a length of employees.length - 1
		int j = 0; // create an int variable j and set it to 0
		for (int i = 0; i < employees.length; i++) { // for each employee in the employees array
			if (employees[i] != employee) { // if the employee is not the parameter
				newEmployees[j] = employees[i]; // set the newEmployees[j] to employees[i]
				j++; // increment j
			}
		}
		employees = newEmployees; // set the employees to the newEmployees
	}

	public String toString() { // create a toString method that returns the teamName and all employees
		String output = "Team Name: " + teamName + "\n"; // create a string variable output and set it to "Team Name: " + teamName + "\n"
		for (Employee employee : employees) { // for each employee in the employees array
			output += employee.toString() + "\n"; // add the result of the toString method to output
		}
		return output; // return output
	}
}
