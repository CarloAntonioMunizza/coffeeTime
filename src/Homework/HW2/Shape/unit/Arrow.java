package Homework.HW2.Shape.unit;

/*
Carlo Munizza Cam7134@psu.edu.
I declare that what has been written in this work has been written by me and that
no part has been copied from scientific publications, the Internet or from other
online sources or was already presented in the academic field by me or by other
students.
*/

/*
	abstract class Arrow prints Arrow and width
	initialize an array the size of the width with spaces
	make a for loop that iterates from 0 to the width
	    add an asterisks to the start of the array
		print the array
	print the array filled with asterisks
	make a for loop that iterates from the width to 0
	    add an asterisk to the end of the array
		print the array
*/

import java.util.Arrays;

public class Arrow extends Shape {
	@Override
	void display(int width){ // Display the arrow
		System.out.println("This is an arrow"); // Print the arrow
		System.out.println("Width: "+ width); // Print the width

		char[] layer = new char[width]; // Create an array of characters the size of the width
		Arrays.fill(layer, ' '); // Fill the array with spaces

		for(int i = 0; i <= width - 1; i++) { // Iterate from 0 to the width
			layer[i] = '*'; // Add an asterisk to the start of the array
			System.out.println(layer); // Print the array
		}

		for(int i = width - 1; i > 0; i--) { // Iterate from the width to 0
			layer[i] = ' '; // Add an asterisk to the end of the array
			System.out.println(layer); // Print the array
		}
	}
}
