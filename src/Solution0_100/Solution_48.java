package Solution0_100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution_48 {
	public static void main (String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer> ();
		hm.put(1, 1);
	}
	public int majorityNumber(ArrayList<Integer> nums, int k) {
        if (nums == null) return Integer.MIN_VALUE;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer> ();
        for (int i = 0; i < nums.size(); i ++) {
        		int val = nums.get(i);
        		if (hm.containsKey(val)) {
        			int count = hm.get(val);
        			hm.put(val, count + 1);
        		} else {
        			hm.put(val, 1);
        		}
//        		if (hm.size() >= k) removeKey(hm); 
        }
        return 0;
    }
	public void removeKey (ArrayList<Integer> nums) {
		List<Integer> remove = new ArrayList<Integer> ();
		for (int i = 0; i < nums.size(); i ++) {
			
		}
	}
}
