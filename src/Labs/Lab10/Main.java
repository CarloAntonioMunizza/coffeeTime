package Labs.Lab10;

/*
Carlo Munizza Cam7134@psu.edu.
I declare that what has been written in this work has been written by me and that
no part has been copied from scientific publications, the Internet or from other
online sources or was already presented in the academic field by me or by other
students.
*/

/*
	Create a program that reads and writes to a file
	Create a while loop that reads from a file, writes to a file, or ends the program
	When reading from a file, read the contents of the file and print them to the console
	When writing to a file, write the user's input to the file
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // Create a scanner object
		String fileName = "userInputs.txt"; // Create a file name

		int choice; // Create a variable to store the user's choice

		while(true) { // Create a while loop that reads from a file, writes to a file, or ends the program
			System.out.println("Enter 1 to read from a file, 2 to write to a file, anything else ends program: "); // Prompt the user for input
			choice = scanner.nextInt(); // Get the user's input
			scanner.nextLine(); // Clear the scanner buffer

			if (choice == 1) { // When reading from a file, read the contents of the file and print them to the console
				try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) { // Create a buffered reader object
					String line; // Create a variable to store the line
					while ((line = reader.readLine()) != null) { // Read the file line by line
						System.out.println(line); // Print the line
					}
				} catch (IOException e) { // Catch an IOException
					System.out.println("An error occurred: " + e.getMessage()); // Print the error message
				}
			} else if (choice == 2) { // When writing to a file, write the user's input to the file
				try (FileWriter writer = new FileWriter(fileName)) { // Create a file writer object
					System.out.println("Enter strings to save to the file. Enter '#END#' to stop."); // Prompt the user for input

					while (true) { // Create a while loop to get the user's input
						String input = scanner.nextLine(); // Get the user's input

						if ("#END#".equals(input)) { // Check if the user entered '#END#'
							break;
						}
						writer.write(input + System.lineSeparator()); // Write the user's input to the file
					}
					System.out.println("Inputs have been saved to " + fileName); // Print a message
				} catch (IOException e) { // Catch an IOException
					System.out.println("An error occurred: " + e.getMessage()); // Print the error message
				}
			} else{
				scanner.close(); // Close the scanner
				System.out.println("End."); // Print a message
				break;
			}
		}
	}
}

