package com.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalidromeCheckerTest {

	@Test
	void test() {
		String input = "haha";
		assertTrue(PalidromeChecker.palidromeChecker(input));
	}

}
