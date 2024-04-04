package Labs.Lab8;
/*
Carlo Munizza Cam7134@psu.edu.
I declare that what has been written in this work has been written by me and that
no part has been copied from scientific publications, the Internet or from other
online sources or was already presented in the academic field by me or by other
students.
*/

/*
	made a bank class that stores all basic operations
    deposit throws an exception if the amount is over 10k
    withdraw throws an exception if the amount is over the balance
    main class tests all the exceptions
    custom exception class overdrawnException extends Exception
    overdrawnException has a custom message
    custom exception class depositException extends Exception
    depositException has a custom message
*/

public class Main {
	public static void main(String args[]){
		bank account = new bank(1000); // starting balance of 1000

		System.out.println("Balance: " + account.getBalance()); // prints balance of 1000

		try{
			account.withdraw(100); // withdraw 100
			System.out.println("Balance: " + account.getBalance()); // prints balance of 900
		}catch(overdrawnException e){ // catches overdrawnException
			System.out.println(e.getMessage()); // prints custom message
		}

		try {
			account.withdraw(1000); // withdraw 1000
			System.out.println("Balance: " + account.getBalance()); // prints balance of 900
		} catch (overdrawnException e) { // catches overdrawnException
			System.out.println(e.getMessage()); // prints custom message
		}

		try {
			account.deposit(1000); // deposit 1000
			System.out.println("Balance: " + account.getBalance()); // prints balance of 1900
		}catch(depositException e){ // catches depositException
			System.out.println(e.getMessage()); // prints custom message
		}

		try {
			account.deposit(10000); // deposit 10000
			System.out.println("Balance: " + account.getBalance()); // does not print balance due to exception
		}catch(depositException e){ // catches depositException
			System.out.println(e.getMessage()); // prints custom message
		}
	}

	public static class bank{ // bank class
		double balance = 0; // balance variable

		public bank(double balance){ // constructor
			this.balance = balance; // sets balance to input
		}

		public void deposit(double amount) throws depositException{ // deposit function throws depositException
			if(amount >= 10000){ // if amount is over 10k
				throw new depositException(); // throw depositException
			}
			balance += amount; // add amount to balance
		}

		public void withdraw(double amount) throws overdrawnException{ // withdraw function throws overdrawnException
			if(balance - amount < 0){ // if balance - amount is less than 0
				throw new overdrawnException(); // throw overdrawnException
			}
			balance -= amount; // subtract amount from balance
		}

		public double getBalance(){ // get balance function
			return balance; // return balance
		}
	}

	public static class overdrawnException extends Exception{ // overdrawnException class
		public overdrawnException(){ // constructor
			super("Overdrawn Exception"); // custom message
		}
	}

	public static class depositException extends Exception{ // depositException class
		public depositException(){ // constructor
			super("Cannot deposit over 10k"); // custom message
		}
	}
}
