package com.easy;

public class PalidromeChecker {

	public static boolean palidromeChecker(String in) {
		if (in == null)
			throw new IllegalArgumentException("Null is not valid input");

		StringBuilder reverse = new StringBuilder();

		char[] chars = in.toCharArray();

		for (int i = chars.length - 1; i >= 0; i--)
			reverse.append(chars[i]);

		return in.equals(reverse.toString());
	}
}
