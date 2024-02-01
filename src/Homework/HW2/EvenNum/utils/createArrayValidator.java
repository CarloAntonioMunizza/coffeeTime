package Homework.HW2.EvenNum.utils;

import java.util.function.Predicate;

public class createArrayValidator implements Predicate<int[]> {
	@Override
	public boolean test(int[] arrayEven) {
		if (arrayEven.length == 0) {
			return false;
		}
		return true;
	}
}
