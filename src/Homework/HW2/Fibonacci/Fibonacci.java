package Homework.HW2.Fibonacci;

/*
Carlo Munizza Cam7134@psu.edu.
I declare that what has been written in this work has been written by me and that
no part has been copied from scientific publications, the Internet or from other
online sources or was already presented in the academic field by me or by other
students.
*/

/*
	This program calculates and prints the Fibonacci sequence up 50.
	initalizes the first two numbers in the sequence
	prints the first two numbers in the sequence
	create a for loop and loop 50 times
		calculates the next number in the sequence by adding the first and second number
		prints the next number in the sequence
		sets the first number to the second number
		sets the second number to the next number
*/

public class Fibonacci {
	public static void main(String[] args) {
		int firstNum = 0; // Initialize the first number in the sequence
		int secondNum = 1; // Initialize the second number in the sequence
		int nextNum; // Initialize the next number in the sequence

		System.out.print(firstNum + " " + secondNum); // Print the first two numbers in the sequence

		for (int i = 2; i < 50; ++i) { // Calculate and print the rest of the sequence
			nextNum = firstNum + secondNum; // Calculate the next number in the sequence
			System.out.print(" " + nextNum); // Print the next number in the sequence
			firstNum = secondNum; // Set the first number to the second number
			secondNum = nextNum; // Set the second number to the next number
		}
	}
}
