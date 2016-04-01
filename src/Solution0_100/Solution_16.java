package Solution0_100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution_16 {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer> ();
		nums.add(2);
		nums.add(1);
		nums.add(4);
		Collections.sort(nums);
		for(int k : nums) System.out.print(k + " ");
		System.out.println();
	}
	public ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>> ();
	public ArrayList<ArrayList<Integer>> permuteUnique(ArrayList<Integer> nums) {
		if(nums == null || nums.size() == 0) return ans;
		int[] visit = new int[nums.size()];
		Collections.sort(nums);
		ArrayList<Integer> sol = new ArrayList<Integer> ();
		p(sol, nums, visit);
		return ans;
    }
	public void p(ArrayList<Integer> sol, ArrayList<Integer> nums, int[] visit) {
		if(sol.size() == nums.size()) {
			ans.add(new ArrayList<Integer> (sol));
			return;
		}
		for(int i = 0; i < nums.size(); i ++) {
			if(visit[i] == 1 || i != 0 && nums.get(i) == nums.get(i - 1) && visit[i - 1] == 1) {
				continue;
			}
			visit[i] = 1;
			sol.add(nums.get(i));
			p(sol, nums, visit);
			sol.remove(sol.size() - 1);
			visit[i] = 0;
		}
	}
}
