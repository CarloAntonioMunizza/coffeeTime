package Homework.HW4;

/*
Carlo Munizza Cam7134@psu.edu.
I declare that what has been written in this work has been written by me and that
no part has been copied from scientific publications, the Internet or from other
online sources or was already presented in the academic field by me or by other
students.
*/

/*
	create team object and add employees to it
	create SalariedEmployee object and set salary
	create HourlyEmployee object and set hourly wage and hours worked
	create CommissionEmployee object and set commission and sales
	create BasePlusCommissionEmployee object and set commission and sales
	add employees to team
	print team
	print total wages
	remove employee
	create new employee and add to team
	print team
	print total wages
*/

public class Main {
	public static void main(String[] args) {
		Team team1 = new Team("Team 1", new Employee[0]); // create team object

		SalariedEmployee employee = new SalariedEmployee("Jim", 1, "1234 Street", 123456789); // create SalariedEmployee object
		employee.setSalary(2000); // set salary

		HourlyEmployee employee1 = new HourlyEmployee("daniels", 2, "6431 Street", 123456789); // create HourlyEmployee object
		employee1.setHourlyWage(10); // set hourly wage
		employee1.setHoursWorked(100); // set hours worked

		CommissionEmployee employee2 = new CommissionEmployee("Jack", 3, "8926 Street", 123456789); // create CommissionEmployee object
		employee2.setCommission(0.10); // set commission
		employee2.setSales(1000); // set sales

		BasePlusCommissionEmployee employee3 = new BasePlusCommissionEmployee("Beam", 4, "4132 Street", 123456789); // create BasePlusCommissionEmployee object
		employee3.setCommission(0.40); // set commission
		employee3.setSales(500); // set sales
		employee3.setBaseSalary(2000); // set base salary

		team1.addEmployee(employee); // add employees to team
		team1.addEmployee(employee1); // add employees to team
		team1.addEmployee(employee2); // add employees to team
		team1.addEmployee(employee3); // add employees to team

		System.out.println(team1); // print team

		System.out.println(team1.getTeamPay() + "\n"); // print total wages

		team1.removeEmployee(employee1); // remove employee

		HourlyEmployee employee4 = new HourlyEmployee("Maker", 5, "4629 Street", 123456789); // create new employee
		employee4.setHourlyWage(50); // set hourly wage
		employee4.setHoursWorked(200); // set hours worked
		team1.addEmployee(employee4); // add new employee to team

		System.out.println(team1); // print team
		System.out.println(team1.getTeamPay() + "\n"); // print total wages
	}
}
