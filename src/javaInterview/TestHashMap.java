package javaInterview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestHashMap {
	public static void main (String[] args) {
		ArrayList<String> st = new ArrayList<String> ();
		HashMap<String, String> hm = new HashMap();
		hm.put(null, "hello");
		hm.put("adf", "123");
		Iterator<String> iter = hm.keySet().iterator();
		hm.values();
		while (iter.hasNext()) {
			String key = iter.next();
			System.out.println (key + "--->" + hm.get(key));
		}
	}
}
