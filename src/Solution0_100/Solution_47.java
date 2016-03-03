package Solution0_100;

import java.util.ArrayList;

public class Solution_47 {
	public int majorityNumber(ArrayList<Integer> nums) {
		if (nums == null) return Integer.MIN_VALUE;
		if (nums.size() < 4) return nums.get(0);
		int temp1 = Integer.MIN_VALUE;
		int temp2 = Integer.MIN_VALUE;
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < nums.size(); i ++) {
		    int val = nums.get (i);
			if (val == temp1) {
				count1 ++;
			} else if (val == temp2) {
				count2 ++;
			} else if (count1 == 0) {
			    temp1 = val;
				count1 = 1;
			} else if (count2 == 0) {
			    temp2 = val;
				count2 = 1;
			} else {
			    count1 --;
			    count2 --;
			}
		}
		count1 = count2 = 0;
		for (int i = 0; i < nums.size(); i ++) {
			int val = nums.get(i);
			if (val == temp1) count1 ++;
			if (val == temp2) count2 ++;
		}
        return count1 > count2 ? temp1 : temp2;
    }
}
