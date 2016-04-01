package Solution100_200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_135 {
	
	public List<List<Integer>> ans = new ArrayList<List<Integer>> ();
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates == null || candidates.length == 0) return ans;
        Arrays.sort(candidates);
        ArrayList<Integer> sol = new ArrayList<Integer> ();
        put(0, candidates, target, 0, sol);
        return ans;
    }
	public void put(int index, int[] candidates, int target, int sum, ArrayList<Integer> sol) {
		if(sum == target) {
			ans.add(new ArrayList<Integer>(sol));
			return;
		}
		for(int i = index; i < candidates.length; i ++) {
			sum += candidates[i];
			sol.add(candidates[i]);
			if(sum <= target) {
				put(i, candidates, target, sum, sol);
			}
			sol.remove(sol.size() - 1);
			sum -= candidates[i];
		}
	}
}
