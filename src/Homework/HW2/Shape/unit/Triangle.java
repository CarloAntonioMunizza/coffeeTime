package Homework.HW2.Shape.unit;

/*
Carlo Munizza Cam7134@psu.edu.
I declare that what has been written in this work has been written by me and that
no part has been copied from scientific publications, the Internet or from other
online sources or was already presented in the academic field by me or by other
students.
*/

/*
	abstract class triangle prints triangle and width
	initialize an array the size of the width with spaces
	make a for loop that iterates from the width to 0
	    add an asterisk to the end of the array
		print the array
*/

import Homework.HW2.Shape.unit.Shape;

import java.util.Arrays;

public class Triangle extends Shape {
	@Override
	void display(int width) {
		System.out.println("This is a triangle"); // Print the triangle
		System.out.println("Width: "+ width); // Print the width
		char[] layer = new char[width]; // Create an array of characters the size of the width
		Arrays.fill(layer, ' '); // Fill the array with spaces

		for(int i = width - 1; i > -1; i--) { // Iterate from the width to 0
			layer[i] = '*'; // Add an asterisk to the end of the array
			System.out.println(layer); // Print the array
		}
	}
}
