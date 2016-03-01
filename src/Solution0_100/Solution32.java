package Solution0_100;

import java.util.HashMap;
import java.util.Iterator;

public class Solution32 {
	
	public static void main (String []args) {
		String source = "ADOBECODEBANC";
		String target = "ABC";
		System.out.println (new Solution32().minWindow(source, target));
	}
	
	public boolean check (HashMap<Character, Integer> source, HashMap<Character, Integer> target) {
		Iterator iter = target.keySet().iterator();
		while (iter.hasNext()) {
			char c = (char)iter.next();
			if (!source.containsKey(c)) {
				return false;
			} else {
				int value = source.get(c);
				int value1 = target.get(c);
				if (value < value1) {
					return false;
				}
			}
		}
		return true;
	}
	
	public String minWindow(String source, String target) {
		HashMap<Character, Integer> sourceMap = new HashMap<Character, Integer> ();
		HashMap<Character, Integer> targetMap = new HashMap<Character, Integer> ();
		char[] sourceChar = source.toCharArray();
		char[] targetChar = target.toCharArray();
		for (char c : targetChar) {
			int value = 1;
			if (targetMap.containsKey(c)) {
				value = targetMap.get(c) + 1;
			}
			targetMap.put(c, value);
		}
		int min = Integer.MAX_VALUE;
		int j = 0;
		int i = 0;
		int temp_i = 0;
		int temp_j = 0;
		for (; i < sourceChar.length; i ++) {
			while (j < sourceChar.length) {
				if (check (sourceMap, targetMap)) {
					break;
				}
				int value = 1;
				if (sourceMap.containsKey(sourceChar[j])) {
					value = sourceMap.get(sourceChar[j]) + 1;
				}
				sourceMap.put(sourceChar[j ++], value);
			}
			if (check (sourceMap, targetMap)){
				if (min > j - i) {
					min = j - i;
					temp_i = i;
					temp_j = j;
				}
			}
			int temp = sourceMap.get(sourceChar[i]);
			sourceMap.put(sourceChar[i], temp - 1);
			temp = sourceMap.get(sourceChar[i]);
			if (temp == 0) {
				sourceMap.remove(sourceChar[i]);
			}
		}
		String str = "";
		if (min != Integer.MAX_VALUE) {
			for (int k = temp_i; k < temp_j; k ++) {
				str += sourceChar[k];
			}
		}
	    return str;
	}
}
