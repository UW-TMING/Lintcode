package javaInterview;

import java.util.Hashtable;

public class TestHashTable {
	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("1", "hello");
		System.out.println (ht.get("1"));
	}
}
