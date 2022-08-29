package com.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BubbleSorterTest {

	@Test
	void test() {
		int input[] = {3,60,35,2,45,320,5};
		int expected[] = {2,3,5,35,45,60,320};
		int actual[] = BubbleSorter.bubbleSort(input);
		assertArrayEquals(expected, actual);
	}

}
