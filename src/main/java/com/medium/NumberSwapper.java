package com.medium;

public class NumberSwapper {

	static int[] swapNumbers(int[] input) {
		int a = input[0];
		int b = input[1];
	    b = b + a;
		a = b - a;
		b = b - a;
		int[] output = {a, b};
		return output;
	}
}
