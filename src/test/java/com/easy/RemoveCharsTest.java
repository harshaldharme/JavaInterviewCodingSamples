package com.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveCharsTest {

	@Test
	void test() {
		String input = "abcdABCDabcdABCD";
		String expected = "bcdABCDbcdABCD";
		String actual = RemoveChars.removeCharacter(input);
		
		assertEquals(expected, actual);
	}

}
