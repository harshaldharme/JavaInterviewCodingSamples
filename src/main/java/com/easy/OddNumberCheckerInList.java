package com.easy;

import java.util.List;

public class OddNumberCheckerInList {

	public static boolean onlyOddNumbers(List<Integer> list) {
		for (int i : list) {
			if (i % 2 == 0)
				return false;
		}
		return true;
	}
}
