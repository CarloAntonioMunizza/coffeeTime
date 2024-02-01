package Homework.HW2.Shape.test;

import Homework.HW2.Shape.unit.ShapeMain;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/*
Carlo Munizza Cam7134@psu.edu.
I declare that what has been written in this work has been written by me and that
no part has been copied from scientific publications, the Internet or from other
online sources or was already presented in the academic field by me or by other
students.
*/

class ShapeTester {

	@Test
	void illegalChoice() {
		//Given
		ShapeMain shapeMain = new ShapeMain();

		assertThrows(IllegalArgumentException.class, () -> shapeMain.checkChoice(3));
		assertThrows(IllegalArgumentException.class, () -> shapeMain.checkChoice(0));
	}

	@Test
	void validChoice() {
		//Given
		ShapeMain shapeMain = new ShapeMain();

		assertEquals(1, shapeMain.checkChoice(1));
		assertEquals(2, shapeMain.checkChoice(2));
	}

	@Test
	void illegalWidth() {
		//Given
		ShapeMain shapeMain = new ShapeMain();

		assertThrows(IllegalArgumentException.class, () -> shapeMain.checkWidth(1));
	}

	@Test
	void validWidth() {
		//Given
		ShapeMain shapeMain = new ShapeMain();

		assertEquals(2, shapeMain.checkWidth(2));
		assertEquals(3, shapeMain.checkWidth(3));
	}
}
