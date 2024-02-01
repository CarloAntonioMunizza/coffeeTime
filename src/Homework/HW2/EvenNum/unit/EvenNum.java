package Homework.HW2.EvenNum.unit;

import java.util.Scanner;

/*
Carlo Munizza Cam7134@psu.edu.
I declare that what has been written in this work has been written by me and that
no part has been copied from scientific publications, the Internet or from other
online sources or was already presented in the academic field by me or by other
students.
*/

/*
	This class is used to calculate the sum of all even numbers between two numbers.

	prompt user for start number
	read user input
	check if the start number is valid (greater than 0)
	prompt user for end number
	read user input
	check if the end number is valid (greater than 0)

	build an array of all even numbers between the two numbers
	print the sum of the array
*/

public class EvenNum{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Create a Scanner object
		EvenNum evenNum = new EvenNum(); // Create an EvenNum object

		System.out.println("Enter The Start Number: "); // Prompt user for start number
		int start = scanner.nextInt(); // Read user input
		evenNum.checkStart(start); // Check if the start number is valid (greater than 0)

		System.out.println("Enter The End Number: "); // Prompt user for end number
		int end = scanner.nextInt(); // Read user input
		evenNum.checkEnd(end); // Check if the end number is valid (greater than 0)
		scanner.close(); // Close scanner

		int evenArray[] = evenNum.run(start, end); // Build an array of all even numbers between the two numbers

		System.out.println(); // Print a blank line
		System.out.println(evenNum.sumArray(evenArray)); // Print the sum of the array
	}

	public int[] run(int start, int end) { // Check if the start number is valid
		checkStartAndEnd(start, end); // Check if the start number is valid
		int[] evenArray = evenNumArray(start, end); // Build an array of all even numbers between the two numbers
		System.out.println("Numbers Used In Total Calculation are: "); // Print the array

		for (int i = 0; i < evenArray.length; i++) {	// Print the array on one line
			// Print the array opn one line
			System.out.print(evenArray[i] + " ");
		}
		return evenArray;
	}

	public boolean checkStart(int start) {
		if(start > 0){ // Check if the start number is valid
			return true;
		}
		throw new IllegalArgumentException("Start number less than 1"); // Throw an exception if the start number is invalid
	}

	public boolean checkEnd(int end) {
		if(end > 0){ // Check if the end number is valid
			return true;
		}
		throw new IllegalArgumentException("End number less than 1"); // Throw an exception if the end number is invalid
	}

	public boolean checkStartAndEnd(int start, int end) {
		if(start > end){ // Check if the start number is valid
			throw new IllegalArgumentException("Start number is greater than end number"); // Throw an exception if the start number is invalid
		}
		else if(start == end){ // Check if the start number is valid
			throw new IllegalArgumentException("Start number is equal to end number"); // Throw an exception if the start number is invalid
		}
		return true;
	}

	public int getSize(int start, int end) {
		if(start % 2 == 0) { // Check if the start number is even
			int size = 1; // Set the size of the array to 1
		}
		int size = 0; // Set the size of the array to 0

		for (int i = start; i <= end; i++) { // Loop through all numbers between the start and end numbers
			if (i % 2 == 0) { // Check if the number is even
				size++;
			}
		}

		if(size < 1){ // Check if the size of the array is less than 1
			throw new IllegalArgumentException("Array size is less than 1"); // Throw an exception if the size of the array is less than 1
		}
		return size;
	}

	public int[] evenNumArray(int start, int end) {
		int size = getSize(start, end); // Get the size of the array
		int[] evenArray = new int[size]; // Create an array of the size of the array
		int diff = end - start; // Get the difference between the start and end numbers

		int index = 0; // Set the index of the array to 0
		for(int i = 0; i <= diff; i++){ // Loop through all numbers between the start and end numbers
			if((start + i) % 2 == 0){ // Check if the number is even
				evenArray[index] = start + i; // Add the number to the array
				index++;
			}
		}
		return evenArray;
	}

	public int sumArray(int[] evenArray) {
		int sum = 0;
		for (int i = 0; i < evenArray.length; i++) { // Loop through all numbers in the array
			sum += evenArray[i]; // Add the number to the sum
		}
		System.out.println("Sum of all even numbers is:");
		return sum;
	}
}