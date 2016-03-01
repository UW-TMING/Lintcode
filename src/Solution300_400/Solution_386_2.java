package Solution300_400;

import java.util.HashMap;
import java.util.Map;

public class Solution_386_2 {
	public static void main (String []args) {
		String s = "eqgkcwGFvjjmxutystqdfhuMblWbylgjxsxgnoh";
		int k = 16;
		System.out.println (new Solution_386_2().lengthOfLongestSubstringKDistinct(s, k));
	}
	
	public int lengthOfLongestSubstringKDistinct(String s, int k) {
		char[] str = s.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer> ();
		int i = 0;
		int j = 0;
		int max = 0;
		for (; i < str.length; i ++) {
			while(j < str.length) {
				if (hm.size() == k + 1) {
					break;
				}
				char c = str[j ++];
				if (hm.containsKey(c)) {
					hm.put (c, hm.get(c) + 1);
				} else {
					hm.put (c, 1);
				}
			}
			if (hm.size() == k + 1) {
				max = Math.max(max, j - i - 1);
			}
			Integer temp = hm.get(str[i]);
			if (temp == null) {
				return max;
			}
			if (temp > 1) {
				hm.put(str[i], temp - 1);
			} else {
				hm.remove(str[i]);
			}
		}
		return max;
	}
	
	public int lengthOfLongestSubstringKDistinct2(String s, int k) {
        // write your code here
   		int slow = 0;
		int maxLen = 0;

		// Key: letter; value: the number of occurrences.
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int fast;
		for (fast = 0; fast < s.length(); ++fast) {
			char c = s.charAt(fast);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
				while (map.size() > k) {
					char slowChar = s.charAt(slow++);
					int count = map.get(slowChar);
					if (count > 1) {
						map.put(slowChar, count - 1);
					} else {
						map.remove(slowChar);
					}
				}
			}

			maxLen = Math.max(maxLen, fast - slow + 1);
			
		}

		return maxLen;
	}
}
