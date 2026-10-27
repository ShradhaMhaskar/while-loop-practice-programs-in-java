package com.whileloop;

public class CheckNumberIsPalindromeOrNot {
	public static void main(String[] args) {
		int num=1432;
		int original=num;
		int reverse=0;
		while(num>0) {
			int digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
		}
		if(original==reverse) {
			System.out.println("Number is palindrome...!");
		}else {
			System.out.println("Number is not a palindrome...!");
		}
	}

}
