package solution400_500;

import java.util.ArrayList;
import java.util.HashSet;

public class Solution_427 {
	ArrayList<String> ans = new ArrayList<String> ();
	public ArrayList<String> generateParenthesis(int n) {
		if (n <= 0) return ans;
		helper ("", n, n);
		return ans;
    }
	public void helper (String pare, int left, int right) {
		if (left == 0 && right == 0) { 
			ans.add(pare);
			return;
		}
		if (left > 0) {
			helper (pare + "(", left - 1, right);
		}
		if (right > 0 && left < right) {
			helper (pare + ")", left, right - 1);
		}
	}
}
