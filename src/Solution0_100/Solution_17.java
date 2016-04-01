package Solution0_100;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution_17 {
	public ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>> ();
	public ArrayList<ArrayList<Integer>> subsets(int[] nums) {
        if(nums == null || nums.length == 0) return ans;
        ArrayList<Integer> sol = new ArrayList<Integer> ();
        Arrays.sort(nums);
        ans.add(sol);
        put(0, nums, sol);
        return ans;
    }
	public void put(int index, int[] nums, ArrayList<Integer> sol) {
		for(int i = index; i < nums.length; i ++) {
			sol.add(nums[i]);
			ans.add(new ArrayList<Integer> (sol));
			put(i + 1, nums, sol);
			sol.remove(sol.size() - 1);
		}
	}
}
