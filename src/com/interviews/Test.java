package com.interviews;

public class Test implements Cloneable{
	public static void main(String[] args) {
		//		int a = Integer.MAX_VALUE;
//		int b = 1;
//		System.out.println (a);
//		System.out.println(a + b);
//		System.out.println ((a + b) >>> 1);
//		long a1 = Integer.MAX_VALUE;
//		long a2 = b;
//		System.out.println ((a1 + a2) >>> 1);
		int a = 0X80000000;
		System.out.println (a);
		System.out.println (a>>>1);
		System.out.println (negate(null));
	}
	
	public static Boolean negate(Boolean bool) {
		if(bool == null) return null;
		return true;
	}
	
}
