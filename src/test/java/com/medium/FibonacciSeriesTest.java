package com.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibonacciSeriesTest {

	@Test
	void test() {
		int input = 10;
		int expected = 55;
		int actual = FibonacciSeries.fibonacci(input);
		assertEquals(expected, actual);
	}

}
