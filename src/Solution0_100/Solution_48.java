package Solution0_100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Solution_48 {
	public static void main (String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer> ();
		nums.add(3);
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(2);
		nums.add(3);
		nums.add(3);
		nums.add(4);
		nums.add(4);
		nums.add(4);
//		for (int i = 0; i < nums.size(); i ++) {
//			int val = nums.get(i);
//			if (val == 2) {
//				nums.remove(val);
//			}
//		}
		Iterator<Integer> iter = nums.iterator();
		while (iter.hasNext()) {
			int val = iter.next();
			if (val == 2) {
				iter.remove();
//				nums.remove(val);
			}
		}
//		for(int val : nums) {
//			if (val == 2) {
//				nums.remove(val);
//			}
//		}
		System.out.println (nums.size());
//		Solution_48 test = new Solution_48();
//		int k = 3;
//		test.majorityNumber(nums, k);
	}
	public int majorityNumber(ArrayList<Integer> nums, int k) {
		if (nums == null) return Integer.MIN_VALUE;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i : nums) {
			if (hm.containsKey(i)) hm.put(i, hm.get(i) + 1);
			else hm.put(i, 1);
			if (hm.size() >= k) remove(hm);
		}
		reset(hm);
		for (int i : nums) {
			if (hm.containsKey(i)) hm.put(i, hm.get(i) + 1);
		}
		int max = Integer.MIN_VALUE;
		int ans = Integer.MIN_VALUE;
		Iterator<Integer> iter = hm.keySet().iterator();
		while (iter.hasNext()) {
			int key = iter.next();
			int val = hm.get(key);
			if (val > max) {
				max = val;
				ans = key;
			}
		}
		return ans;
	}
	public void reset (HashMap<Integer, Integer> hm) {
		Iterator<Integer> iter = hm.keySet().iterator();
		while (iter.hasNext()) {
			int val = iter.next();
			hm.put(val, 0);
		}
	}
	public void remove (HashMap<Integer, Integer> hm) {
		Iterator<Integer> iter = hm.keySet().iterator();
		List<Integer> removeList = new ArrayList<Integer> ();
		while (iter.hasNext()) {
			int val = iter.next();
			hm.put(val, hm.get(val) - 1);
			if (hm.get(val) == 0) {
//				removeList.add(val);
				hm.remove(val);
				hm.put(val, 1);
			}
		}
		for (int i : removeList) {
			hm.remove(i);
		}
	}
}
