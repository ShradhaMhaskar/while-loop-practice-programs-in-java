package com.whileloop;

public class CountDivisibleby7 {
	public static void main(String[] args) {

		int i = 1;
		int count = 0;
		while (i <= 100) {
			if (i % 7 == 0) {
				count++;

			}
			i++;
		}
		System.out.println(count);
	}

}
