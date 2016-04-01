package Solution100_200;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution_152 {
	List<List<Integer>> ans = new ArrayList<List<Integer>> ();
	public List<List<Integer>> combine(int n, int k) {
		ArrayList<Integer> hs = new ArrayList<Integer> ();
		p(n, k, hs, 1);
		return ans;
    }
	public void p(int n, int k, ArrayList<Integer> res, int start) {
		if(res.size() == k) {
			ans.add(new ArrayList<Integer>(res));
			return;
		}
		for(int i = start; i <= n; i ++) {
			res.add(i);
			p(n, k, res, start + 1);
			res.remove(i);
		}
	}
}
