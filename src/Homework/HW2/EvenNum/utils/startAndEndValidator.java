package Homework.HW2.EvenNum.utils;

import java.util.function.BiPredicate;

public class startAndEndValidator implements BiPredicate<Integer, Integer> {


	@Override
	public boolean test(Integer start, Integer end) {
		return start < end;
	}


}
