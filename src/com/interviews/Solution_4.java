package com.interviews;

public class Solution_4 {
	static int n = 0;
	static int sum = 0;
	public Solution_4() {
		n ++;
		sum += n;
	}
	public static int getSum() {
		return sum;
	}
}
class Test {
	public static void main (String[] args) {
		int temp = Integer.MIN_VALUE;
		System.out.println (temp>>31);
	}
}
