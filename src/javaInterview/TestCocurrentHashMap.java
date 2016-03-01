package javaInterview;

import java.util.concurrent.ConcurrentHashMap;

public class TestCocurrentHashMap {
	public static void main (String[] args) { 
		ConcurrentHashMap chm = new ConcurrentHashMap ();
		chm.put(1, "hello");
		chm.get(1);
	}
}
