package Solution300_400;

import java.util.HashMap;
import java.util.HashSet;

public class Solution_384 {
	public static void main (String []args) {
		System.out.println (new Solution_384().lengthOfLongestSubstring("abcabcbb"));
	}
	public int lengthOfLongestSubstring(String s) {
		HashSet<Character> hs = new HashSet ();
		char[] str = s.toCharArray();
		int j = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < str.length; i ++) {
			while (j < str.length) {
				if (hs.contains(str[j])) {
					break;
				}
				hs.add(str[j ++]);
			}
			if (max < j - i) {
				max = j - i;
			}
			hs.remove(str[i]);
		}
		if (max == Integer.MIN_VALUE) {
			return -1;
		}
        return max;
    }
}
