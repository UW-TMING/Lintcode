package com.interviews;

public class Solution_3 {
	public static void main (String[] args) {
		System.out.println (calcate(14, 29));
	}
	public static int calcate (int num1, int num2) {
		if (num2 == 0) return num1;
		int sum = num1 ^ num2;
		int carry = (num1 & num2) << 1;
		return calcate (sum, carry);
	}
}
