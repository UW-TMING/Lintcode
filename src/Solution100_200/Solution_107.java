package Solution100_200;

import java.util.HashSet;
import java.util.Set;

public class Solution_107 {
	public static void main (String[] args) {
		String s = "aaaaaaa";
		Set<String> dict = new HashSet<String> ();
		dict.add("aaa");
		dict.add("aaaa");
		Solution_107 test = new Solution_107 ();
		System.out.println(test.wordBreak(s, dict));
	}
	public boolean wordBreak(String s, Set<String> dict) {
		if (s == null || s.length() == 0) return false;
        return valid(0, s.length() - 1, s, dict);   
    }
	public boolean valid(int left, int right, String s, Set<String> dict) {
		if (left > right) return false;
		StringBuffer sb = new StringBuffer ();
		for (int i = left; i <= right; i ++) {
			sb.append(s.charAt(i));
			if(dict.contains(s.charAt(i))) {
				if (i == right) return true;
				else {
					boolean f = valid(i + 1, right, s, dict);
					if (f) return true;
				}
			}
		}
		return false;
	}
}
