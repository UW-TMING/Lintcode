package javaInterview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {
	public static void main (String[] args) {
		HashSet<Integer> hs = new HashSet<Integer> ();
		HashMap hm = new HashMap();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		Iterator<Integer> iter = hs.iterator();
		while (iter.hasNext()) {
			int first = iter.next();
			System.out.println (first);
			Iterator<Integer> iter2 = iter;
			while (iter2.hasNext()) {
				int k = iter2.next();
				System.out.println (k);
			}
		}
	}
}
