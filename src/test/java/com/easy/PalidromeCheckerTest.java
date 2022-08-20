package com.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalidromeCheckerTest {

	@Test
	void test() {
		String input = "h";
		assertTrue(PalidromeChecker.palidromeChecker(input), "Check passed");
	}

}
