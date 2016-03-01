package javaInterview;

public class TestString {
	public static void main (String[] args) {
		String str = "abc";
		String str1 = "abc";
		System.out.println (str);
		System.out.println (str1);
//		System.out.println (str == str1);
		Person p = new Person();
		Person p1 = new Person();
		System.out.println (p == p1);
		System.out.println (p1);
		System.out.println (p);
		
	}
}
class Person {
	int i;
//	public String toString() {
//		return "1";
//	}
	public int hashCode () {
		return 1;
	}
}
