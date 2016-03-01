package Solution300_400;

import java.util.HashMap;

public class Solution_386 {
	public static void main (String []args) {
		String s = "eqgkcwGFvjjmxutystqdfhuMblWbylgjxsxgnoh";
		int k = 16;
		System.out.println (new Solution_386().lengthOfLongestSubstringKDistinct(s, k));
	}
	public int lengthOfLongestSubstringKDistinct(String s, int k) {
		if (k == 0) {
			return 0;
		}
		char[] str = s.toCharArray();
		HashMap<Character, Integer> source = new HashMap<Character, Integer> ();
		int count = 0;
		int j = 0;
		int max = Integer.MIN_VALUE;
		int i = 0;
		for (; i < str.length; i ++) {
			while (j < str.length) {
				if (k == count) {
					break;
				}
				int value = 1;
				if (source.containsKey(str[j])) {
					value = source.get(str[j]) + 1;
				} else {
					count ++;
				}
				source.put(str[j ++], value);
			}
			if (k == count) {
				if (max < j - i) {
					max = j - i;
				}
			}
			int temp = source.get(str[i]);
			if (temp == 1) {
				source.remove(str[i]);
				count --;
			} else {
				source.put(str[i], temp - 1);
			}
		}
        if (max == Integer.MIN_VALUE) {
        		return -1;
        }
        return max;
    }
	public void printHashMap (HashMap hm) {
//		Iterator iter = 
	}
}
