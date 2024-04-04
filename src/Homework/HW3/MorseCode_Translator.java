package Homework.HW3;

/*
Carlo Munizza Cam7134@psu.edu.
I declare that what has been written in this work has been written by me and that
no part has been copied from scientific publications, the Internet or from other
online sources or was already presented in the academic field by me or by other
students.
*/

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

/*
	toMorse method
		create a new StringBuilder
		convert the input to uppercase
		for each character in the input
			get the morse code for the character
			append the morse code to the StringBuilder
		return the StringBuilder as a string

	toEnglish method
		create a new StringBuilder
		for each morse character in the input
			get the english character for the morse character
			append the english character to the StringBuilder
		return the StringBuilder as a string

	temp.main method
		create a new Scanner
		while true
			prompt the user to enter a word or sentence to translate to Morse code
			get the user input
			if the user input is "exit"
				break the loop
			print the Morse code for the user input
			print the English translation for the Morse code
*/

public class MorseCode_Translator {
	private static final Map<String, String> morseCode = new HashMap<String, String>() {{ // Create a new HashMap
		put("A", "O_");
		put("B", "O___");
		put("C", "O_O_");
		put("D", "O__");
		put("E", "O");
		put("F", "__O_");
		put("G", "__O");
		put("H", "OOOO");
		put("I", "OO");
		put("J", "O___");
		put("K", "O_O");
		put("L", "O_OO");
		put("M", "__");
		put("N", "_O");
		put("O", "___");
		put("P", "O__O");
		put("Q", "__O_");
		put("R", "O_O");
		put("S", "OOO");
		put("T", "_");
		put("U", "OO_");
		put("V", "OOO_");
		put("W", "O__");
		put("X", "_OO_");
		put("Y", "_O__");
		put("Z", "__OO");
		put("1", "O____");
		put("2", "OO___");
		put("3", "OOO__");
		put("4", "OOOO_");
		put("5", "OOOOO");
		put("6", "_OOOO");
		put("7", "__OOO");
		put("8", "___OO");
		put("9", "____O");
		put("0", "_____");
		put(" ", " ");
	}};

	private static final Map<String, String> textCode = new HashMap<>(); // Create a new HashMap

	static { // Add the morse code to the textCode HashMap
		morseCode.forEach((key, value) -> textCode.put(value, key));
	}

	public static String toMorse(String input){ // Create a method to convert the input to morse code
		StringBuilder morseStringBuilder = new StringBuilder(); // Create a new StringBuilder
		input = input.toUpperCase(); // Convert the input to uppercase
		for (char character : input.toCharArray()) { // For each character in the input
			String morseChar = morseCode.getOrDefault(String.valueOf(character), " "); // Get the morse code for the character
			morseStringBuilder.append(morseChar).append(" "); // Append the morse code to the StringBuilder
		}
		return morseStringBuilder.toString().trim(); // Return the StringBuilder as a string
	}

	public static String toEnglish(String input) { // Create a method to convert the input to english
		StringBuilder englishText = new StringBuilder(); // Create a new StringBuilder
		for (String morseCharacter : input.split(" ")) { // For each morse character in the input
			String englishCharacter = textCode.getOrDefault(morseCharacter, " "); // Get the english character for the morse character
			englishText.append(englishCharacter); // Append the english character to the StringBuilder
		}
		return englishText.toString().trim(); // Return the StringBuilder as a string
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Create a new Scanner
		while (true) { // While true
			System.out.println("Enter a word or sentence to translate to Morse code, or type 'exit' to exit: "); // Prompt the user to enter a word or sentence to translate to Morse code
			String input = scanner.nextLine(); // Get the user input
			if (input.equalsIgnoreCase("exit")) { // If the user input is "exit"
				break; // Break the loop
			}
			System.out.println("Morse code: " + toMorse(input)); // Print the Morse code for the user input

			System.out.println("Enter a Morse code to translate to English, or type 'exit' to exit: "); // Prompt the user to enter a Morse code to translate to English
			input = scanner.nextLine(); // Get the user input
			if (input.equalsIgnoreCase("exit")) { // If the user input is "exit"
				break; // Break the loop
			}
			System.out.println("English: " + toEnglish(input)); // Print the English translation for the Morse code
		}
		scanner.close(); // Close the scanner
	}
}


