package com.whileloop;

public class CountDigits {
	public static void main(String[] args) {
		int num = 12356467;
		int count = 0;
		while (num != 0) {
			count++;
			num = num / 10;

		}
		System.out.println(count);
	}

}
