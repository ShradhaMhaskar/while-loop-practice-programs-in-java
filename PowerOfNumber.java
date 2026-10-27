package com.whileloop;

public class PowerOfNumber {
	public static void main(String[] args) {

		int base = 2;
		int exponent = 5;
		int result = 1;
		int i = 1;
		while (i <= exponent) {
			result = result * base;
			i++;

		}
		System.out.println("Power = " + result);
	}
	

}
