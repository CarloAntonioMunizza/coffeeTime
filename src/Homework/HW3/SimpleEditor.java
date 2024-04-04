package Homework.HW3;

/*
Carlo Munizza Cam7134@psu.edu.
I declare that what has been written in this work has been written by me and that
no part has been copied from scientific publications, the Internet or from other
online sources or was already presented in the academic field by me or by other
students.
*/

import java.util.Scanner;

/*
 startEditing
 	Print a message to the console to let the user know that the editor has started.
 	Create a while loop that will run until the user decides to quit the editor.
 	Inside the while loop, prompt the user to enter text.
 	Use a switch statement to determine what to do with the input.
 	If the input is "##Replace##", call the replaceWord method.
 	If the input is "##Delete all Text##", call the deleteAllText method.
 	If the input is "##Resume Editing##", do nothing.
 	If the input is "##Quit##", call the quitEditor method.
 	If the input is anything else, append the input to the text.

 replaceWord
 	Prompt the user to enter the word they would like to replace.
 	Prompt the user to enter the word they would like to replace it with.
 	Use a while loop to find and replace all instances of the word in the text.
 	Print the text after the replacement.

 deleteAllText
 	Set the length of the text to 0.
 	Print a message to the console to let the user know that all text has been deleted.

 quitEditor
 	Print a message to the console to let the user know that the editor is quitting.
 	Print the final text to the console.
 	Exit the program.

 temp.main
 	Create a new SimpleEditor object and call the startEditing method.

*/

public class SimpleEditor {
	private StringBuilder text = new StringBuilder(); // Use StringBuilder to avoid creating a new String object each time text is modified
	private Scanner scanner = new Scanner(System.in); // Use a Scanner to get user input

	public void startEditing() {
		System.out.println("Simple Text Editor started. Type your text. Type '##OPTION##' to perform an option."); // Let the user know the editor has started

		while (true) { // Loop until the user decides to quit the editor
			String input = scanner.nextLine(); // Prompt the user to enter text

			switch (input) { // Use a switch statement to determine what to do with the input
				case "##Replace##": // If the input is "##Replace##", call the replaceWord method
					replaceWord(); // Call the replaceWord method
					break; // Break out of the switch statement
				case "##Delete all Text##": // If the input is "##Delete all Text##", call the deleteAllText method
					deleteAllText(); // Call the deleteAllText method
					break; // Break out of the switch statement
				case "##Resume Editing##": // If the input is "##Resume Editing##", do nothing
					System.out.println("Resuming editing..."); // Let the user know that editing is resuming
					break; // Break out of the switch statement
				case "##Quit##": // If the input is "##Quit##", call the quitEditor method
					quitEditor(); // Call the quitEditor method
					break; // Break out of the switch statement
				default: // If the input is anything else, append the input to the text
					text.append(input).append("\n"); // Append the input to the text
					break; // Break out of the switch statement
			}
		}
	}

	private void replaceWord() {
		System.out.println("Enter the word you would like to replace:"); // Prompt the user to enter the word they would like to replace
		String wordToReplace = scanner.nextLine(); // Get the word the user would like to replace
		System.out.println("Enter the word to replace it with:"); // Prompt the user to enter the word they would like to replace it with
		String replacementWord = scanner.nextLine(); // Get the word the user would like to replace it with

		int index = text.indexOf(wordToReplace); // Use a while loop to find and replace all instances of the word in the text

		while (index != -1) { // Loop until the word is not found
			text.replace(index, index + wordToReplace.length(), replacementWord); // Replace the word
			index += replacementWord.length(); // Move past the replacement
			index = text.indexOf(wordToReplace, index); // Find the next instance of the word
		}

		System.out.println("Text after replacement:"); // Print the text after the replacement
		System.out.println(text.toString()); // Print the text after the replacement
	}

	private void deleteAllText() {
		text.setLength(0); // Set the length of the text to 0
		System.out.println("All text deleted. Continue editing..."); // Let the user know that all text has been deleted
	}

	private void quitEditor() {
		System.out.println("Quitting editor. Final text:"); // Let the user know that the editor is quitting
		System.out.println(text.toString()); // Print the final text to the console
		System.exit(0); // Exit the program
	}

	public static void main(String[] args) {
		new SimpleEditor().startEditing(); // Create a new SimpleEditor object and call the startEditing method
	}
}
