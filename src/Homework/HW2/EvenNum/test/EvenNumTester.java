package Homework.HW2.EvenNum.test;

/*
Carlo Munizza Cam7134@psu.edu.
I declare that what has been written in this work has been written by me and that
no part has been copied from scientific publications, the Internet or from other
online sources or was already presented in the academic field by me or by other
students.
*/

import Homework.HW2.EvenNum.unit.EvenNum;
import Homework.HW2.EvenNum.utils.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class EvenNumTester {
	@Test
	void testRun(){
		//Given
		EvenNum evenNum = new EvenNum();

		//When
		int[] evenArray =  evenNum.run(2, 6);

		//Then
		assertEquals(2, evenArray[0]);
		assertEquals(4, evenArray[1]);
		assertEquals(6, evenArray[2]);
	}

	@Test
	void testStartIsNotNegative() {
		//Given
		EvenNum evenNum = new EvenNum();

		//When
		boolean isValid = evenNum.checkStart(1);

		//Then
		assertTrue(isValid);
	}

	@Test
	void testStartIsNegative() {
		//Given
		EvenNum evenNum = new EvenNum();

		//When
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> evenNum.checkStart(-1));

		//Then
		assertEquals("Start number less than 1", exception.getMessage());
	}

	@Test
	void testEndIsNotNegative() {
		//Given
		EvenNum evenNum = new EvenNum();

		//When
		boolean isValid = evenNum.checkEnd(1);

		//Then
		assertTrue(isValid);
	}

	@Test
	void testEndIsNegative() {
		//Given
		EvenNum evenNum = new EvenNum();

		//When
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> evenNum.checkEnd(-1));

		//Then
		assertEquals("End number less than 1", exception.getMessage());
	}

	@Test
	void testStartIsLessThanEnd() {
		//Given
		EvenNum evenNum = new EvenNum();

		//When
		boolean isValid = evenNum.checkStartAndEnd(0, 1);

		//Then
		assertTrue(isValid);
	}

	@Test
	void testStartIsGreaterThanEnd() {
		//Given
		EvenNum evenNum = new EvenNum();

		//When
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> evenNum.checkStartAndEnd(1, 0));

		//Then
		assertEquals("Start number is greater than end number", exception.getMessage());
	}

	@Test
	void testStartIsEqualToEnd() {
		//Given
		EvenNum evenNum = new EvenNum();

		//When
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> evenNum.checkStartAndEnd(1, 1));

		//Then
		assertEquals("Start number is equal to end number", exception.getMessage());
	}

	@Test
	void testEvenNumArrayIsValid() {
		//Given
		EvenNum evenNum = new EvenNum();

		//When
		int[] isValid = evenNum.evenNumArray(0, 6);

		//Then
		assertArrayEquals(new int[]{0, 2, 4, 6}, isValid);
	}

	@Test
	void testEvenNumArraySizeIsNotPositive() {
		//Given
		EvenNum evenNum = new EvenNum();

		//When
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> evenNum.evenNumArray(1,1));

		//Then
		assertEquals("Array size is less than 1", exception.getMessage());
	}

	@Test
	void testEvenNumArraySizeIsPositive() {
		//Given
		EvenNum evenNum = new EvenNum();

		//When
		int[] isValid = evenNum.evenNumArray(1, 2);

		//Then
		assertEquals(1, isValid.length);
	}

	@Test
	void testSumArrayIsValid() {
		//Given
		EvenNum evenNum = new EvenNum();

		//When
		int sum = evenNum.sumArray(new int[]{0, 2, 4, 6});

		//Then
		assertEquals(12, sum);
	}

	@Test
	void testSumArrayIsNotValid() {
		//Given
		EvenNum evenNum = new EvenNum();

		//When
		int sum = evenNum.sumArray(new int[]{0, 2, 4, 6});

		//Then
		assertNotEquals(10, sum);
	}

}
