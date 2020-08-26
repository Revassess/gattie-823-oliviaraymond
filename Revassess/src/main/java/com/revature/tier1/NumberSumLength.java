package com.revature.tier1;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {

		// Create a method that, given an integer, can raise each digit to the power of
		// the overall length and return whether the sum of the powers is equal to the
		// original integer.
		
		return (getSum(num) == calculate(num));

	}

	static long calculate(long num) {
		String numberString = Long.toString(num);

		long sum = 0;
		long bp = (int) Math.pow(num, numberString.length());
		while (bp != 0) {
			long d = bp % 10;
			sum += d;
			bp /= 10;
		}
		return sum;
	}

	static long getSum(long n) {
		long sum = 0;
		while (n != 0) {
			sum = sum + n % 10;
			n = n / 10;
		}
		return sum;
	}
}
