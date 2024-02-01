package Homework.HW2.Shape.unit;

import java.util.Scanner;

/*
Carlo Munizza Cam7134@psu.edu.
I declare that what has been written in this work has been written by me and that
no part has been copied from scientific publications, the Internet or from other
online sources or was already presented in the academic field by me or by other
students.
*/

/*
	ShapeMain class provides a method to run the program
	asks the user for a choice and width
	creates a shape object based on the choice
	displays the shape
*/

public class ShapeMain{
	public static void main(String[] args) {
		new ShapeMain().run();
	}

	public void run() {
		Scanner scanner = new Scanner(System.in); // Create a Scanner object

		System.out.println("Enter 1 for Triangle, 2 for Arrow:"); // Prompt user
		int choice = scanner.nextInt(); // Read user input
		choice = checkChoice(choice); // Check if the choice is valid

		System.out.println("Enter width:"); // Prompt user
		int width = scanner.nextInt(); // Read user input
		width = checkWidth(width); // Check if the width is valid
		scanner.close(); // Close the scanner

		Shape shape = null; // Create a Shape object
		if(choice == 1) { // If the choice is 1
			shape = new Triangle(); // Create a Triangle object
		} else if(choice == 2) { // If the choice is 2
			shape = new Arrow(); // Create an Arrow object
		}

		shape.display(width); // Display the shape
	}

	public int checkChoice(int choice) { // Check if the choice is valid
		if(choice != 1 && choice != 2) { // If the choice is not 1 or 2
			throw new IllegalArgumentException("Invalid choice"); // Throw an exception
		}
		return  choice; // Return the choice
	}

	public int checkWidth(int width) { // Check if the width is valid
		if(width < 2) { // If the width is less than 2
			throw new IllegalArgumentException("Width less than 2"); // Throw an exception
		}
		return width; // Return the width
	}
}
