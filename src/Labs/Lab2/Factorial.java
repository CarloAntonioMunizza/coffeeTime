/*
Carlo Munizza Cam7134@psu.edu.
I declare that what has been written in this work has been written by me and that
no part has been copied from scientific publications, the Internet or from other
online sources or was already presented in the academic field by me or by other
students.
*/
package Labs.Lab2;
import java.util.Scanner;

/*
	ask user for a number
	loop from 1 to number
		multiply factorial by i
	print factorial
*/

public class Factorial {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in); // create scanner object
		System.out.println("Enter a Integer: ");
		int num = S.nextInt(); // get user input
		int factorial = 1; // initialize factorial t0 1

		for (int i = 1; i <= num; i++) { // loop from 1 to num
			factorial *= i; // multiply factorial by i
		}

		System.out.printf("The %d = %d\n", num, factorial);
	}
}
