package com.easy;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class OddNumberCheckerInListTest {

	@Test
	void test() {
		Integer intArray[] = {11,3,5,51};
		List<Integer> intList = Arrays.asList(intArray);
		assertTrue(OddNumberCheckerInList.onlyOddNumbers(intList));
	}

}
