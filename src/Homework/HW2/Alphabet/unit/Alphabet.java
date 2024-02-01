package Homework.HW2.Alphabet.unit;

import java.util.Scanner;

/*
Carlo Munizza Cam7134@psu.edu.
I declare that what has been written in this work has been written by me and that
no part has been copied from scientific publications, the Internet or from other
online sources or was already presented in the academic field by me or by other
students.
*/

/*
	This program takes a letter from the user and determines if it is a vowel or a consonant.
	asks the user for a letter
	decides if the letter is a vowel or a consonant
	prints the result
*/

public class Alphabet {
	public static void main(String[] args) {
		Alphabet alphabet = new Alphabet();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input a letter of the alphabet: ");
		char letter = scanner.next().charAt(0);

		alphabet.decideIfVowelOrConsonant(letter);
	}

	public void decideIfVowelOrConsonant(char letter) {
		// send letter to lowercase
		letter = Character.toLowerCase(letter);

		if (isVowel(letter)) {
			System.out.println(letter +" is a vowel.");
		} else if (isConsonant(letter)) {
			System.out.println(letter +" is a consonant.");
		} else {
			System.out.println(letter +" is not a letter.");
		}
	}

	public boolean isVowel(char letter) {
		if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
			return true;
		} else {
			return false;
		}
	}

	public boolean isConsonant(char letter) {
		if (letter != 'a' && letter != 'e' && letter != 'i' && letter != 'o' && letter != 'u') {
			return true;
		} else {
			return false;
		}
	}

}
