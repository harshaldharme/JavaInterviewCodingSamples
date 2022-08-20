package com.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringReversalTest {

	@Test
	void test() {
		String expected = null;
		String actual = StringReversal.reverse(StringReversal.reverse(expected));
		assertEquals(expected, actual);
	}

}
