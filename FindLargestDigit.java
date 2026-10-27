package com.whileloop;

public class FindLargestDigit {
	public static void main(String[] args) {
		int num=132453;
		int largest=0;
		while(num!=0) {
			int digit=num%10;
			if(digit>largest) {
				largest=digit;
			}
			num=num/10;
		}
		System.out.println(largest);
	}

}
