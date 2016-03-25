package Solution100_200;

import java.util.ArrayList;
import java.util.List;

public class Solution_136 {
	List<List<String>> ans = new ArrayList<List<String>> ();
	public List<List<String>> partition(String s) {
		List<String> res = new ArrayList<String> ();
		if(s == null || s.length() == 0) return ans;
		helper(s, 0, res);
		return ans;
    }
	public void helper(String s, int start, List<String> res) {
		if (start == s.length()) {
			ArrayList<String> temp = new ArrayList<String> ();
			copy(res, temp);
			ans.add(temp);
			return;
		}
		StringBuffer sb = new StringBuffer();
		for (int i = start; i < s.length(); i ++) {
			sb.append(s.charAt(i));
			if (valid(sb.toString())) {
				res.add(sb.toString());
				helper(s, i + 1, res);
				res.remove(res.size() - 1);
			}
		}
	}
	public boolean valid (String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) == s.charAt(j)) {
				i ++;
				j --;
			} else {
				return false;
			}
		}
		return true;
	}
	public void copy(List<String> source, List<String> object) {
		for (int i = 0; i < source.size(); i ++) {
			object.add(source.get(i));
		}
	}
}
