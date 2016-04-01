package Solution0_100;

import java.util.ArrayList;
import java.util.HashSet;

public class Solution_15 {
	ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>> ();
	public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> nums) {
        ArrayList<Integer> sol = new ArrayList<Integer> ();
        if(nums == null) return ans;
        p(sol, nums);
        return ans;
    }
	public void p(ArrayList<Integer> sol, ArrayList<Integer> nums) {
		if(sol.size() == nums.size()) {
			ans.add(new ArrayList<Integer>(sol));
			return;
		}
		for(int i = 0; i < nums.size(); i ++) {
			boolean flag = false;
			for(int j = 0; j < sol.size(); j ++) {
				if(nums.get(i) == sol.get(j)) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				sol.add(nums.get(i));
				p(sol, nums);
				sol.remove(sol.size() - 1);
			}
		}
	}
}
