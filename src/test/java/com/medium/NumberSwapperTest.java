package com.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberSwapperTest {

	@Test
	void test() {
		int input[] = {10, 20};
		int expected[] = {20, 10};
		int actual[] = NumberSwapper.swapNumbers(input);
		assertArrayEquals(expected, actual);
	}

}
