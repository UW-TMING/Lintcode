package com.interviews;

public class Solution_5 {
	public static void main (String[] args) {
		int a = 0;
		int b = 1;
		System.out.println (max (b, a));
	}
	public static int max (int a , int b) {
		if (a >>> 31 == 0 && b >>> 31 == 1) return a;
		if (a >>> 31 == 1 && b >>> 31 == 0) return b;
		return ((a -b) >>> 31) == 0 ? a : b;
	}
}
