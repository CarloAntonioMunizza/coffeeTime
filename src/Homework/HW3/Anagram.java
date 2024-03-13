package Homework.HW3;
import java.util.Scanner;

/*
Carlo Munizza Cam7134@psu.edu.
I declare that what has been written in this work has been written by me and that
no part has been copied from scientific publications, the Internet or from other
online sources or was already presented in the academic field by me or by other
students.
*/

/*
 	create a new Scanner
	prompt the user to enter a word
	get the user input
	prompt the user to enter a word to check if it is an anagram
	get the user input
	close the Scanner
 	call isAnagram with the two words as arguments
 	print the result

 	isAnagram method
 		if the lengths of the two words are different
 			return false
 		create an array of 26 integers
 		for each character in the first word
 			increment the corresponding element in the array
 		for each character in the second word
 			decrement the corresponding element in the array
 		for each element in the array
 			if the element is not 0
 				return false
 		return true

*/

public class Anagram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Create a new Scanner
		System.out.println("Enter a word: "); // Prompt the user to enter a word
		String base = scanner.nextLine(); // Get the user input
		System.out.println("Enter a word to check if it is an anagram: "); // Prompt the user to enter a word to check if it is an anagram
		String anagram = scanner.nextLine(); // Get the user input
		scanner.close(); // Close the Scanner

		boolean result = isAnagram(base, anagram); // Call isAnagram with the two words as arguments
		System.out.println("Is " + base + "an anagram of " + anagram + "?"); // Print the result
		System.out.println(result); // Print the result
	}

	public static boolean isAnagram(String base, String anagram) { // isAnagram method
		if (base.length() != anagram.length()) { // If the lengths of the two words are different
			return false; // return false
		}

		int[] charCount = new int[26]; // Create an array of 26 integers

		for (int i = 0; i < base.length(); i++) { // For each character in the first word
			charCount[base.charAt(i) - 'a']++; // Increment the corresponding element in the array
			charCount[anagram.charAt(i) - 'a']--; // Decrement the corresponding element in the array
		}

		for (int count : charCount) { // For each element in the array
			if (count != 0) { // If the element is not 0
				return false; // return false
			}
		}
		return true; // return true
	}
}
