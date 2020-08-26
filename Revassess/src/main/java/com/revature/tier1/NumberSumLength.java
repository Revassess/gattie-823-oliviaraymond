package com.revature.tier1;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {
		
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
