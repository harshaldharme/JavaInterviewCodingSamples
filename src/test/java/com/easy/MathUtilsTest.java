package com.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void test() {
		MathUtils mathUtils = new MathUtils();
		int expected = 3;
		int actual = mathUtils.add(1, 1);
		
		assertEquals(expected, actual);
	}

}
