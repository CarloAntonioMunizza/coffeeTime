package Homework.HW2.Alphabet.test;

import Homework.HW2.Alphabet.unit.Alphabet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class alphabetTester {

	@Test
	void testVowelTrue() {
		//Given
		Alphabet alphabet = new Alphabet();

		//When
		boolean isVowel = alphabet.isVowel('a');

		//Then
		assertTrue(isVowel);
	}

	@Test
	void testVowelFalse() {
		//Given
		Alphabet alphabet = new Alphabet();

		//When
		boolean isVowel = alphabet.isVowel('b');

		//Then
		assertFalse(isVowel);
	}

	@Test
	void testConsonantTrue() {
		//Given
		Alphabet alphabet = new Alphabet();

		//When
		boolean isConsonant = alphabet.isConsonant('b');

		//Then
		assertTrue(isConsonant);
	}

	@Test
	void testConsonantFalse() {
		//Given
		Alphabet alphabet = new Alphabet();

		//When
		boolean isConsonant = alphabet.isConsonant('a');

		//Then
		assertFalse(isConsonant);
	}

	@Test
	void testIsLowerCaseTrue() {
		//Given
		Alphabet alphabet = new Alphabet();

		//When
		//boolean isLowerCase = alphabet.isLowerCase('a');

		//Then
		//assertTrue(isLowerCase);
	}

	@Test
	void testIsLowerCaseFalse() {
		//Given
		Alphabet alphabet = new Alphabet();

		//When
		//boolean isLowerCase = alphabet.isLowerCase('A');

		//Then
		//assertFalse(isLowerCase);
	}

}
