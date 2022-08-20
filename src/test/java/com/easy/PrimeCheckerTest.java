package com.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeCheckerTest {

	@Test
	void test() {
		int input = 7;
		assertTrue(PrimeChecker.isPrime(input));
	}

}
